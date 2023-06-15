/*SELECT column_name(s)
FROM table_name
WHERE condition
GROUP BY column_name(s)
ORDER BY column_name(s); */

SELECT COUNT(*) CNT
FROM (
SELECT RESPONDENTS_ID, COUNT(*) CNT
FROM statistics
GROUP BY RESPONDENTS_ID
) AS T_STATIC
;