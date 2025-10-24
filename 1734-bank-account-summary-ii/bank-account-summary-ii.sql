# Write your MySQL query statement below
select u.NAME,sum(t.amount) as BALANCE
from users u left join transactions t 
on u.account=t.account
group by u.account 
having sum(t.amount)>10000
