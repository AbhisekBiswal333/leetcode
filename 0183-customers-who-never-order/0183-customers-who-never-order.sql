# Write your MySQL query statement below
-- SELECT c.name as Customers
-- FROM Customers as c
-- LEFT JOIN Orders as o
-- ON c.id=o.customerId
-- WHERE o.id is NULL


SELECT c.name as Customers
FROM Customers as c
WHERE c.id NOT IN
(SELECT c.id
FROM Customers as c
INNER JOIN Orders as o
ON c.id=o.customerId)