SELECT T_CHO.CHOICE_ID, T_CHO.CHOICE
FROM question_choice AS T_QUES
INNER JOIN choice AS T_CHO
ON T_QUES.CHOICE_ID = T_CHO.CHOICE_ID
AND QUESTIONS_ID = 'Q1';