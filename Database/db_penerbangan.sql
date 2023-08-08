-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 18 Des 2022 pada 18.33
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_penerbangan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_penjualan`
--

CREATE TABLE `tbl_penjualan` (
  `No_Faktur` int(15) NOT NULL,
  `Tgl_Penjualan` varchar(10) NOT NULL,
  `Kode_Tiket` varchar(15) NOT NULL,
  `Tujuan` varchar(50) NOT NULL,
  `Harga_Tiket` int(12) NOT NULL,
  `Jumlah_Pesan` varchar(5) NOT NULL,
  `Total_Bayar` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_penjualan`
--

INSERT INTO `tbl_penjualan` (`No_Faktur`, `Tgl_Penjualan`, `Kode_Tiket`, `Tujuan`, `Harga_Tiket`, `Jumlah_Pesan`, `Total_Bayar`) VALUES
(1, '12-12-2022', '1', 'Jakarta', 1850000, '2', 3700000),
(3, '12-12-2022', '4', 'Palembang', 700000, '2', 1400000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbl_penjualan`
--
ALTER TABLE `tbl_penjualan`
  ADD PRIMARY KEY (`No_Faktur`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
