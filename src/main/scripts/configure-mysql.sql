## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE filo_dev;
CREATE DATABASE filo_prod;

#Create database service accounts
CREATE USER 'filo_dev_user'@'localhost' IDENTIFIED BY 'filodev';
CREATE USER 'filo_prod_user'@'localhost' IDENTIFIED BY 'filoprod';
CREATE USER 'filo_dev_user'@'%' IDENTIFIED BY 'guru';
CREATE USER 'filo_prod_user'@'%' IDENTIFIED BY 'guru';

#Database grants
GRANT SELECT ON filo_dev.* to 'filo_dev_user'@'localhost';
GRANT INSERT ON filo_dev.* to 'filo_dev_user'@'localhost';
GRANT DELETE ON filo_dev.* to 'filo_dev_user'@'localhost';
GRANT UPDATE ON filo_dev.* to 'filo_dev_user'@'localhost';
GRANT SELECT ON filo_prod.* to 'filo_prod_user'@'localhost';
GRANT INSERT ON filo_prod.* to 'filo_prod_user'@'localhost';
GRANT DELETE ON filo_prod.* to 'filo_prod_user'@'localhost';
GRANT UPDATE ON filo_prod.* to 'filo_prod_user'@'localhost';
GRANT SELECT ON filo_dev.* to 'filo_dev_user'@'%';
GRANT INSERT ON filo_dev.* to 'filo_dev_user'@'%';
GRANT DELETE ON filo_dev.* to 'filo_dev_user'@'%';
GRANT UPDATE ON filo_dev.* to 'filo_dev_user'@'%';
GRANT SELECT ON filo_prod.* to 'filo_prod_user'@'%';
GRANT INSERT ON filo_prod.* to 'filo_prod_user'@'%';
GRANT DELETE ON filo_prod.* to 'filo_prod_user'@'%';
GRANT UPDATE ON filo_prod.* to 'filo_prod_user'@'%';