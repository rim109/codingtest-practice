SELECT B.INGREDIENT_TYPE, SUM(A.TOTAL_ORDER) AS TOTAL_ORDER FROM FIRST_HALF A ,ICECREAM_INFO B
WHERE A.FLAVOR=B.FLAVOR
GROUP BY B.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC;