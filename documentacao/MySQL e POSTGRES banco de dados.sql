/*POSTGRES*/
CREATE DATABASE GGRPG;

CREATE TABLE usuario
(
    id serial PRIMARY KEY,
    username varchar(30),
    senha varchar(30),
    email varchar(50)
);

CREATE TABLE ficha
(
    id serial PRIMARY KEY,
    nomeDoPersonagem varchar(30),
    sistema varchar(30)
);

CREATE TABLE pericia
(
    id serial PRIMARY KEY,
    acrobacia int, 
    adestramento int, 
    artes int,
    atletismo int,
    atualidades int,
    ciencias int,
    crime int,
    diplomacia int,
    enganacao int,
    fortitude int,
    furtividade int,
    iniciativa int,
    intimidacao int,
    intuicao int,
    investigacao int,
    luta int,
    medicina int,
    ocultismo int,
    percepcao int,
    pilotagem int,
    pontaria int,
    profissao int,
    reflexos int,
    religiao int,
    sobrevivencia int,
    tatica int,
    tecnologia int,
    vontade int
);

CREATE TABLE atributo
(
    id serial PRIMARY KEY,
    forca int,
    agilidade int,
    intelecto int,
    vigor int,
    presenca int
);

CREATE TABLE ataque
(
    id serial PRIMARY KEY,
    arma varchar(30),
    teste varchar(30),
    dano varchar(30),
    modificadores varchar(30)
);

CREATE TABLE Propriedade
(
    id serial PRIMARY KEY,
    origem varchar(30),
    classe varchar(30),
    trilha varchar(30),
    nex int,
    peRodada int,
    peTot int,
    peAtual int,
    pvTot int,
    pvAtual int,
    deslocamento int,
    sanidadeTot int,
    sanidadeAtual int,
    defesa int,
    resistencia int
);

CREATE TABLE habilidade
(
    id serial PRIMARY KEY,
    custo int,
    descricao varchar(200),
    pagina int
);

-- Dados inseridos do usuário 1
INSERT INTO usuario (username, senha, email) VALUES ('Carlos', '12345', 'carlos@gmail.com');

-- Dados inseridos da ficha 1 usuário 1
INSERT INTO ficha (nomeDoPersonagem, sistema) VALUES ('Robson', 'Carlos', 'Ordem Paranormal');
INSERT INTO pericia (acrobacia, adestramento, artes, atletismo, atualidades, ciencias, crime, diplomacia, enganacao, fortitude, furtividade, iniciativa, intimidacao, intuicao, investigacao, luta, medicina, ocultismo, percepcao, pilotagem, pontaria, profissao, reflexos, religiao, sobrevivencia, tatica, tecnologia, vontade)
VALUES (5, 0, 0, 10, 5, 0, 5, 0, 10, 0, 10, 0, 0, 5, 0, 10, 0, 0, 5, 0, 0, 0, 10, 0, 0, 0, 0, 5);
INSERT INTO atributo (forca, agilidade, intelecto, vigor, presenca) VALUES (1, 3, 1, 1, 2);
INSERT INTO propriedade (origem, classe, trilha, nex, peRodada, peTot, peAtual, pvTot, pvAtual, deslocamento, sanidadeTot, sanidadeAtual, defesa, resistencia)
VALUES ('ex presidiário', 'especialista', 'Infiltrador', 5, 5, 23, 23, 12, 12, 12, 13, 13, 15, '0');
INSERT INTO habilidade (custo, descricao, pagina) VALUES (3, 'texto', 132);
INSERT INTO habilidade (custo, descricao, pagina) VALUES (3, 'text', 80);
INSERT INTO ataque (arma, teste, dano, modificadores) VALUES ('Lamina Oculta', 'Fortitude', '2D6', '0');

