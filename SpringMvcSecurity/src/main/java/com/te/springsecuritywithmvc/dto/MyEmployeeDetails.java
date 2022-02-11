package com.te.springsecuritywithmvc.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyEmployeeDetails implements UserDetails {

	@Autowired
	private EmployeeDetails details;

	public MyEmployeeDetails(EmployeeDetails details) {
		super();
		this.details = details;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(details.getEmpRole());
		List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
		list.add(authority);
		return list;
	}

	@Override
	public String getPassword() {
		return details.getPassword();
	}

	@Override
	public String getUsername() {
		return details.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
