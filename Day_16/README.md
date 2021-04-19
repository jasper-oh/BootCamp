
use test;
select * from employee_tbl;
select count(*) from employee_tbl;
select name, count(*) from employee_tbl group by name;


-- upper and below things all same 
select * from employee_tbl where daily_typing_pages = 250 or daily_typing_pages = 220 or daily_typing_pages = 170;
select * from employee_tbl where daily_typing_pages in (250,220,170);


-- upper and below things all same but the below thing is faster.
select * from employee_tbl where daily_typing_pages  >= 170 and daily_typing_pages <= 300;
select * from employee_tbl where daily_typing_pages between 170 and 300;

-- all below things are like schema
select * from prospect;
select * from customer;
select * from vendor;

-- Union 

select fname,lname, addr from prospect
union 
select first_name, last_name, address from customer
union 
select company,'', street from vendor;

-- prospect first name 과 customer 의 성이 같은 경우 
select a.first_name, a.last_name from customer a, prospect b where a.first_name = b.fname;

-- employee_tbl 에서 이름이 zara 인사람은 몇명인가

select * from employee_tbl;
select name, count(*)
from employee_tbl where name = "zara";

-- employee_tbl 에서 최대 타이핑 페이지 수는?
select max(e.daily_typing_page)
from employee_tbl;


-- employee_tbl 에서 이름별 id, name, 최대 타이핑수 출력 오류 ..?
select id,name, max(daily_typing_pages)
from employee_tbl
group by id, name;



-- employee_tbl 에서 이름별 name, 최소 타이핑수
select name, min(daily_typing_pages)
from employee_tbl 
group by name;

-- employee_tbl 에서 이름별 name 타이핑수 합계 구하기
select name, sum(daily_typing_pages) from employee_tbl group by name;
select name, sum(daily_typing_pages), sum(daily_typing_pages) * 500 as fee from employee_tbl group by name;

-- etc

select 1+2;
select sqrt(16);
select rand();
select * from employee_tbl order by rand();
select concat(id, name, workdate) from employee_tbl;
select now();
select adddate('2021-04-19',interval 20 day);
select adddate('2021-04-19',20);
select curdate();
select curdate() + 20;
select curtime();
select dayname('2021-04-19');
select dayname(now());
select timediff('2021-04-19 12:00:00','2021-01-01 12:00:00');
select datediff('2021-04-20 ',now());

select abs(-2);
select ceil(7.55);
select floor(7.55);
select round(7.45);
select mod(29,3);
select power(2,3);
select truncate(7.546123,2);
select insert('abcdefg',3,5,'1234');
select trim('    1234    ');
select replace('111.google.com',1,'w');
select reverse('4321');

-- false : -1
select strcmp('aaa','aab');

-- true : 0
select strcmp('aaa','aaa');

select substring('abcdefg',5);

select substring('abcdefg',1,3);



