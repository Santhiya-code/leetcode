# Write your MySQL query statement below
select s.sell_date,count(distinct s.product) as num_sold,
group_concat(distinct s.product order by s.product SEPARATOR ',')as products
from Activities s 
group by s.sell_date
order by s.sell_date;