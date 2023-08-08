-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2023 at 10:53 PM
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
-- Database: `dbandromeda`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblpenjualan`
--

CREATE TABLE `tblpenjualan` (
  `No_Faktur` int(15) NOT NULL,
  `Tgl_Penjualan` varchar(10) NOT NULL,
  `Id_Barang` varchar(15) NOT NULL,
  `Nama_Barang` varchar(50) NOT NULL,
  `Harga` int(12) NOT NULL,
  `Jumlah_Beli` varchar(5) NOT NULL,
  `Total_Harga` int(12) NOT NULL,
  `Diskon` int(12) NOT NULL,
  `Total_Bayar` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblpenjualan`
--

INSERT INTO `tblpenjualan` (`No_Faktur`, `Tgl_Penjualan`, `Id_Barang`, `Nama_Barang`, `Harga`, `Jumlah_Beli`, `Total_Harga`, `Diskon`, `Total_Bayar`) VALUES
(1, '09-01-2023', '1', 'Laptop Acer', 5850000, '6', 35100000, 3510000, 31590000),
(2, '12-12-2022', '2', 'Monitor Dell', 2050000, '11', 22550000, 3382500, 19167500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblpenjualan`
--
ALTER TABLE `tblpenjualan`
  ADD PRIMARY KEY (`No_Faktur`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
