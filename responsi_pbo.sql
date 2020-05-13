-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2020 at 09:53 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_pegawai` varchar(4) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `posisi` varchar(20) NOT NULL,
  `gaji_pokok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` varchar(5) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `posisi` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `gaji_pokok` int(11) NOT NULL,
  `jam_lembur` int(11) NOT NULL,
  `tunjangan` int(11) NOT NULL,
  `pajak` int(11) NOT NULL,
  `total_gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama`, `posisi`, `alamat`, `no_hp`, `gaji_pokok`, `jam_lembur`, `tunjangan`, `pajak`, `total_gaji`) VALUES
('12318', 'Syafaldi Rizkika', 'Programmer', 'Yogyakarta,Seturan', '087875395922', 1000000, 12, 180000, 10000, 1170000),
('123', 'Julia', 'Manager', 'Yogyakarta', '123180', 2000000, 11, 165000, 20000, 2145000),
('145', 'Rizkika', 'Programmer', 'Bekasi', '012831231', 3000000, 2, 30000, 30000, 3000000),
('183', 'Suranto', 'Manager', 'Jakarta', '12312412', 4000000, 12, 180000, 40000, 4140000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
