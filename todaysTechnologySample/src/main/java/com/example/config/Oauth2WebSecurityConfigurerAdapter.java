package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Oauth2WebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    /**
     * Configure Oauth 2 server support
     *
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.oauth2ResourceServer()
                .jwt();
//        http.cors()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
    }

}
