-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-12-2023 a las 18:40:34
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `licoreria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora_sesion`
--

CREATE TABLE `bitacora_sesion` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `f_inicio` datetime DEFAULT NULL,
  `f_fin` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bitacora_sesion`
--

INSERT INTO `bitacora_sesion` (`id`, `id_usuario`, `f_inicio`, `f_fin`) VALUES
(1, 1, '2023-11-29 16:21:22', '2023-11-29 17:21:22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `estado` bit(1) DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `nombre`, `descripcion`, `estado`) VALUES
(1, 'Gaseosa', 'Bebidas carbonatadas', b'0'),
(2, 'Vinos', 'Bebida a base de uva y alcohol', b'1'),
(3, 'Refrescos', 'Bebidas refrescantes', b'1'),
(4, 'Whiskys', 'Bebidas alcohólicas', b'1'),
(5, 'Licores', 'Bebidas alcohólicas, licores premiun y destilados.', b'1'),
(6, 'Espumantes', 'Selección de vinos y bebidas burbujeantes', b'1'),
(7, 'Cervezas', 'Bebida de malta de cebada, agua, lúpulo y levadura', b'1'),
(8, 'Ron', 'Bebida Alcoholica', b'1'),
(9, 'Ginner', 'Bebida Alcoholica', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `estado` bit(1) DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `direccion`, `estado`) VALUES
(1, 'Juana', 'Lima 12345', b'0'),
(2, 'Patricia', 'Lima 456', b'0'),
(3, 'Pedro', 'Lima 2345677', b'1'),
(4, 'Cesar', 'Av. Palmeras 345', b'1'),
(5, 'Sonia', 'Urb. Alisos 345', b'0'),
(6, 'sergio', 'MZR45', b'1'),
(7, 'juan ', 'ramirez', b'0'),
(12, 'karla', 'mendoza', b'0'),
(13, 'foquita', 'farfan AL', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprobante_pago`
--

