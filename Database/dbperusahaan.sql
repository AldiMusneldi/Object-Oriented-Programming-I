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
-- Database: `dbperusahaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblbarang`
--

CREATE TABLE `tblbarang` (
  `KodeBarang` int(15) NOT NULL,
  `NamaBarang` varchar(100) NOT NULL,
  `Satuan` varchar(50) NOT NULL,
  `HargaBeli` int(12) NOT NULL,
  `HargaJual` int(12) NOT NULL,
  `Stok` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblbarang`
--

INSERT INTO `tblbarang` (`KodeBarang`, `NamaBarang`, `Satuan`, `HargaBeli`, `HargaJual`, `Stok`) VALUES
(12, 'Pop Mie', 'pcs', 5000, 6000, '20');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblpenjualan`
--

CREATE TABLE `tblpenjualan` (
  `KodeTiket` int(15) NOT NULL,
  `AsalPenerbangan` varchar(50) NOT NULL,
  `Tujuan` varchar(50) NOT NULL,
  `HargaTiket` int(12) NOT NULL,
  `JumlahBeli` int(12) NOT NULL,
  `TotalBayar` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblpenjualan`
--

INSERT INTO `tblpenjualan` (`KodeTiket`, `AsalPenerbangan`, `Tujuan`, `HargaTiket`, `JumlahBeli`, `TotalBayar`) VALUES
(1, 'Padang', 'Jakarta', 900000, 2, 1800000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tblbarang`
--
ALTER TABLE `tblbarang`
  ADD PRIMARY KEY (`KodeBarang`);

--
-- Indeks untuk tabel `tblpenjualan`
--
ALTER TABLE `tblpenjualan`
  ADD PRIMARY KEY (`KodeTiket`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
