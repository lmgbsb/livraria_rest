/*==============================================================*/
/* DBMS name:      MySQL                                        */
/* Created on:     30/09/2021 12:39:12                          */
/*==============================================================*/


drop table if exists author;

drop table if exists book;

/*==============================================================*/
/* Table: author                                                */
/*==============================================================*/
create table author
(
   author_id            int not null auto_increment,
   name                 varchar(150),
   email                varchar(150),
   birth_date           date,
   mini_curriculum      text,
   primary key (author_id)
);

/*==============================================================*/
/* Table: book                                                  */
/*==============================================================*/
create table book
(
   book_id              int not null auto_increment,
   author_id            int not null,
   title                varchar(150),
   release_date         date,
   number_pages         int,
   primary key (book_id)
);

alter table book add constraint fk_reference_1 foreign key (author_id)
      references author (author_id) on delete restrict on update restrict;