CREATE TABLE `comprobante_pago` (
  `id` int(11) NOT NULL,
  `fecha_hora` datetime DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `id_dventa` int(11) DEFAULT NULL,
  `id_dtcomprobante` int(11) DEFAULT NULL,
  `t_comprobante` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_comprobante`
--

CREATE TABLE `detalle_comprobante` (
  `id` int(11) NOT NULL,
  `id_tpago` int(11) DEFAULT NULL,
  `cambio` decimal(5,2) DEFAULT NULL,
  `subtotal` decimal(5,2) DEFAULT NULL,
  `descuento` decimal(5,2) DEFAULT NULL,
  `total` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_entrada`
--

CREATE TABLE `detalle_entrada` (
  `id` int(11) NOT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `id_venta` int(11) DEFAULT NULL,
  `stock_inicial` int(11) DEFAULT NULL,
  `stock_final` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE `detalle_venta` (
  `id` int(11) NOT NULL,
  `id_cpago` int(11) DEFAULT NULL,
  `id_dentrada` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id` int(11) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `dni` varchar(8) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `id_sede` int(11) DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id`, `nombres`, `apellidos`, `dni`, `direccion`, `id_sede`, `estado`) VALUES
(1, 'Oscar', 'Sirlopu', '74847474', 'Universitaria 1234', 1, b'1'),
(2, 'Karla', 'Valverde', '74747474', 'Jr. Los Olivos 345', 2, b'1'),
(3, 'Juan', 'Velez', '2222', 'Av.Lima 5678', 1, b'1'),
(4, 'karla', 'valverde', '74847474', 'MZRR', 1, b'0'),
(5, 'rosario', 'lopez', '7484748', 'MZRRSs', 1, b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada_producto`
--

CREATE TABLE `entrada_producto` (
  `id` int(11) NOT NULL,
  `id_proveedor` int(11) DEFAULT NULL,
  `f_entrada` datetime DEFAULT NULL,
  `observacion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `entrada_producto`
--

INSERT INTO `entrada_producto` (`id`, `id_proveedor`, `f_entrada`, `observacion`) VALUES
(1, 3, '2023-11-22 02:08:21', 'abc');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `estado` bit(1) DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`id`, `nombre`, `descripcion`, `estado`) VALUES
(1, 'Smirnoff', 'Vodka de origen ruso', b'1'),
(2, 'Johnniee Walker', 'marca de whisky escocés', b'1'),
(3, 'Pilsen', 'Cerveza peruana originaria de Callao', b'1'),
(4, 'Cusqueña', 'Marca de cervezas y cervecería peruana', b'1'),
(5, 'Heineken', 'Empresa cervecera neerlandesa​', b'1'),
(6, 'Corona', 'una marca de cerveza fundada en 1926', b'1'),
(7, 'Coca Cola', 'Bebida azucarada gaseosa ', b'1'),
(8, 'Riccadonna', 'Marca de espumantes de origen italiano', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `stock_minimo` int(11) DEFAULT NULL,
  `codigo_barra` varchar(8) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `id_marca` int(11) DEFAULT NULL,
  `id_categoria` int(11) DEFAULT NULL,
  `precio_costo` decimal(5,2) DEFAULT NULL,
  `precio_venta` decimal(5,2) DEFAULT NULL,
  `id_unidadm` int(11) DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `stock_minimo`, `codigo_barra`, `nombre`, `id_marca`, `id_categoria`, `precio_costo`, `precio_venta`, `id_unidadm`, `estado`) VALUES
(1, 100, '755306', 'Cerveza CORONA Extra Botella 330ml 6 Pack', 6, 7, 20.90, 28.90, 1, b'1'),
(2, 20, '1146678', 'Espumante RICCADONNA Ruby Dolce Botella 750ml', 1, 1, 15.00, 15.00, 1, b'1'),
(3, 12, '121306', 'Gaseosa COCA COLA + INCA KOLA 2Pack Botella 3L', 1, 1, 17.40, 20.90, 2, b'1'),
(4, 100, '144424', 'Licor de Crema BAILEYS Original Irish Cream Botella 750ml', 1, 1, 40.00, 69.90, 1, b'1'),
(5, 200, '145554', 'z', 7, 2, 20.00, 50.00, 1, b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `RUC` varchar(12) DEFAULT NULL,
  `razon_social` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `dni` varchar(8) DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `RUC`, `razon_social`, `email`, `telefono`, `direccion`, `dni`, `estado`) VALUES
(1, '45348790654', 'Bebidas Selectas S.A.', 'bebidasselectas@gmail.com', '990878789', 'Av. Antareas 89a', '78934567', b'1'),
(2, '20154784441', 'Distribuidora de Licores Elegantes S.A.', 'licoreselegantes23@gmail.com', '923478652', 'Av. Lima 90', '34786524', b'1'),
(3, '56324523127', 'Importadora de Vinos Finos S.A', 'vinosFinos@hotmail.com', '904698027', 'Av. Argentina 678', '23567689', b'1'),
(4, '54673267986', 'Destilados de Calidad Ltda.', 'destiladoscalidad@hotmail.com', '905678467', 'Jr. Los Andes 78', '90872436', b'1'),
(5, '34216509896', 'Licores del Mundo S.R.L.', 'licoresdelmundo@outlook.com', '970356846', 'Av. Industrial 789', '89673426', b'1'),
(6, '67532145124', 'Vinícola Elegante Limitada', 'vinicolaelegante@gmail.com', '949907856', 'Av. Colonial 120', '09782376', b'1'),
(7, '10367532567', 'Sabor Exclusivo Distribuciones S.A.', 'saborexclusivo@gmail.com', '999992378', 'Av. Perú 89', '02345345', b'1'),
(8, '23234567864', 'Alcoholes y Aperitivos S.A.', 'alcoholesyaperitivos@outlook.com', '900345577', 'Av. Lima 789', '10849378', b'1'),
(9, '23457535764', 'Licores Gourmet Internacional S.A.', 'licoresgourmet2023@gmail.com', '987345878', 'Av. Alisos 99', '10243567', b'1'),
(10, '1234908756', 'Importación de Bebidas Selectas Ltda.', 'importacionbebidas@outlook.com', '990887766', 'Av. Antareas 34', '98573452', b'1'),
(11, '1', '2', '3@d.com', '4', '5', '6', b'0'),
(12, 'a', 'a', 'a', 'a', 'a', 'a', b'0'),
(13, 'v', 'v', 'v', 'v', 'v', 'v', b'0'),
(14, 'a', 's', 'd@j.com', 's', 'd', 'f', b'0'),
(15, 'null', 'null', 'null', 'null', 'null', 'null', b'0'),
(16, 'null', 'null', 'null', 'null', 'null', 'null', b'0'),
(17, 'nuevo', 'nuevo', 'nuevo@k', '444', '555', '55', b'0'),
(18, 'null', 'null', 'null', 'null', 'null', 'null', b'0'),
(19, 'a', 'a', 'a', 'a', 'a', 'a', b'0'),
(20, 'null', 'null', 'null', 'null', 'null', 'null', b'0'),
(21, 'null', 'null', 'null', 'null', 'null', 'null', b'0'),
(22, 'aaa', 'aaa', 'aaa@gmail.com', 'aa', 'aaa', 'aaaaa', b'0'),
(23, 'x', 'x', 'xxx@gmail.com', 'xxx', 'xxxxx', 'xx', b'0'),
(24, 'a', 'aa', 'aa@gmail.com', 'aa', 'aaa', 'aaaaaaa', b'0'),
(25, 'ddd', 'dddd', 'd@gmail.com', 'dddd', 'aaa', 'aaa', b'0'),
(26, 'karla', 'karlita', 'debora@gmail.com', 'nose ', 'en mi corazon', '7484711', b'0'),
(27, 'jessicaxxxx', 'ajessicaxxxxx', 'ajessica@gmail.com', 'jessica', 'jessica', 'jessica', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `nombre`, `descripcion`, `estado`) VALUES
(1, 'vendedor', 'encargado de ventas', b'1'),
(2, 'almacenero', 'encargado de almacen', b'1'),
(3, 'administrador', 'encargado de la administracion del local', b'1'),
(4, 'reponedor', 'abastece productos', b'1'),
(5, 'seguridad', 'cuida el local', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sede`
--

CREATE TABLE `sede` (
  `id` int(11) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `observacion` varchar(100) DEFAULT NULL,
  `razon_social` varchar(50) DEFAULT NULL,
  `logo` varchar(20) DEFAULT NULL,
  `propietario` varchar(20) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `estado` bit(1) DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sede`
--

INSERT INTO `sede` (`id`, `direccion`, `observacion`, `razon_social`, `logo`, `propietario`, `telefono`, `estado`) VALUES
(1, 'Lima 123', 'Sede Principal', 'Ventas de licores', NULL, 'Andrea Almanza', '933452342', b'1'),
(2, 'Universitaria 234', 'Sede secundaria', 'Ventas de licores', 'c', 'Pedro Camacho', '906754329', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_comprobante`
--

CREATE TABLE `tipo_comprobante` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `estado` bit(1) DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_comprobante`
--

INSERT INTO `tipo_comprobante` (`id`, `nombre`, `descripcion`, `estado`) VALUES
(1, 'Boleta', 'Documento de venta para personas naturales', b'0'),
(2, 'Factura', 'documento de venta para persona juridica', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_pago`
--

CREATE TABLE `tipo_pago` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `id` int(11) NOT NULL,
  `f_inicio` datetime DEFAULT NULL,
  `f_fin` datetime DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `monto` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unidad_medida`
--

CREATE TABLE `unidad_medida` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `unidad_medida`
--

INSERT INTO `unidad_medida` (`id`, `nombre`, `descripcion`, `estado`) VALUES
(1, 'mL', 'mililitros', b'1'),
(2, 'L', 'Litros', b'1'),
(3, 'und', 'unidades', b'1'),
(4, 'ppp', 'ppp', b'0'),
(5, 'cambio', 'cambio', b'0'),
(6, 'cambio', 'cambio', b'0'),
(7, 'cambio', 'xxx', b'0'),
(8, 'Kg', 'Kilogramos', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `usuario` varchar(15) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `id_rol` int(11) DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL,
  `dashboard` bit(1) DEFAULT NULL,
  `movimientos` bit(1) DEFAULT NULL,
  `ventas` bit(1) DEFAULT NULL,
  `compras` bit(1) DEFAULT NULL,
  `admin` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `usuario`, `password`, `id_empleado`, `id_rol`, `estado`, `dashboard`, `movimientos`, `ventas`, `compras`, `admin`) VALUES
(1, 'oscar', '1234', 1, 1, b'1', b'1', b'1', b'1', b'1', b'1'),
(2, 'karla', 'karla1234', 1, 3, b'1', b'1', b'1', b'1', b'1', b'1'),
(4, 'carlos', 'lopez', 1, 1, b'1', b'1', b'1', b'1', b'1', b'1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bitacora_sesion`
--
ALTER TABLE `bitacora_sesion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `comprobante_pago`
--
ALTER TABLE `comprobante_pago`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_dventa` (`id_dventa`),
  ADD KEY `id_dtcomprobante` (`id_dtcomprobante`),
  ADD KEY `t_comprobante` (`t_comprobante`);

--
-- Indices de la tabla `detalle_comprobante`
--
ALTER TABLE `detalle_comprobante`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_tpago` (`id_tpago`);

--
-- Indices de la tabla `detalle_entrada`
--
ALTER TABLE `detalle_entrada`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_venta` (`id_venta`);

--
-- Indices de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_sede` (`id_sede`);

--
-- Indices de la tabla `entrada_producto`
--
ALTER TABLE `entrada_producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_proveedor` (`id_proveedor`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_marca` (`id_marca`),
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `id_unidadm` (`id_unidadm`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sede`
--
ALTER TABLE `sede`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_comprobante`
--
ALTER TABLE `tipo_comprobante`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `turno`
--
ALTER TABLE `turno`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_usuario` (`id_usuario`);

--
-- Indices de la tabla `unidad_medida`
--
ALTER TABLE `unidad_medida`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_empleado` (`id_empleado`),
  ADD KEY `id_rol` (`id_rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bitacora_sesion`
--
ALTER TABLE `bitacora_sesion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `comprobante_pago`
--
ALTER TABLE `comprobante_pago`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_comprobante`
--
ALTER TABLE `detalle_comprobante`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_entrada`
--
ALTER TABLE `detalle_entrada`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `entrada_producto`
--
ALTER TABLE `entrada_producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `sede`
--
ALTER TABLE `sede`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo_comprobante`
--
ALTER TABLE `tipo_comprobante`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo_pago`
--
ALTER TABLE `tipo_pago`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `turno`
--
ALTER TABLE `turno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `unidad_medida`
--
ALTER TABLE `unidad_medida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bitacora_sesion`
--
ALTER TABLE `bitacora_sesion`
  ADD CONSTRAINT `bitacora_sesion_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `comprobante_pago`
--
ALTER TABLE `comprobante_pago`
  ADD CONSTRAINT `comprobante_pago_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `comprobante_pago_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `comprobante_pago_ibfk_3` FOREIGN KEY (`id_dventa`) REFERENCES `detalle_venta` (`id`),
  ADD CONSTRAINT `comprobante_pago_ibfk_4` FOREIGN KEY (`id_dtcomprobante`) REFERENCES `detalle_comprobante` (`id`),
  ADD CONSTRAINT `comprobante_pago_ibfk_5` FOREIGN KEY (`t_comprobante`) REFERENCES `tipo_comprobante` (`id`);

--
-- Filtros para la tabla `detalle_comprobante`
--
ALTER TABLE `detalle_comprobante`
  ADD CONSTRAINT `detalle_comprobante_ibfk_1` FOREIGN KEY (`id_tpago`) REFERENCES `tipo_pago` (`id`);

--
-- Filtros para la tabla `detalle_entrada`
--
ALTER TABLE `detalle_entrada`
  ADD CONSTRAINT `detalle_entrada_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`),
  ADD CONSTRAINT `detalle_entrada_ibfk_2` FOREIGN KEY (`id_venta`) REFERENCES `entrada_producto` (`id`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`id_sede`) REFERENCES `sede` (`id`);

--
-- Filtros para la tabla `entrada_producto`
--
ALTER TABLE `entrada_producto`
  ADD CONSTRAINT `entrada_producto_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`id`),
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`),
  ADD CONSTRAINT `producto_ibfk_3` FOREIGN KEY (`id_unidadm`) REFERENCES `unidad_medida` (`id`);

--
-- Filtros para la tabla `turno`
--
ALTER TABLE `turno`
  ADD CONSTRAINT `fk_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
