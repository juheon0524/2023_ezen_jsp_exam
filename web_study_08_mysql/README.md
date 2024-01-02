create table member(
	name varchar(20) primary key,
    userid varchar(10) ,
    pwd varchar(10),
    email varchar(20),
    phone char(13),
    admin int default 0
);
insert into member values('이소미', 'somi', '1234','gmd@naver.com','010-111-2222',0);
insert into member values('하상우', 'sang12', '1234','aaa@naver.com','010-111-3333',1); 
insert into member values('김윤승', 'light', '1234','bbb@naver.com','010-111-4444',0);
select * from member;