create table movie (
    code number(4),
    title varchar2(50),
    price number(10),
    director varchar2(20),
    actor varchar2(20),
    poster varchar2(100),
    synopsis varchar2(3000),
    PRIMARY key (code)
);

create SEQUENCE movie_seq start with 1 increment by 1;
insert into movie values(movie_seq.nextval, '베를린', 10000, '류승완', '하정우', 'movie1.jpg','거대한 국제적 음모가 숨겨진 운명의 도시 베를린...');
insert into movie values(movie_seq.nextval, '박수건달', 10000, '조진규', '박신양,엄지원', 'movie2.jpg','건달로 사느냐, 무당으로 사느냐 그것이 문제로다...');
insert into movie values(movie_seq.nextval, '레미제라블', 10000, '톰후퍼', '휴 잭맨', 'movie3.jpg','빵 한조각을 훔친 죄로 19년의 감옥살이를 한...');
insert into movie values(movie_seq.nextval, '7번방의 선물', 5000, '이찬경', '류승룡', 'movie4.jpg','최악의 흉악범들이 모인 교도소 7번방에 이상한...');

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