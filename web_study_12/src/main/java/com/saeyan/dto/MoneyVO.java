package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*create table money_tbl_02(
	    custno number(6) not null,
	    salenol number(8) not null,
	    pcost number(8),
	    amount number(4),
	    price number(8),
	    pcode varchar2(4),
	    sdate date,
	    CONSTRAINT money_tbl_02_pk primary key(custno, salenol)
	);*/

@Getter @Setter @ToString
public class MoneyVO {
	public int custno;
	public int salenol;
	public int pcost;
	public int amount;
	public int price;
	public String pcode;
	public String sdate;
}
