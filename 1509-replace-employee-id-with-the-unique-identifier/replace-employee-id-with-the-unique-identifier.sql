# Write your MySQL query statement below
select e.name ,b.unique_id  from 
Employees e left join EmployeeUNI b
on e.id=b.id;