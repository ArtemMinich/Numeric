CREATE TABLE auth_db.users
(
    id_token   VARCHAR(100) PRIMARY KEY,
    name       VARCHAR(1000) NOT NULL,
    surname    VARCHAR(100)  NOT NULL,
    patronymic VARCHAR(100)  NOT NULL,
    military_rank      VARCHAR(100)  NOT NULL,
    position   VARCHAR(100)  NOT NULL,
    birth      VARCHAR(10)   NOT NULL,
    study_group    INT,
    role       VARCHAR(100)  NOT NULL
);

INSERT INTO users (id_token , name, surname, patronymic, military_rank, position, birth, study_group, role)
VALUES ('12', 'Artem', 'Minich', 'Sergiyovuch', 'Soldier', 'Cadet', '13.02.2005', 222, 'ROLE_ADMIN');