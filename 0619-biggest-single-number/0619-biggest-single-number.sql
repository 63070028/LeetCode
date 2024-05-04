# Write your MySQL query statement below
select max(sn.num) as num
from (
    select num
    from MyNumbers
    group by num
    having count(num) = 1
) sn