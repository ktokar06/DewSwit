CREATE TABLE `user` (
`id` bigint(20) NOT NULL,
`username` varchar(100) NOT NULL,
`password` varchar(100) NOT NULL,
`mail` varchar(100) NOT NULL,
`role` varchar(100) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;