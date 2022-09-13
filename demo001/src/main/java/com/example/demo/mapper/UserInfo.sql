create table user_info(
 id character varying(100) not null
 ,name character varying(100) not null
 ,age character varying(100) not null
 ,job character varying(100) not null
 ,primary key (id)
);

drop table user_info;

insert into user_info(id,name,age,job)values('01','kin','10','art');

select * from user_info;
