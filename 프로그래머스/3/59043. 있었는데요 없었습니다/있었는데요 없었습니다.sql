SELECT B.ANIMAL_ID, B.NAME
FROM ANIMAL_INS A JOIN ANIMAL_OUTS B
ON B.ANIMAL_ID = A.ANIMAL_ID
WHERE A.DATETIME > B.DATETIME
ORDER BY A.DATETIME