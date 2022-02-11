package com.te.hibernate.jpa.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	
	@OneToOne(mappedBy = "phone", cascade = CascadeType.ALL)
	private Person person;
}
