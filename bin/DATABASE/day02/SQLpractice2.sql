-- 아래 문제는 'practice2' 데이터베이스 생성 후 진행 합니다.
DROP DATABASE IF EXISTS practice2;
CREATE DATABASE practice2;
USE practice2;

-- [문제 1]아래 조건에 맞는 members 테이블을 생성하는 SQL을 작성하세요.

-- 테이블명: members
DROP TABLE IF EXISTS members;
CREATE TABLE members(
    -- member_id (회원번호): 정수, Primary Key, 자동 증가
    member_id INT AUTO_INCREMENT PRIMARY KEY,
    -- member_name (회원이름): 문자열(50), NULL 허용 안함
    member_name VARCHAR(50) NOT NULL,
    -- email (이메일): 문자열(100), Unique, NULL 허용 안함
    email VARCHAR(100) NOT NULL UNIQUE,
    -- join_date (가입일): 날짜/시간, Default 현재 날짜/시간
    join_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    -- is_active (활성여부): 논리형(bool), Default true
    is_active BOOLEAN DEFAULT TRUE
);




-- [문제 2]
-- 아래 조건에 맞는 products 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: products
DROP TABLE IF EXISTS products;
CREATE TABLE products(
-- product_id (상품번호): 정수, Primary Key, 자동 증가
product_id INT AUTO_INCREMENT,
-- product_name (상품명): 문자열(100), NULL 허용 안함
product_name VARCHAR(100) NOT NULL,
-- price (가격): 정수, unsigned, NULL 허용 안함
price INT UNSIGNED NOT NULL ,
-- stock (재고수량): 정수, Default 0, NULL 허용 안함
stock INT NOT NULL DEFAULT 0,
-- created_at (등록일): 날짜/시간, Default 현재 날짜/시간
created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT PRIMARY KEY (product_id )
);




-- [문제 3]

-- 아래 조건에 맞는 orders 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: orders
CREATE TABLE orders(
-- order_id (주문번호): bigint, Primary Key, 자동 증가
order_id BIGINT AUTO_INCREMENT PRIMARY KEY,
-- member_id (회원번호): 정수, Foreign Key → members(member_id)
member_id INT, FOREIGN KEY (member_id) REFERENCES members(member_id),
-- order_date (주문일): 날짜/시간, Default 현재 날짜/시간
order_data DATETIME DEFAULT CURRENT_TIMESTAMP,
-- total_price (총금액): int unsigned, NULL 허용 안함
total_price INT UNSIGNED Not NULL
);


-- [문제 4]

-- 아래 조건에 맞는 order_items 테이블을 생성하는 SQL을 작성하세요.

-- 테이블명: order_items
-- 컬럼 정보
CREATE TABLE order_items(
-- item_id (항목번호): 정수, Primary Key, 자동 증가
item_id INT AUTO_INCREMENT PRIMARY KEY,
-- order_id (주문번호): bigint, Foreign Key → orders(order_id)
order_id BIGINT, FOREIGN KEY(order_id) REFERENCES orders(order_id),
-- product_id (상품번호): 정수, Foreign Key → products(product_id)
product_id INT, FOREIGN KEY(product_id) REFERENCES products(product_id),
-- quantity (수량): 정수, Default 1
quantity INT Default 1,
-- price (단가): int unsigned, NULL 허용 안함
price INT UNSIGNED NOT NULL
);


-- [문제 5]

-- 아래 조건에 맞는 students 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: students
-- 컬럼 정보
CREATE TABLE students(
-- student_id (학번): 문자열(10), Primary Key
student_id VARCHAR(10) PRIMARY KEY,
-- student_name (이름): 문자열(30), NULL 허용 안함
student_name VARCHAR(30) NOT NULL,
-- major (전공): 문자열(50)
major VARCHAR(50),
-- grade (학년): tinyint unsigned
grade TINYINT UNSIGNED,
-- enrolled_date (입학일): date
enrolled_date DATE
);



