drop table if exists `ebook`;
create table `ebook` (
                         `id` bigint not null comment 'id',
                         `name` varchar(50) comment 'name',
                         `category1_id` bigint comment 'category1',
                         `category2_id` bigint comment 'category2',
                         `desc` varchar(200) comment 'description',
                         `cover` varchar(200) comment 'cover',
                         `doc_count` int not null default 0 comment 'numberOfdocuments',
                         `view_count` int not null default 0 comment 'viewCounts',
                         `like_count` int not null default 0 comment 'likeCounts',
                         primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='ebook';

insert into `ebook` (id, name, desc) values (1, 'Introduction to Java Programming and Data Structures', 'great book for people new to java');
insert into `ebook` (id, name, desc) values (2, 'Fullstack Vue: The Complete Guide to Vue.js', 'covers everything you need to know to build a modern app in Vue');
insert into `ebook` (id, name, desc) values (3, 'Python Crash Course', 'a fast-paced and comprehensive introduction to Python for beginners');
insert into `ebook` (id, name, desc) values (4, 'Learning MySQL: Get a Handle on Your Data', 'Mysql tutorial for beginners covers all basics');
insert into `ebook` (id, name, desc) values (5, 'Oracle PL/SQL Programming', 'our complete guide or reference book about Oracle PL/SQL programming');