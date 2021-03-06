
### π test.sql Practice query 

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

-- prospect first name κ³Ό customer μ μ±μ΄ κ°μ κ²½μ° 
select a.first_name, a.last_name from customer a, prospect b where a.first_name = b.fname;

-- employee_tbl μμ μ΄λ¦μ΄ zara μΈμ¬λμ λͺλͺμΈκ°

select * from employee_tbl;
select name, count(*)
from employee_tbl where name = "zara";

-- employee_tbl μμ μ΅λ νμ΄ν νμ΄μ§ μλ?
select max(e.daily_typing_page)
from employee_tbl;



-- employee_tbl μμ μ΄λ¦λ³ id, name, μ΅λ νμ΄νμ μΆλ ₯ ?-?
select id,name, max(daily_typing_pages)
from employee_tbl
group by id, name;
```
> β‘οΈ id κ°μ κ°μ΄ μΆλ ₯νλ €κ³  ν λ, λλͺμ΄μΈμΌλ‘ νλ¨νμ¬, μ΅λκ°μ λμ€κ² νμ§ μκ³ , κ°κ°μ λͺ¨λ  κ°μ λμ€κ² νλ€.
> pk λ¬Έμ μΌκΉ? where λ¬ΈμΌλ‘ ν΄κ²°ν  μ μμκΉ? + μΆκ°) view λ₯Ό ν΅ν΄μλ κ°λ₯ν κΉ?

```sql
-- employee_tbl μμ μ΄λ¦λ³ name, μ΅μ νμ΄νμ
select name, min(daily_typing_pages)
from employee_tbl 
group by name;

-- employee_tbl μμ μ΄λ¦λ³ name νμ΄νμ ν©κ³ κ΅¬νκΈ°
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
### π madang.sql Practice query 
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
where c.custid = o.custid and o.bookid = b.bookid and c.name = "λ°μ§μ±";

select c.name, count(o.orderid)
from customer c , orders o
where c.name ='λ°μ§μ±' and o.custid= c.custid;

select c.name, count(distinct(b.publisher))
from customer c, orders o, book b
where c.name='λ°μ§μ±' and c.custid = o.custid and o.bookid = b.bookid;
```
> π new concept of "distinct" => μ€λ³΅μ κ±°


```sql
select b.bookname, b.price, b.price - o.saleprice
from book b, orders o,customer c 
where c.name = "λ°μ§μ±" and b.bookid = o.bookid and c.custid = o.custid;

select orderid
from orders 
where date(orderdate) between "2014-07-04" and "2014-07-07";

select orderid
from orders 
where not orderdate between "2014-07-04" and "2014-07-07";
```
> π new concept of "not" orderdate

```sql
select name, address
from customer
where name like "κΉ%";
```
> π  like + "%" => ν΄λΉ λ¬Έμλ₯Ό λ¬΄μ‘°κ±΄ ν¬ν¨νκ²μ λ³΄μ¬μ€λ€.

```sql
select name, address
from customer
where name like "κΉ%μ";

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
> little bit confused  π new concept with sub-query && where something not in ( sub-query )  
> To use IN, you must have a set ... 

```sql
select c.name, o.custid
from orders o ,customer c
where c.custid = o.custid;

```



