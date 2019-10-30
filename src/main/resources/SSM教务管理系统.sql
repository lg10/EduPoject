/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019-10-30 11:01:28                          */
/*==============================================================*/

-- 删除数据库
DELETE DATABASE blogjava;
-- 增加数据库
CREATE DATABASE blogjava
-- 使用数据库
USE blogjava
-- 删除数据表


drop table if exists classes;

drop table if exists inform;

drop table if exists payment;

drop table if exists score;

drop table if exists student;

drop table if exists teacher;

drop table if exists tlogs;

/*==============================================================*/
/* Table: classes                                               */
/*==============================================================*/
-- 增加数据表
create table classes
(
   cid                  INT not null auto_increment,
   title                VARCHAR(20),
   note                 VARCHAR(100),
   primary key (cid)
);

/*==============================================================*/
/* Table: inform                                                */
/*==============================================================*/
create table inform
(
   infid                INT not null auto_increment,
   informdate           DATETIME,
   status               INT,
   note                 VARCHAR(300),
   primary key (infid)
);

/*==============================================================*/
/* Table: payment                                               */
/*==============================================================*/
create table payment
(
   payid                INT not null auto_increment,
   sid                  VARCHAR(30),
   title                VARCHAR(50),
   price                FLOAT,
   paydate              DATETIME,
   note                 VARCHAR(200),
   primary key (payid)
);

/*==============================================================*/
/* Table: score                                                 */
/*==============================================================*/
create table score
(
   sid                  INT not null auto_increment,
   stu_sid              VARCHAR(30),
   subject              VARCHAR(50),
   scoredate            DATETIME,
   score                FLOAT,
   note                 VARCHAR(200),
   primary key (sid)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   sid                  VARCHAR(30) not null,
   cid                  INT,
   name                 VARCHAR(30),
   sex                  VARCHAR(30),
   age                  INT,
   phone                VARCHAR(30),
   address              VARCHAR(30),
   photo                VARCHAR(200),
   primary key (sid)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   tid                  VARCHAR(20) not null,
   cid                  INT,
   name                 VARCHAR(20),
   password             VARCHAR(32),
   age                  INT,
   phone                VARCHAR(20),
   photo                VARCHAR(20),
   email                VARCHAR(20),
   flag                 INT,
   lastdate             DATETIME,
   primary key (tid)
);

/*==============================================================*/
/* Table: tlogs                                                 */
/*==============================================================*/
create table tlogs
(
   tlid                 INT not null auto_increment,
   tid                  VARCHAR(20),
   logdatee             DATETIME,
   ip                   VARCHAR(200),
   primary key (tlid)
);

alter table payment add constraint FK_Reference_4 foreign key (sid)
      references student (sid) on delete restrict on update restrict;

alter table score add constraint FK_Reference_3 foreign key (stu_sid)
      references student (sid) on delete restrict on update restrict;

alter table student add constraint FK_Reference_1 foreign key (cid)
      references classes (cid) on delete restrict on update restrict;

alter table teacher add constraint FK_Reference_6 foreign key (cid)
      references classes (cid) on delete restrict on update restrict;

alter table tlogs add constraint FK_Reference_5 foreign key (tid)
      references teacher (tid) on delete restrict on update restrict;

-- 增加测试数据
INSERT INTO teacher (tid, name, password, photo,  flag) VALUE ('admin','小李','','myphoto.png','0')
-- 提交数据
COMMIT ;