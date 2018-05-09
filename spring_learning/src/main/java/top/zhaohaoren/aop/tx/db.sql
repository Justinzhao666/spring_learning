CREATE DATABASE study_spring;
USE study_spring;
CREATE TABLE account(
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50),
  money INT
);
INSERT INTO account(username, money) VALUES('jack','1000');
INSERT INTO account(username, money) VALUES('rose','10000');

grant all privileges on *.* to 'root'@'%' identified by 'root' with grant option;
flush privileges;