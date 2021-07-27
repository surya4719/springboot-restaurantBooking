create database hotel1;
use hotel1;
create table reservation(id int(1) NOT NULL AUTO_INCREMENT primary key,
user_id int(1) NOT NULL,party_size tinyint(1) NOT NULL,
restaurant_id int(1) NOT NULL);
select * from reservation;
INSERT INTO reservation VALUES 
(1,100,2,800), 
(2,101,3,800), 
(3,102,5,800);
drop table reservation;
create table reservation(id int(1) NOT NULL AUTO_INCREMENT primary key,
user_id int(1) NOT NULL,party_size tinyint(1) NOT NULL,
restaurant_id int(1) NOT NULL);
INSERT INTO reservation VALUES 
(1,100,2,800), 
(2,101,3,800), 
(3,102,5,800);
drop table reservation;


