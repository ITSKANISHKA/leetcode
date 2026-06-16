# Write your MySQL query statement below
SELECT E.name,b.bonus
FROM Employee E
LEFT JOIN Bonus b
ON E.empId=b.empId
WHERE b.bonus IS NULL OR b.bonus<1000 ;