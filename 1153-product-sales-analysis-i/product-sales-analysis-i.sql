# Write your MySQL query statement below

select p.product_name , s.year, s.price 
from sales as s
inner join product as p
on p.product_id = s.product_id;