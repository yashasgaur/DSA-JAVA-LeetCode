SELECT name, bonus 
FROM Employee AS a
LEFT JOIN Bonus AS b
ON a.empId = b.empId
WHERE bonus < 1000 OR bonus IS NULL;