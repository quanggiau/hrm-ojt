package com.brycen.hrm.eureka.zuul.GatewayService.security;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.brycen.hrm.eureka.zuul.GatewayService.security.jwt.AuthEntryPointJwt;
import com.brycen.hrm.eureka.zuul.GatewayService.security.jwt.AuthTokenFilter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthEntryPointJwt unauthorizedHandler;

     @Override
     protected void configure(HttpSecurity http) throws Exception {
     http.csrf().disable()
     // make sure we use stateless session; session won't be used to store user's state.
     .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
     // handle an authorized attempts
     .exceptionHandling().authenticationEntryPoint((req, rsp, e) -> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED)).and()
     // Add a filter to validate the tokens with every request
     .addFilterAfter(new AuthTokenFilter(), UsernamePasswordAuthenticationFilter.class)
     // authorization requests config
     .authorizeRequests()
     // allow all who are accessing "auth" service
     .antMatchers("/es/auth/**").permitAll()
     .antMatchers("/ms/auth/**").permitAll()
     // must be an admin if trying to access admin area (authentication is also required here)
     // Any other request must be authenticated
     .anyRequest().authenticated();
     }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and().sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
//                .antMatchers("/es/auth/**").permitAll()
//                .antMatchers("/ms/auth/**").permitAll()
//                .anyRequest().authenticated();
//
//        http.addFilterBefore(new AuthTokenFilter(), UsernamePasswordAuthenticationFilter.class);
//    }

}
