-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2020 at 06:18 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `location_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `locations`
--

CREATE TABLE `locations` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `image` longtext DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `elevation` int(11) DEFAULT NULL,
  `latitude` float DEFAULT NULL,
  `longitude` float DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `worktime` varchar(255) DEFAULT NULL,
  `grad_id` bigint(20) DEFAULT NULL,
  `tip` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `locations`
--

INSERT INTO `locations` (`id`, `address`, `image`, `contact`, `description`, `elevation`, `latitude`, `longitude`, `name`, `rating`, `worktime`, `grad_id`, `tip`) VALUES
(1, 'Bulevar Vidoe Smilevski Bato', '', 'Fax: +389 2 321 9901', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 242, 41.9829, 21.4726, 'Novo Lisiche - Zona 24/7', 3, 'Open 24/7', 1, 1),
(2, 'Manapo 7', '', 'Fax: +389 2 308 8930', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 255, 42.0074, 21.3929, 'Bankomati Karposh 4', 4.5, 'Open 24/7', 1, 1),
(3, 'Sv. Kiril i Metodij Centar', '', 'Fax: +389 2 244 6000', 'Bankomat', 255, 41.9922, 21.4269, 'TC Ramstor', 1, 'Open 24/7', 1, 1),
(4, 'Jurij Gagarin 17 Kapishtec', '', 'Fax: +389 2 3219904', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 268, 41.9947, 21.4101, 'Bankomati Kapishtec', 3.5, 'Open 24/7', 1, 1),
(5, 'Blagoj Gjorev 107 Nova Naselba', '', 'Fax: +389 2 244 60 00', 'Uplati / Isplati vo MKD / EUR', 210, 41.7143, 21.7672, 'TC Veles', 3, 'Open 24/7', 2, 1),
(6, 'Done Bozhinov 1', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR / USD', 346, 42.137, 21.718, 'Bankomati Kumanovo', 5, 'Open 24/7', 3, 1),
(7, 'Marshal Tito 4b', '', 'Fax: +389 2 244 6000', 'Uplati / Isplati vo MKD / EUR', 288, 41.7372, 22.1923, 'Bankomati Shtip', 5, 'Open 24/7', 4, 1),
(8, 'Blagoj Jankov Mucheto 2', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 250, 41.4373, 22.6372, 'Bankomati Strumica', 4, 'Open 24/7', 5, 1),
(9, 'Marshal Tito 1/1', '', 'Fax: +389 2 244 6000', 'Uplati / Isplati vo MKD / EUR', 657, 41.3475, 21.5561, 'Bankomati Prilep', 3, 'Open 24/7', 6, 1),
(10, 'Dobrivoe Radosavlevikj 10', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 614, 41.0301, 21.3356, 'Bankomati Bitola', 4.5, 'Open 24/7', 7, 1),
(11, 'Turisticka bb', '', 'Fax: +389 2 244 6000', 'Uplati/Isplati vo MKD/EUR', 705, 41.1165, 20.8027, 'Bankomati Ohrid', 4, 'Open 24/7', 8, 1),
(12, 'Proleterska Brigada bb', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 691, 41.1788, 20.6762, 'Bankomati Struga', 3, 'Open 24/7', 9, 1),
(13, 'Brakja Gjinoski', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 529, 41.8026, 20.9089, 'Gostivar- Zona 24/7', 3.5, 'Open 24/7', 10, 1),
(14, 'Boris Kidrich 1', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 468, 42.0104, 20.9715, 'Bankomati Tetovo 1', 5, 'Open 24/7', 11, 1),
(15, 'Manapo 7', '', 'Fax: +389 2 308 8930', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 255, 42.0074, 21.3929, 'Centralna uprava', 4.5, 'Mon - Fri from 08:00 to 16:00 \nSat from 09:00 to 13:00', 1, 0),
(16, 'Manapo 7', '', 'Fax: +389 2 308 8930', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 255, 42.0074, 21.3929, 'Ekspozitura Karposh', 4.5, 'Mon - Fri from 08:00 to 16:00 \nSat from 09:00 to 13:00', 1, 0),
(17, 'Jurij Gagarin 17 Kapishtec', '', 'Fax: +389 2 3219904', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 268, 41.9947, 21.4101, 'Ekspozitura Kapishtec', 3.5, 'Mon - Fri from 08:00 to 17:00 \nSat from 09:00 to 13:00', 1, 0),
(18, 'Boris Kidrich 1', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 468, 42.0104, 20.9715, 'Ekspozitura Tetovo 1', 5, 'Mon-Fri from 09:00 to 17:00', 11, 0),
(19, 'Proleterska brigada bb', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 691, 41.1788, 20.6762, 'Ekspozitura Struga', 3, 'Mon-Fri from 09:00 to 17:00', 9, 0),
(20, 'Dobrivoe Radosavlevikj 10', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 614, 41.0301, 21.3356, 'Ekspozitura Bitola', 4.5, 'Mon-Fri from 09:00 to 17:00', 7, 0),
(21, 'Done Bozhinov 1', '', 'Fax:  + 389 2 244 60 00 ', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR / USD', 346, 42.137, 21.718, 'Ekspozitura Kumanovo', 5, 'Mon - Fri from 09:00 to 17:00 ', 3, 0),
(22, 'Marshal Tito 4b', '', 'Fax: +389 2 244 6000', 'Uplati / Isplati vo MKD / EUR', 288, 41.7372, 22.1923, 'Ekspozitura Shtip ', 5, 'Closes: 5PM; Reopens: 9PM', 4, 0),
(23, 'Blagoj Jankov Mucheto 2', '', 'Fax: +389 2 244 6000', 'Sef za dneven promet, Uplati / Isplati vo MKD / EUR', 250, 41.4373, 22.6372, 'Ekspozitura Strumica', 4, 'Mon - Fri from 09:00 to 17:00 ', 5, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `locations`
--
ALTER TABLE `locations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqd450emummpv5uhbjvel48c1l` (`grad_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `locations`
--
ALTER TABLE `locations`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=137;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
