CREATE TABLE Curso (
  curs_Id              SERIAL PRIMARY KEY,
  curs_Nome            VARCHAR(55) NOT NULL,
  curs_Credito		   VARCHAR(55) NULL
);
;
INSERT INTO Curso (curs_nome, curs_credito)
VALUES ('Alguém', 200.0);
