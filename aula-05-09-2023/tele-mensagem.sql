drop database if exists teleMensagem;
create database if not exists teleMensagem;
use teleMensagem;

create table Mensagem (
    codMensagem int not null primary key,
    nomeCliente varchar(50) not null,
    contatoCliente integer not null,
    contatoDestino1 integer not null,
    contatoDestino2 integer null,
    valorMensagem decimal(5, 2) not null,
    pago varchar(3) not null,
    tipoMensagem varchar(15) null,
    mensagem text not null
);