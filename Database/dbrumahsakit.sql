-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2023 at 11:14 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbrumahsakit`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblpembayaran`
--

CREATE TABLE `tblpembayaran` (
  `No_Pembayaran` int(15) NOT NULL,
  `Tgl_Pembayaran` varchar(10) NOT NULL,
  `Kode_Kamar` varchar(15) NOT NULL,
  `Tipe_Kamar` varchar(50) NOT NULL,
  `Harga_Perhari` int(12) NOT NULL,
  `Lama_Rawat` varchar(5) NOT NULL,
  `Total_Bayar` int(12) NOT NULL,
  `Diskon` int(12) NOT NULL,
  `Total_Bersih` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblpembayaran`
--

INSERT INTO `tblpembayaran` (`No_Pembayaran`, `Tgl_Pembayaran`, `Kode_Kamar`, `Tipe_Kamar`, `Harga_Perhari`, `Lama_Rawat`, `Total_Bayar`, `Diskon`, `Total_Bersih`) VALUES
(2, '1-1-2023', '4', 'President', 1000000, '2', 2000000, 0, 2000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblpembayaran`
--
ALTER TABLE `tblpembayaran`
  ADD PRIMARY KEY (`No_Pembayaran`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
