SELECT COUNT(USER_ID) AS USERS 
FROM USER_INFO 
WHERE TO_CHAR(JOINED,'YYYY-MM-DD') LIKE '2021%' AND AGE BETWEEN 20 AND 29;