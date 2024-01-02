package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*create table movie (
	    code number(4),
	    title varchar2(50),
	    price number(10),
	    director varchar2(20),
	    actor varchar2(20),
	    poster varchar2(100),
	    synopsis varchar2(3000),
	    PRIMARY key (code)
	);*/

@Getter @Setter @ToString
public class MovieVO {
	private int code;
	private String title;
	private int price;
	private String director;
	private String actor;
	private String poster;
	private String synopsis;
}
