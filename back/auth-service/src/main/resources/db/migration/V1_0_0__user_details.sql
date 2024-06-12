create table auth_db.users(
    id_token varchar(100) primary key ,
    name varchar(1000) not null,
    surname varchar(100) not null,
    patronymic varchar(100) not null,
    rank varchar(100) not null,
    position varchar(100) not null,
    birth varchar(10) not null,
    group int,
    role varchar(100) not null
);

INSERT INTO users (idToken, name, surname, patronymic, rank, position, birth, group, role)
VALUES ('', 'Artem', 'Minich', 'Sergiyovuch', 'Soldier', 'Cadet', '13.02.2005', 222, "ROLE_ADMIN");