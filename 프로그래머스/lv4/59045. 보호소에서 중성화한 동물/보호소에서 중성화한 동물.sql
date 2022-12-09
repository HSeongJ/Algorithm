-- 코드를 입력하세요
SELECT  i.animal_id,
        i.animal_type,
        i.name
FROM    animal_ins i
INNER JOIN animal_outs o ON i.animal_id = o.animal_id
AND i.sex_upon_intake != o.sex_upon_outcome