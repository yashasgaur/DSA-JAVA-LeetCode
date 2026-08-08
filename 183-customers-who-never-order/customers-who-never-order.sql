SELECT name AS Customers
FROM Customers AS a
LEFT JOIN Orders AS b
ON a.id = b.customerId
WHERE b.customerId IS NULL

-- UNION ALL

-- SELECT name AS Customers
-- FROM Customers AS a
-- RIGHT JOIN Orders AS b
-- ON a.id = b.customerId
-- WHERE a.id IS NULL