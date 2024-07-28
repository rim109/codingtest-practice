SELECT COUNT(*) AS FISH_COUNT, A.FISH_NAME FROM FISH_NAME_INFO A 
JOIN FISH_INFO B ON B.FISH_TYPE = A.FISH_TYPE
GROUP BY A.FISH_NAME
ORDER BY 1 DESC