package com.prospecta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Parameters {

	@Id
	String title;
	String description;
	String auth;
	boolean https;
	String cors;
	String category;

}
