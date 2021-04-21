create table `test_users` (
  `id` bigint(20) unsigned not null auto_increment,
  `username` varchar(64) default null,
  `primary_email` varchar(64) default null,
  PRIMARY KEY(`id`),
  UNIQUE KEY(`primary_email`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;;