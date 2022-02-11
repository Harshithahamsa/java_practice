package com.te.hibernate.jpa.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sm_table")
public class SmartPhone implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sm_id")
	private int smId;

	@Column(name = "sm_name")
	private String smName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Call> callList;
	
}
