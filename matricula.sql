-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 01:34:55
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `matricula`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `codigo` char(8) NOT NULL,
  `dni` char(8) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `apellido` varchar(150) NOT NULL,
  `apoderado` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`codigo`, `dni`, `nombre`, `apellido`, `apoderado`) VALUES
('A23723SU', '72387327', 'antonio', 'suarez', '47282939'),
('A23728AT', '72830329', 'Benjamin', 'Atoche', '43354698'),
('A23729MI', '72930939', 'julio manuel', 'miranda ochoa', '47282939');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docentes`
--

CREATE TABLE `docentes` (
  `codigo` char(8) NOT NULL,
  `dni` char(9) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `estado` varchar(150) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `docentes`
--

INSERT INTO `docentes` (`codigo`, `dni`, `nombre`, `apellido`, `correo`, `estado`, `fecha`) VALUES
('D23456LO', '45678359', 'NORY DEL PILAR', 'LOPEZ SALAZAR', 'nory@gmail.com', 'activo', '2023-11-15'),
('D23732CA', '73236606', 'JOSE DANIEL', 'CASTRO BARRETO', 'jose@gmail.com', 'prueba', '2023-11-16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grados`
--

CREATE TABLE `grados` (
  `idGrado` char(2) NOT NULL,
  `grado` char(1) NOT NULL,
  `nivel` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `grados`
--

INSERT INTO `grados` (`idGrado`, `grado`, `nivel`) VALUES
('1p', '1', 'primaria'),
('1s', '1', 'secundaria'),
('2p', '2', 'primaria'),
('2s', '2', 'secundaria'),
('3i', '3', 'inicial'),
('3p', '3', 'primaria'),
('3s', '3', 'secundaria'),
('4i', '4', 'inicial'),
('4p', '4', 'primaria'),
('4s', '4', 'secundaria'),
('5i', '5', 'inicial'),
('5p', '5', 'primaria'),
('5s', '5', 'secundaria'),
('6p', '6', 'primaria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE `matricula` (
  `idMatricula` varchar(8) NOT NULL,
  `dniAlumno` char(8) NOT NULL,
  `idSeccion` char(5) NOT NULL,
  `pagado` char(2) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `matricula`
--

INSERT INTO `matricula` (`idMatricula`, `dniAlumno`, `idSeccion`, `pagado`, `fecha`) VALUES
('00000001', 'A23723SU', 'A1p01', 'no', '2023-11-17'),
('00000002', 'A23728AT', 'A2s01', 'si', '2023-11-17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `padresfamilia`
--

CREATE TABLE `padresfamilia` (
  `dni` char(8) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `apellido` varchar(150) NOT NULL,
  `telefono` char(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `padresfamilia`
--

INSERT INTO `padresfamilia` (`dni`, `nombre`, `apellido`, `telefono`) VALUES
('43354698', 'PEDRO', 'ATOCHE MONTERO', '932823932'),
('47282939', 'GIANCARLOS', 'ALEGRIA CARRION', '92839283'),
('47387327', 'ALEX ADEMIR', 'VILLEGAS CHAMPA', '92827374');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `secciones`
--

CREATE TABLE `secciones` (
  `idSeccion` char(5) NOT NULL,
  `grado` char(2) NOT NULL,
  `division` char(1) NOT NULL,
  `tutor` char(8) NOT NULL,
  `aula` varchar(3) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `secciones`
--

INSERT INTO `secciones` (`idSeccion`, `grado`, `division`, `tutor`, `aula`, `fecha`) VALUES
('A1p01', '1p', 'A', 'D23456LO', '1', '2023-11-15'),
('A2s01', '2s', 'A', 'D23456LO', '1', '2023-11-15'),
('C4p50', '4p', 'C', 'D23456LO', '50', '2023-11-16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `dni` char(8) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`dni`, `password`) VALUES
('12345678', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `apoderado` (`apoderado`);

--
-- Indices de la tabla `docentes`
--
ALTER TABLE `docentes`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `grados`
--
ALTER TABLE `grados`
  ADD PRIMARY KEY (`idGrado`);

--
-- Indices de la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`idMatricula`),
  ADD KEY `dniAlumno` (`dniAlumno`,`idSeccion`),
  ADD KEY `idSeccion` (`idSeccion`);

--
-- Indices de la tabla `padresfamilia`
--
ALTER TABLE `padresfamilia`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `secciones`
--
ALTER TABLE `secciones`
  ADD PRIMARY KEY (`idSeccion`),
  ADD KEY `grado` (`grado`),
  ADD KEY `tutor` (`tutor`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`dni`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`apoderado`) REFERENCES `padresfamilia` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`idSeccion`) REFERENCES `secciones` (`idSeccion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`dniAlumno`) REFERENCES `alumnos` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `secciones`
--
ALTER TABLE `secciones`
  ADD CONSTRAINT `secciones_ibfk_1` FOREIGN KEY (`tutor`) REFERENCES `docentes` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `secciones_ibfk_2` FOREIGN KEY (`grado`) REFERENCES `grados` (`idGrado`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
