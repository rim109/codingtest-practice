SELECT A.PRODUCT_ID, B.PRODUCT_NAME, SUM(B.PRICE * A.AMOUNT) AS TOTAL_SALES 
FROM FOOD_ORDER A
JOIN FOOD_PRODUCT B ON B.PRODUCT_ID = A.PRODUCT_ID
WHERE A.PRODUCE_DATE LIKE '2022-05%'
GROUP BY A.PRODUCT_ID	
ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC