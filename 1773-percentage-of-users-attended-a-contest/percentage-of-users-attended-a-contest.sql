# Write your MySQL query statement below
select r.contest_id,round(count(distinct r.user_id)*100.0/u.total_user,2) as percentage
from register r 
cross join(
 select count(*) as total_user from users
)u
group by r.contest_id
order by percentage desc,
r.contest_id ;