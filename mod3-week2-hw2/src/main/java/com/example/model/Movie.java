package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;


@JsonIgnoreProperties
//ignores some json properties that you aren't using

@NoArgsConstructor
@AllArgsConstructor
@Data

/*
 * lombok:
 	public Movie() {
	super();
	
}
*/
public class Movie {
	private int movie_id;
	private String title;
	
}
