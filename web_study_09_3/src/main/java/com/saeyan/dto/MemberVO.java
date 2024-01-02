package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*create table employees(
	    id varchar2(10) not null,
	    pass varchar2(10) not null,
	    name varchar2(24),
	    lev char(1) default 'A', --A : 운영자, B : 일반회원
	    enter date DEFAULT sysdate,
	    gender char(1) DEFAULT '1', --1 : 남자 , 2 : 여자
	    phone varchar2(30),
	    primary key(id)
	);*/
@Getter @Setter @ToString
public class MemberVO {
	private String id;
	private String pass;
	private String name;
	private String lev;
	private String gender;
	private String phone;
}
