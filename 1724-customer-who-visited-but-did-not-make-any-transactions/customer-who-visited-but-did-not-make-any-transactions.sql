# Write your MySQL query statement below
select v.customer_id ,count(v.visit_id) as count_no_trans from 
Transactions t right join Visits v 
on t.visit_id = v.visit_id
where t.transaction_id is null
group by customer_id;