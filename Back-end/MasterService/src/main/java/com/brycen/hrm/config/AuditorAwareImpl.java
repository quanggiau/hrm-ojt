package com.brycen.hrm.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;

import com.brycen.hrm.user.UserDetailsImpl;

/**
 * [Description]:Get userID for createBy of BaseEntity<br>
 * [ Remarks ]:<br>
 * [Copyright]: Copyright (c) 2020<br>
 * 
 * @author Brycen VietNam Company
 * @version 1.0
 */
public class AuditorAwareImpl implements AuditorAware<Long> {
    @Autowired
    AuthenticationManager authenticationManager;

    @Override
    public Optional<Long> getCurrentAuditor() {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<Long> id = Optional.ofNullable(userDetails.getId());
        return id;
    }

}
