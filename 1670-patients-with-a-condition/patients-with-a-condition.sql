# Write your MySQL query statement below
select s.patient_id,s.patient_name,s.conditions
from Patients s 
where s.conditions like 'DIAB1%' or 
s.conditions like '% DIAB1%'; 