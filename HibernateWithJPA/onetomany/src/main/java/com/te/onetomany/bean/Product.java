package com.te.onetomany.bean;

import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "p_name")
	private String name;
	
	@Column(name = "p_price")
	private double price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	private Cart cart;

}
