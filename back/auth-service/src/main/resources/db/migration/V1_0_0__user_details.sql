create table auth_db.users(
    id_token varchar(100) primary key ,
    name varchar(5000) not null,
    surname varchar(5000) not null,
    patronymic varchar(5000) not null,
    rank varchar(5000) not null,
    position varchar(5000) not null,
    birth varchar(5000) not null,
    group int
);

INSERT INTO users (idToken, name, surname, patronymic, rank, position, birth)
VALUES ('', '', 'Doe', 'Ivanovich', 'Sergeant', 'Manager', '1990-01-01');