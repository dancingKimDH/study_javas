SELECT COUNT(T_STAT.RESPONDENTS_ID) AS CNT
FROM
(SELECT RESPONDENTS_ID, COUNT(*) AS CNT
FROM statistics
GROUP BY RESPONDENTS_ID
) AS T_STAT