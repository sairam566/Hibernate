drop table if exists student;
create table student (studentId integer not null, name varchar(255), joining_Date datetime(6), grade varchar(255), primary key (studentId)) engine=InnoDB;
