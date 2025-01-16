SELECT TO_CHAR(SALES_DATE, 'YYYY') AS YEAR, 
       TO_NUMBER(TO_CHAR(SALES_DATE, 'MM')) AS MONTH, 
       A.GENDER AS GENDER, 
       COUNT(DISTINCT(A.USER_ID))AS USERS
FROM USER_INFO A 
INNER JOIN ONLINE_SALE B ON B.USER_ID = A.USER_ID
GROUP BY TO_CHAR(SALES_DATE, 'YYYY'), TO_NUMBER(TO_CHAR(SALES_DATE, 'MM')), A.GENDER
HAVING A.GENDER IS NOT NULL
ORDER BY YEAR, MONTH, GENDER;