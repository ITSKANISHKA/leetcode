# Write your MySQL query statement below
SELECT class From Courses GROUP BY class Having Count(student)>=5;