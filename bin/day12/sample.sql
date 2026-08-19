-- day12 Exam 연동
DROP DATABASE IF EXISTS mydb0813;
CREATE DATABASE mydb0813;
use mydb0813;
CREATE Table board(
    no int AUTO_INCREMENT ,
    content VARCHAR(225) ,
    writer VARCHAR(30) ,
    constraint PRIMARY key(no)
    );
insert into board( content, writer )values( "안녕하세요", "유재석" ),( "하하", "강호동"); -- 샘플 데이터 2개 