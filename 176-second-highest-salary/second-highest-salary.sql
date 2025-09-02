# Write your MySQL query statement below
select(select distinct s.salary
from Employee s
order by s.salary desc
limit 1 offset 1)
as SecondHighestSalary ;