-- [문제 6]
-- 아래 조건에 맞는 employees 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: employees
-- 컬럼 정보
CREATE TABLE employees(
-- emp_id (사번): int, Primary Key, 자동 증가
emp_id INT AUTO_INCREMENT PRIMARY KEY,
-- emp_name (이름): varchar(40), NULL 허용 안함
emp_name VARCHAR(40)NOT NULL,
-- salary (급여): int unsigned, NULL 허용 안함
salary INT UNSIGNED NOT NULL,
-- hire_date (입사일): date, NULL 허용 안함
hire_date DATE NOT NULL,
-- department (부서): varchar(50)
department VARCHAR(50)
);



-- [문제 7]
-- 아래 조건에 맞는 boards 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: boards
-- 컬럼 정보
CREATE TABLE boards(
-- board_id (게시물번호): int, Primary Key, 자동 증가
board_id INT AUTO_INCREMENT PRIMARY KEY, 
-- title (제목): varchar(200), NULL 허용 안함
title VARCHAR(200) NOT NULL,
-- content (내용): text, NULL 허용 안함
content TEXT NOT NULL,
-- writer_id (작성자회원번호): int, Foreign Key → members(member_id)
writer_id INT, FOREIGN KEY (writer_id) REFERENCES members(member_id),
-- created_at (작성일): datetime, Default 현재 날짜/시간
created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);


-- [문제 8]
-- 아래 조건에 맞는 comments 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: comments
-- 컬럼 정보
CREATE TABLE comments(
-- comment_id (댓글번호): int, Primary Key, 자동 증가
comment_id INT AUTO_INCREMENT PRIMARY KEY,
-- board_id (게시물번호): int, Foreign Key → boards(board_id)
board_id INT, FOREIGN KEY(board_id) REFERENCES boards(board_id),
-- writer_id (작성자회원번호): int, Foreign Key → members(member_id)
writer_id INT, FOREIGN KEY(writer_id) REFERENCES members(member_id),
-- content (댓글내용): varchar(300), NULL 허용 안함
content VARCHAR(300) NOT NULL,
-- created_at (작성일): datetime, Default 현재 날짜/시간
created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);


-- [문제 9]
-- 아래 조건에 맞는 payments 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: payments
-- 컬럼 정보
CREATE TABLE payments(
 -- comment_id (댓글번호): int, Primary Key, 자동 증가
    comment_id INT AUTO_INCREMENT PRIMARY KEY,

    -- board_id (게시물번호): int, Foreign Key → boards(board_id)
    board_id INT,
    FOREIGN KEY (board_id) REFERENCES boards(board_id),

    -- writer_id (작성자회원번호): int, Foreign Key → members(member_id)
    writer_id INT,
    FOREIGN KEY (writer_id) REFERENCES members(member_id),

    -- content (댓글내용): varchar(300), NULL 허용 안함
    content VARCHAR(300) NOT NULL,

    -- created_at (작성일): datetime, Default 현재 날짜/시간
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);


-- [문제 10]
-- 아래 조건에 맞는 reviews 테이블을 생성하는 SQL을 작성하세요.
-- 테이블명: reviews
-- 컬럼 정보
CREATE Table reviews(
 -- review_id (리뷰번호): int, Primary Key, 자동 증가
    review_id INT AUTO_INCREMENT PRIMARY key,
-- product_id (상품번호): int, Foreign Key → products(product_id)
    product_id INT, 
    FOREIGN key (product_id) REFERENCES products(product_id),
-- member_id (회원번호): int, Foreign Key → members(member_id)
    member_id INT,
    Foreign Key (member_id) REFERENCES members(member_id),
-- rating (평점): rating NULL 허용 안함
    rating TINYINT UNSIGNED NOT NULL,
-- review_text (리뷰내용): text
    review_tex TEXT,
-- created_at (작성일): datetime, Default 현재 날짜/시간
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);