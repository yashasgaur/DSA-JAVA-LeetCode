SELECT a.id AS Id
FROM Weather AS a
JOIN Weather AS b
ON a.recordDate = DATE_ADD(b.recordDate, INTERVAL 1 DAY)
WHERE a.temperature > b.temperature;