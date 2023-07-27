drop database if exists fazenda;
create database if not exists fazenda;
use fazenda;

create table vacinacao ( # vai primeiro porque não tem chave estrangeira
	idVacinacao int not null primary key auto_increment,
	nomeVacina varchar(100) not null,
	dataVacinacao date not null,
	ocorrencia text null
);

create table grupos ( # animal participa de um grupo então vem primeiro
	idGrupo int not null primary key auto_increment,
	faixaEtariaGrupo varchar(5) not null, # exemplo: 0-2 
	piqueteUtilizados int not null,
	recomendacaoVet text null,
	idVacinacao int not null,
	constraint FK_grupos_vacinacao foreign key(idVacinacao)
		references vacinacao(idVacinacao)
);

create table animal (
	idAnimal int not null primary key auto_increment,
	idadeAnimal int not null,
	pesoAni decimal(5, 2) not null,
	idGrupo int not null,
	constraint FK_animal_grupos foreign key(idGrupo)
		references grupos(idGrupo)
);

create table frigorifico (
	idAbate int not null primary key auto_increment,
	idAnimal int not null,
	pesoAntes decimal(5, 2) not null,
	pesoDepois decimal(5, 2) not null,
	constraint FK_frigorifico_animal foreign key (idAnimal)
		references animal(idAnimal)
);