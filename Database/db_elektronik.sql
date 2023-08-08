-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2022 at 11:02 PM
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
-- Database: `db_elektronik`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `No_Transaksi` int(15) NOT NULL,
  `Tgl_Transaksi` varchar(10) NOT NULL,
  `Kode_Barang` varchar(15) NOT NULL,
  `Nama_Barang` varchar(50) NOT NULL,
  `Harga_Barang` int(12) NOT NULL,
  `Ongkir` int(12) NOT NULL,
  `Jumlah_Pesan` varchar(5) NOT NULL,
  `Total_Bayar` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`No_Transaksi`, `Tgl_Transaksi`, `Kode_Barang`, `Nama_Barang`, `Harga_Barang`, `Ongkir`, `Jumlah_Pesan`, `Total_Bayar`) VALUES
(1, '18-12-2022', '3', 'Mesin Cuci Sharp', 1540000, 70000, '6', 9310000),
(2, '19/12/2022', '1', 'Kulkas LG', 1850000, 65000, '2', 3765000),
(3, '12-12-2022', '2', 'TV Sharp 24 Inch', 3250000, 48000, '3', 9798000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD PRIMARY KEY (`No_Transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
