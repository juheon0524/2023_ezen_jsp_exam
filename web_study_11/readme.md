create table board (
    num number(5) primary key,
    pass varchar2(30) not null,
    name varchar2(30) not null,
    email varchar2(30),
    title varchar2(50),
    content varchar2(1000),
    readcount number(4) default 0,
    writedate date default sysdate
);

CREATE  SEQUENCE board_seq start with 1 INCREMENT by 1;

select * from board;
commit;
insert into board(num, name, email, pass, title, content) 
values(board_seq.nextval, '성윤정', 'pink@name.com', '1234', '첫방문', '반갑습니다.');
insert into board(num, name, email, pass, title, content) 
values(board_seq.nextval, '전수빈', 'spring@name.com', '1234', '맛있어요', '반갑습니다.');
insert into board(num, name, email, pass, title, content) 
values(board_seq.nextval, '전원지', 'react@name.com', '1234', '일식', '반갑습니다.');
insert into board(num, name, email, pass, title, content) 
values(board_seq.nextval, '조조', 'java@name.com', '1234', '심국지', '반갑습니다.');
insert into board(num, name, email, pass, title, content) 
values(board_seq.nextval, '관우', 'javascript@name.com', '1234', '적토마', '반갑습니다.');

#커넥션 풀 설정
<Resource name="jdbc/myoracle" auth="Container"
type="javax.sql.DataSource"
driverClassName="oracle.jdbc.OracleDriver"
url="jdbc:oracle:thin:@127.0.0.1:1521:xe" username="scott"
password="tiger" maxTotal="20" maxIdle="10" maxWaitMillis="-1" />

-01_dbcp.jsp 적용
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();