# Numeric

Mobile application (IPhone, Android), for the management of all course alternations, i.e.:

    - work
    - taking turns on the territory and the kubrik
    - duty In addition, it is possible to create reports, record grades and credits, schedules, and reminders
# Start
All component start in Docker
MySql db for auth-service:

    docker run --name mysql-auth-service -p 3316:3306 -e MYSQL_ROOT_PASSWORD=dad -e MYSQL_DATABASE=auth_db -e MYSQL_USER=auth_admin -e MYSQL_PASSWORD=auth_admin -d mysql:latest
