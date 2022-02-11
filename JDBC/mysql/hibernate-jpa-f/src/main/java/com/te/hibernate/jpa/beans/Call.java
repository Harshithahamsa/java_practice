package com.te.hibernate.jpa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "call_table")
public class Call implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "call_id")
	private int callId;
	
	@Column(name = "call_number")
	private long callNumber;
	
	@Column(name = "call_username")
	private String callUserName;
}	
