-- select * from v$version; -- Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production
CREATE TABLE productos (
idProductos NUMERIC(10,0) NOT NULL,
productName VARCHAR(100) NOT NULL,
productPrice DECIMAL(10,2) NOT NULL
);

--Select * from productos;