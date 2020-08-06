package com.brycen.hrm.masterservice.ms000000Login;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brycen.hrm.common.base.BaseResponse;
import com.brycen.hrm.constant.LogValue;
import com.brycen.hrm.constant.UrlAPI;
import com.brycen.hrm.entity.RoleEntity;
import com.brycen.hrm.entity.UserEntity;
import com.brycen.hrm.logger.ILogger;
import com.brycen.hrm.logger.LogLevel;
import com.brycen.hrm.repository.RoleEntityIRepository;
import com.brycen.hrm.repository.UserEntityIRepository;
import com.brycen.hrm.security.jwt.JWTUtils;
import com.brycen.hrm.user.UserDetailsImpl;

@RestController
public class MS000000LogInController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JWTUtils jwtUtils;
    
    @Autowired
    ILogger iLogger;
    
    @Autowired
    UserEntityIRepository userIRepository;
    
    @Autowired
    RoleEntityIRepository roleIRepository;
    
    /**
     * [Description]:Check info login of user <br/>
     * [ Remarks ]:<br/>
     *
     * @param loginRequest
     * @return MS000000LogInResponse
     */
    @PostMapping(value = "/auth/" + UrlAPI.MS000000_LOGIN)
    public ResponseEntity<?> ms000000Login(@RequestBody MS000000LogInRequest loginRequest) {
        
        iLogger.write(LogLevel.INFOMATION, UrlAPI.MS000000_LOGIN, loginRequest, null, LogValue.BEGIN_API);

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
//        List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority()).collect(Collectors.toList());
//        List<Integer> roleValues = userDetails.getListRoleValue();
        UserEntity userEntity = userIRepository.findByUserID(userDetails.getId());
        Long employeeID = userEntity.getEmployee().getEmployeeID();
        
        List<RoleEntity> roles = roleIRepository.findByRoleName(userDetails.getRoleName());
        List<MS000000RoleResponse> role = roles.stream().map(MS000000RoleResponse::new).collect(Collectors.toList());
        
        BaseResponse baseReponse = new BaseResponse();
        baseReponse.setContent(new MS000000LogInResponse(jwt, userDetails.getId(), userDetails.getUsername(), employeeID, role));
        
        iLogger.write(LogLevel.INFOMATION, UrlAPI.MS000000_LOGIN, loginRequest, baseReponse, LogValue.END_API);
        
        return ResponseEntity.ok(baseReponse);
    }
}