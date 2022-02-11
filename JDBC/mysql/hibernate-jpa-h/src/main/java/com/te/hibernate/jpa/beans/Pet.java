package com.te.hibernate.jpa.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pet_table")
public class Pet implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pet_id")
	private int petId;
	
	@Column(name = "pet_name")
	private String petName;
	
	@ManyToMany(mappedBy = "pets", cascade = CascadeType.ALL)
	private List<Human> humans;
}
