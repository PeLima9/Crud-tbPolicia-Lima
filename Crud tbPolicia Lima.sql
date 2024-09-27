--Alterar sesión para crear usuario--
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;

--Crear usuario y dar privilegio de conexión--
CREATE USER LimaCrudJava IDENTIFIED BY LimaCrudJava;
GRANT CONNECT TO LimaCrudJava;

--Crear Tabla--
CREATE TABLE tbPolicia(
    UUID_Policia VARCHAR2 (100),
    Nombre_Policia VARCHAR2 (100),
    Edad_Policia INT,
    Peso_Policia NUMBER,
    Correo_Policia VARCHAR2 (100)
);
