package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "calendertable")
public class CalenderEntity {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_id")
	private int id;
	@Column(name = "t_name")
	private String name;
}
