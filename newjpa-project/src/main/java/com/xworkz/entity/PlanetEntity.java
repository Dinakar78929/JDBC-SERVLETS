package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class PlanetEntity {
	@Id
	private int id;
	private String name;
	private double distance;
	private double area; 
}
