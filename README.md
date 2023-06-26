# 프로젝트 주요 기능

- 데이터베이스에 있는 선수 전체 조회
- 국가에 속한 선수 검색
- 신규 선수 데이터베이스에 등록
- 선수 데이터베이스 삭제
- 선수 정보 데이터 수정

# 데이터베이스
- 국가 테이블
CREATE TABLE countries (
countries_id INT AUTO_INCREMENT PRIMARY KEY,
countries_name VARCHAR(50) NOT NULL,
continent VARCHAR(50) NOT NULL
);
INSERT INTO countries (name, continent)
VALUES ('한국', '아시아');

INSERT INTO countries (name, continent)
VALUES ('일본', '아시아');

INSERT INTO countries (name, continent)
VALUES ('영국', '유럽');

INSERT INTO countries (name, continent)
VALUES ('프랑스', '유럽');

INSERT INTO countries (name, continent)
VALUES ('스페인', '유럽');

INSERT INTO countries (name, continent)
VALUES ('독일', '유럽');

INSERT INTO countries (name, continent)
VALUES ('미국', '북미');

INSERT INTO countries (name, continent)
VALUES ('브라질', '남미');

INSERT INTO countries (name, continent)
VALUES ('아르헨티나', '남미');

INSERT INTO countries (name, continent)
VALUES ('포르투갈', '유럽');

INSERT INTO countries (name, continent)
VALUES ('이탈리아', '유럽');

INSERT INTO countries (name, continent)
VALUES ('크로아티아', '유럽');

INSERT INTO countries (name, continent)
VALUES ('우루과이', '남미');

INSERT INTO countries (name, continent)
VALUES ('벨기에', '유럽');
commit;
 
- 선수 테이블
CREATE TABLE players (
players_id INT AUTO_INCREMENT PRIMARY KEY,
players_name VARCHAR(50) NOT NULL,
position VARCHAR(50) NOT NULL,
age INT,
club VARCHAR(100),
caps INT,
goals INT,
country_id INT,
FOREIGN KEY (country_id) REFERENCES countries(id)
);

-- 손흥민
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('손흥민', 'FW', 30, '토트넘 핫스퍼', 100, 30, 1);

-- 이강인
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('이강인', 'MF', 20, '파리생제르망', 25, 5, 1);

-- 김민재
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('김민재', 'DF', 28, '바이에른 뮌헨', 35, 9, 1);

-- 쿠보
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('쿠보', 'MF', 25, '소시에다드', 40, 12, 2);

-- 미나미노
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('미나미노', 'MF', 24, '리버풀', 30, 7, 2);

-- 해리 케인
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('해리 케인', 'FW', 28, '토트넘 핫스퍼', 90, 60, 3);

-- 벨링엄
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('벨링엄', 'MF', 24, '레알 마드리드', 40, 25, 3);

-- 스털링
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('스털링', 'FW', 27, '맨체스터 시티', 70, 30, 3);

-- 음바페
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('음바페', 'FW', 23, '파리 생제르맹', 50, 40, 4);

-- 그리즈만
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('그리즈만', 'FW', 30, '바르셀로나', 80, 25, 4);

-- 지루
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('지루', 'FW', 33, '맨체스터 유나이티드', 90, 40, 4);

-- 데헤아
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('데헤아', 'GK', 30, '바르셀로나', 50, 0, 5);

-- 부스케츠
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('부스케츠', 'MF', 32, '바르셀로나', 120, 10, 5);

-- 페드리
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('페드리', 'MF', 19, '바르셀로나', 40, 5, 5);

-- 하베르츠
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('하베르츠', 'MF', 22, '첼시', 60, 20, 6);

-- 뤼디거
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('뤼디거', 'DF', 28, '레알 마드리드', 70, 5, 6);

-- 풀리시치
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('풀리시치', 'MF', 25, '리버풀', 80, 15, 7);

-- 네이마르
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('네이마르', 'FW', 29, '파리 생제르맹', 90, 60, 8);

-- 비니시우스
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('비니시우스', 'FW', 21, '레알 마드리드', 50, 25, 8);

-- 티아고 실바
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('티아고 실바', 'MF', 26, '첼시', 40, 10, 8);

-- 파비뉴
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('파비뉴', 'MF', 36, '리버풀', 110, 20, 8);

-- 메시
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('메시', 'FW', 34, '파리 생제르맹', 150, 130, 9);

-- 맥알리스터
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('맥알리스터', 'MF', 31, '리버풀', 60, 10, 9);

-- 데폴
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('데폴', 'DF', 29, '아틀레티코 마드리드', 70, 5, 9);

-- 호날두
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('호날두', 'FW', 36, '알나스르', 170, 150, 10);

-- 브루노 페르난데스
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('브루노 페르난데스', 'MF', 26, '맨체스터 유나이티드', 60, 25, 10);

-- 베르나르도 실바
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('베르나르도 실바', 'MF', 26, '맨체스터 시티', 50, 15, 10);

-- 토날리
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('토날리', 'MF', 30, '뉴캐슬', 90, 25, 11);

-- 돈나룸마
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('돈나룸마', 'GK', 27, '파리 생제르맹', 60, 0, 11);

-- 보누치
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('보누치', 'MF', 26, '유벤투스', 70, 10, 11);

-- 모드리치
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('모드리치', 'MF', 36, '레알 마드리드', 120, 15, 12);

-- 페리시치
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('페리시치', 'MF', 28, '토트넘 핫스퍼', 90, 20, 12);

-- 수아레즈
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('수아레즈', 'FW', 34, '아틀레티코 마드리드', 100, 70, 13);

-- 누네스
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('누네스', 'FW', 24, '스포르팅 리스본', 40, 20, 13);

-- 발베르데
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('발베르데', 'MF', 23, '레알 마드리드', 30, 5, 13);

-- 아자르
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('아자르', 'FW', 31, '레알 마드리드', 90, 40, 14);

-- 루카쿠
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('루카쿠', 'FW', 28, '인터 밀란', 80, 50, 14);

-- 데브라이너
INSERT INTO players (name, position, age, club, caps, goals, country_id)
VALUES ('데브라이너', 'MF', 30, '맨체스터 시티', 100, 30, 14);
commit;