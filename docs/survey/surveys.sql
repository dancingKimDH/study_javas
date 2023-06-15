/*SELECT column_name(s)
FROM table_name
WHERE condition
GROUP BY column_name(s)
HAVING condition
ORDER BY column_name(s); */

/* - 설문자 가능 명단(가입 완료)
1. 홍길동, 2.장길산, 3.신사임당, ... */

SELECT *
FROM respondents
;

-- 설문 시작
-------- 참조 : poll contents example -------------
/* 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
답) 1

2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
답) 2 */

/* 첫번째 반복패턴 찾기, 먼저 문항 ,다음 답항
응용과 db 다른점, 응용은 위에서 아래로 움직임, db는 집합적으로 움직임 , db가 중요함. */

SELECT *
FROM questions
;