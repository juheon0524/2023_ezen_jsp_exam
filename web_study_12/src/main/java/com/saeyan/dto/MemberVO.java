package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*create table member_tb1_02(
	    custno number(6) not null PRIMARY key,
	    custname varchar2(20),
	    phone varchar2(13),
	    address varchar2(60),
	    joindate date,
	    grade char(1),
	    city char(2)
	);*/

@Getter @Setter @ToString
public class MemberVO {
	public int custno;
	public String custname;
	public String phone;
	public String address;
	public String date;
	public String grade;
	public String city;
}
