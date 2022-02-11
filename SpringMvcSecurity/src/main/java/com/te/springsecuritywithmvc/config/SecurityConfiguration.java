package com.te.springsecuritywithmvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.te.springsecuritywithmvc.service.EmployeeServiceImp;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private EmployeeServiceImp serviceImp;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(serviceImp);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().disable().csrf().disable()
		.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/welcome").hasAnyRole("USER","ADMIN").antMatchers("/","/register").permitAll().and()
		.formLogin().defaultSuccessUrl("/welcome").and().logout().logoutSuccessUrl("/");
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