-- Dados inseridos da ficha 2 usuário 2
INSERT INTO ficha (nomeDoPersonagem, sistema) VALUES ('Adele', 'Bruna', 'Ordem Paranormal');
INSERT INTO pericia (acrobacia, adestramento, artes, atletismo, atualidades, ciencias, crime, diplomacia, enganacao, fortitude, furtividade, iniciativa, intimidacao, intuicao, investigacao, luta, medicina, ocultismo, percepcao, pilotagem, pontaria, profissao, reflexos, religiao, sobrevivencia, tatica, tecnologia, vontade)
VALUES (5, 0, 0, 10, 5, 0, 5, 0, 10, 0, 10, 0, 0, 5, 0, 10, 0, 0, 5, 0, 0, 0, 10, 0, 0, 0, 0, 5);
INSERT INTO atributo (forca, agilidade, intelecto, vigor, presenca) VALUES (1, 3, 2, 2, 1);
INSERT INTO ataque (arma, teste, dano, modificadores) VALUES ('Pistola', 'Sobrevivencia', '2D6', '0');
INSERT INTO propriedade (origem, classe, trilha, nex, peRodada, peTot, peAtual, pvTot, pvAtual, deslocamento, sanidadeTot, sanidadeAtual, defesa, resistencia)
VALUES ('médica', 'especialista', 'Operações Especiais', 5, 5, 23, 23, 12, 12, 12, 13, 13, 15, '0');
INSERT INTO habilidade (custo, descricao, pagina) VALUES (5, 'texto', 132);

/*MYSQL*/
create database GGRPG;

use GGRPG;

create table usuario
(
id Long primary key,
username varchar(30),
senha varchar(30),
email varchar(50)
);

create table ficha
(
id Long primary key,
nomeDoPersonagem varchar(30),
sistema varchar(30)
);

create table pericia
(
id Long primary key,
acrobacia int, 
adestramento int, 
artes int,
atletismo int,
atualidades int,
ciencias int,
crime int,
diplomacia int,
enganacao int,
fortitude int,
furtividade int,
iniciativa int,
intimidacao int,
intuicao int,
investigacao int,
luta int,
medicina int,
ocultismo int,
percepcao int,
pilotagem int,
pontaria int,
profissao int,
reflexos int,
religiao int,
sobrevivencia int,
tatica int,
tecnologia int,
vontade int
);

create table atributo
(
id Long primary key,
forca int,
agilidade int,
intelecto int,
vigor int,
presenca int
);

create table ataque
(
id Long primary key,
arma varchar(30),
teste varchar(30),
dano varchar(30),
modificadores varchar(30)
);

create table Propriedade
(
id Long primary key,
origem varchar(30),
classe varchar(30),
trilha varchar(30),
nex int,
peRodada int,
peTot int,
peAtual int,
pvTot int,
pvAtual int,
deslocamento int,
sanidadeTot int,
sanidadeAtual int,
defesa int,
resistencia int
);

create table habilidade
(
id Long primary key,
custo int,
descricao varchar(200),
pagina int
);

/*Dados inseridos do usuário 1*/
insert into usuario values (1, 'Carlos', '12345', 'carlos@gmail.com');

/*Dados inseridos da ficha 1 usuário 1*/
insert into ficha values ('Robson', 'Carlos', 'Ordem Paranormal');
insert into pericia values(1, 5, 0, 0, 10, 5, 0, 5, 0, 10 ,0, 10, 0, 0, 5, 0, 10, 0, 0, 5, 0, 0, 0, 10, 0, 0, 0, 0, 5);
insert into atributo values(1, 1, 3, 1, 1, 2);
insert into propriedade values (1, 'ex presidiário', 'especialista', 'Infiltrador', 5, 5, 23, 23, 12, 12, 12, 13, 13, 15, '0');
insert into habilidade values(1, 3, 'texto', 132);
insert into habilidade values(2, 3, 'text', 80);
insert into ataque values(1, 'Lamina Oculta', 'Fortitude', '2D6', 0);

/*Dados inseridos da ficha 2 usuário 2*/
insert into ficha values ('Adele', 'Bruna', 'Ordem Paranormal');
insert into pericia values(2, 5, 0, 0, 10, 5, 0, 5, 0, 10 ,0, 10, 0, 0, 5, 0, 10, 0, 0, 5, 0, 0, 0, 10, 0, 0, 0, 0, 5);
insert into atributo values(1, 1, 3, 2, 2, 1);
insert into ataque values(1, 'Pistola', 'Sobrevivencia', '2D6', '0');
insert into propriedade values (1, 'médica', 'especialista', 'Operações Especiais', 5, 5, 23, 23, 12, 12, 12, 13, 13, 15, '0');
insert into habilidade values(1, 5, 'texto', 132);
