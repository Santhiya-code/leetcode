# Write your MySQL query statement below
-- select p.product_id,round(ifnull(sum(s.units*p.price)*1.0/ifnull(sum(s.units),0),0),2) as average_price
-- from prices p join unitssold s
-- on p.product_id=s.product_id
-- and s.purchase_date between p.start_date and p.end_date
-- group by s.product_id;
SELECT 
    p.product_id,
    ROUND(
        IFNULL(SUM(p.price * u.units) * 1.0 / NULLIF(SUM(u.units), 0), 0), 
        2
    ) AS average_price
FROM 
    Prices p
LEFT JOIN 
    UnitsSold u 
    ON p.product_id = u.product_id
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY 
    p.product_id;
