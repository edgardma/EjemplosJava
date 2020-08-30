-- Select @@version; -- Microsoft SQL Server 2019 (RTM-GDR) (KB4517790) - 15.0.2070.41 (X64)   Oct 28 2019 19:56:59   Copyright (C) 2019 Microsoft Corporation  Developer Edition (64-bit) on Windows 10 Pro 10.0 <X64> (Build 19041: ) 

CREATE TABLE productos (
idProductos INT NOT NULL,
productName VARCHAR(100) NOT NULL,
productPrice DECIMAL(10,2) NOT NULL
);

Select * From productos;