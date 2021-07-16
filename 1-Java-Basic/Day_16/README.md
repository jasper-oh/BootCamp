
### 👉 test.sql Practice query 

```sql
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



-- employee_tbl 에서 이름별 id, name, 최대 타이핑수 출력 ?-?
select id,name, max(daily_typing_pages)
from employee_tbl
group by id, name;
```
> ⚡️ id 값을 같이 출력하려고 할때, 동명이인으로 판단하여, 최댓값을 나오게 하지 않고, 각각의 모든 값을 나오게 한다.
> pk 문제일까? where 문으로 해결할 수 있을까? + 추가) view 를 통해서도 가능할까?

```sql
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
```
### 👉 madang.sql Practice query 
--- 
```sql
use madang;

select bookname
from book
where bookid = "1";

select * from book;

select bookname
from book
where price >= 20000;

select * from book;


select c.name , sum(o.saleprice)
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid and c.name = "박지성";

select c.name, count(o.orderid)
from customer c , orders o
where c.name ='박지성' and o.custid= c.custid;

select c.name, count(distinct(b.publisher))
from customer c, orders o, book b
where c.name='박지성' and c.custid = o.custid and o.bookid = b.bookid;
```
> 🙌 new concept of "distinct" => 중복제거


```sql
select b.bookname, b.price, b.price - o.saleprice
from book b, orders o,customer c 
where c.name = "박지성" and b.bookid = o.bookid and c.custid = o.custid;

select orderid
from orders 
where date(orderdate) between "2014-07-04" and "2014-07-07";

select orderid
from orders 
where not orderdate between "2014-07-04" and "2014-07-07";
```
> 🙌 new concept of "not" orderdate

```sql
select name, address
from customer
where name like "김%";
```
> 🙌  like + "%" => 해당 문자를 무조건 포함한것을 보여준다.

```sql
select name, address
from customer
where name like "김%아";

select c.name, sum(b.price)
from customer c , book b, orders o
where c.custid = o.custid and o.bookid = b.bookid
group by c.name;


select * from customer;
select * from orders;

select c.name, c.address
from customer c
WHERE c.custid not in (SELECT o.custid FROM orders o WHERE c.custid = o.custid);
```
> little bit confused  🙌 new concept with sub-query && where something not in ( sub-query )  
> To use IN, you must have a set ... 

```sql
select c.name, o.custid
from orders o ,customer c
where c.custid = o.custid;

```



