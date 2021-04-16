### MySql start


#### CLI
- terminal command 💻

Using Path


#### GUI

- MySql workbench 🐬

> < Command>

```sql
use education;
select * from student;
select sname,sdept from student;

-- Count the number of studuent
select count(*) from student;

-- Change the 
update student set scode = 'S001' where sname = '박소명';

select * from student where sdept = '컴퓨터공학과';

select * from professor;

select pname from professor where pdept = '컴퓨터공학과';

SET SQL_SAFE_UPDATES = 0;

select pname,pdept from professor where paddress = '서울';

--  professor 에서  전공이 국문학과 주소가 강원도인 교수님 출력하기
select * from professor where pdept = '국문학과' and paddress = '강원도';

-- professor table 을 이름 오름차순으로 정렬하기 뒤에 asc by default
select * from professor order by pname;

-- professor table 을 이름 기준으로 내림차순 정렬하기
select * from professor order by pname desc;

-- professor major ascending sorting && 1 dimension sorting m 2 dimension sorting
select * from professor order by pdept , pname;

-- Korean Literature dept professor's list with name sorting. Priority (where (first)<< order)
select * from professor where pdept = '국문학과' order by pname;

-- In professor table change kimgu to haeunyong
select * from professor;
update professor set pname = '하은용' where pcode ='P001';

-- In advice table, pcode  p007 record change to p005

select * from advise;
update advise set apcode = 'P005' where apcode ='p007';

-- Get lecture time 2 hours subject increase 1 hour and change labortory to  Lab1
select * from course;
update course set ctime ='3',croom ='LAB1' where ctime = '2'; 

-- delete

select * from student;
delete from student where sdept = '국문학과';

-- table 복사하기  ( 구조와 데이터 복사 )
create table if not exists `studentB` select * from `student`;
```





---


