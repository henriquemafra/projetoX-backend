# Documentação básica sobre como executar este projeto

## Requisitos
- JDK 17
- MySQL ou MariaDB

## Primeiro Passo: Instalar e configurar o MySQL Server

- Instale e configure o MySQL Server.
- Configure o endereço e a porta no padrão, crie o username e password conforme o padrão atual do projeto que é:

localhost:3306
dbName: database
username: root
password: root

## Segundo Passo:

 Criar a base de dados "database" utilizando terminal ou uma ferramenta com gui, exemplo: SQLyog Community. Injete o arquivo db.sql na database. Ou utilize o JSON de exemplo para fazer o primeiro Post e criar as tabelas automaticamente.

## Terceiro Passo:

 Instalar extensões Spring para quem utiliza o VSCode.

## Quarto Passo:

 Acessar o Spring Dashboard e executar o projeto.

## Quinto Passo: 

 Para testar o endpoint utilize o Postman e faça um get para obter o formato do JSON. No Postman, digite o endpoint, selecione Post Clique em Body, marque Raw, altere de text para JSON o formato do body, copie e cole o JSON a baixo no corpo do body.

## Endpoint de exemplo: 

`https://localhost:8080/customers`

## JSON de exemplo: 

```json
{
  "nome": "João Silva",
  "email": "joao.silva@example.com",
  "telefone": "1234567890",
  "celular": "9876543210",
  "estadoCivil": "Solteiro",
  "cnpj": "12345678901234",
  "cpf": "98765432101",
  "profissao": "Programador",
  "nomeDaEmpresa": "Empresa XYZ",
  "telefoneEmpresa": "987654321",
  "cargo": "Desenvolvedor",
  "cep": "12345-678",
  "endereco": "Rua Exemplo, 123",
  "numero": "123",
  "bairro": "Bairro da Amostra",
  "cidade": "Cidade Exemplo",
  "estado": "SP",
  "complemento": "Complemento da Rua"
}
