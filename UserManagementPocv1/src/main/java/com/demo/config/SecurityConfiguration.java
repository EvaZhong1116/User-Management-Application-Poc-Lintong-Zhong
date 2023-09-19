package com.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
@EnableWebSecurity

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
    DataSource dataSource;
	
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//       http
//        	.authorizeRequests().antMatchers("/**").permitAll()
//        		.and()
//            .formLogin()
//            	.loginPage("/login") // Customize the login page URL
//            	.and()
//            .oauth2Login()
//                .defaultSuccessUrl("/welcome") // Customize the success URL
//                .and()
//            .logout()
//            	.permitAll();
    	http
        .authorizeRequests()
            .antMatchers("/register").permitAll()
            .antMatchers("/welcome", "/getEmployees").permitAll()
            .antMatchers("/addNewEmployee").permitAll()
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/customizelogin").permitAll()
            .and()
        .oauth2Login()
            .defaultSuccessUrl("/welcome")
            .and()
        .logout()
            .permitAll()
            .and()
            
        .csrf().disable();
    }
    
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
      return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    
 // Enable JDBC Authentication
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
              auth.jdbcAuthentication().dataSource(dataSource);
         }
    
    @Bean
    public JdbcUserDetailsManager jdbcUserDetailsManager() throws Exception {
    JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
              jdbcUserDetailsManager.setDataSource(dataSource);
    return jdbcUserDetailsManager; }

}