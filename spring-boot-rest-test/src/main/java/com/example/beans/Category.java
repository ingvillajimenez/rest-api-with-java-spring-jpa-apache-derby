package com.example.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "Category")
public class Category {

	@Id
	private int Id;
	
	@Column(name = "CategoryName")
	private String CatagoryName;

}
