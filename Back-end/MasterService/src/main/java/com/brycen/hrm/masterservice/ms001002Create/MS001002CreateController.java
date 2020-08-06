package com.brycen.hrm.masterservice.ms001002Create;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brycen.hrm.constant.UrlAPI;
import com.brycen.hrm.entity.RoleEntity;
import com.brycen.hrm.entity.UserEntity;
import com.brycen.hrm.repository.RoleEntityIRepository;
import com.brycen.hrm.repository.UserEntityIRepository;
import com.brycen.hrm.security.jwt.JWTUtils;

@RestController
public class MS001002CreateController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserEntityIRepository userEntityRepository;

    @Autowired
    RoleEntityIRepository roleEntityRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JWTUtils jwtUtils;

    /**
     * [Description]: Create User login system<br/>
     * [ Remarks ]:<br/>
     *
     * @param createUserRequest
     * @return
     */
    @PostMapping(value = "/auth/" + UrlAPI.MS001002_CREATE_USER)
    public ResponseEntity<?> ms001002CreateUser(@RequestBody MS001002CreateRequest createUserRequest) {
        // if (userRepository.existsByUsername(signUpRequest.getUsername())) {
        // return ResponseEntity
        // .badRequest()
        // .body(new MessageResponse("Error: Username is already taken!"));
        // }
        //
        // if (userRepository.existsByEmail(signUpRequest.getEmail())) {
        // return ResponseEntity
        // .badRequest()
        // .body(new MessageResponse("Error: Email is already in use!"));
        // }

        // Create new user's account
        UserEntity user = new UserEntity(createUserRequest.getUsername(), encoder.encode(createUserRequest.getPassword()));
//        Set<Long> strRoles = createUserRequest.getListRole();
//        Set<RoleEntity> roles = new HashSet<>();
//        strRoles.forEach(role -> {
//            RoleEntity roleUser = roleEntityRepository.findById(role).get();
//            roles.add(roleUser);
//        });
//
//        user.setListRole(roles);
        RoleEntity roleUser = roleEntityRepository.findById(createUserRequest.getRoleID()).get();
        user.setRole(roleUser);
        userEntityRepository.save(user);

        return ResponseEntity.ok("User registered successfully!");
    }
}
