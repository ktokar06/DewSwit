CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `client` varchar(100) DEFAULT NULL,
  `comment` varchar(100) DEFAULT NULL,
  `date` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `payment` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `sum` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;