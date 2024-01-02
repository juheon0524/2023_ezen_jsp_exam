package com.ezen.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MemberVO {
	private int custNo;
	private String custName;
	private String phone;
	private String address;
	private String joinDate;
	private String grade;
	private String city;
}
