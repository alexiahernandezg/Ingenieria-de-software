CREATE TABLE Usuario(
idUsuario SERIAL NOT NULL,
nombre TEXT NOT NULL,
correo TEXT NOT NULL,
contrasenia TEXT NOT NULL,
fechanacimiento DATE NOT NULL,
PRIMARY KEY(idUsuario)
);

CREATE TABLE Marcador(
idMarcador INT NOT NULL,
descripcion TEXT,
longitud DOUBLE PRECISION, 
latitud DOUBLE PRECISION,
idUsuario INT NOT NULL,
PRIMARY KEY(idMarcador),
FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario) ON DELETE NO ACTION ON UPDATE NO ACTION 
);
