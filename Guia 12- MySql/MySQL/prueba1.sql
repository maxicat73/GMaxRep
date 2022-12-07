USE lospicantes;
SELECT * FROM lospicantes.personas;
INSERT INTO personas (idpersonas,nombre,apellido,edad) VALUE(1,'SEBASTIAN','FRUTILLITA',35);
INSERT INTO personas (nombre,apellido,edad) VALUE('ROBER','SANTO',45);
UPDATE personas SET apellido='GIROLMINI' WHERE idpersonas=1;
DELETE FROM personas WHERE idpersonas=1;
UPDATE personas SET edad=edad+10 WHERE idpersonas=1;








