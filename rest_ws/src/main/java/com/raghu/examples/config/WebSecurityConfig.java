package com.raghu.examples.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
      auth
        .inMemoryAuthentication()
          .withUser("raghu").password("raman").roles("USER");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); //support non-browser
        http.authorizeRequests()
        .antMatchers("/data/**").access("hasRole('ROLE_USER')").anyRequest().authenticated().and().httpBasic();
    }

}
