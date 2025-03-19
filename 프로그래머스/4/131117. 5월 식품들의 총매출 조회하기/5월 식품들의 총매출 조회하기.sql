SELECT A.PRODUCT_ID, B.PRODUCT_NAME, SUM(B.PRICE * A.AMOUNT) AS TOTAL_SALES 
FROM FOOD_ORDER A
JOIN FOOD_PRODUCT B ON B.PRODUCT_ID = A.PRODUCT_ID
WHERE A.PRODUCE_DATE >= '2022-05-01' AND A.PRODUCE_DATE < '2022-06-01'
GROUP BY A.PRODUCT_ID, B.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, A.PRODUCT_ID ASC;