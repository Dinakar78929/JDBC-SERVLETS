package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "planet")
@NamedQuery(name="findAll" ,query ="select planet from PlanetEntity as planet")
@NamedQuery(name="findByName", query = "select planet from PlanetEntity as planet where planet.name=:byName")
@NamedQuery(name="findByArea" , query = "select planet from PlanetEntity as planet where planet.area=:byArea")
public class PlanetEntity {
	@Id
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_distance")
	private int distance;
	@Column(name = "p_area")
	private int area;
}
