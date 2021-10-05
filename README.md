[comment]: <> (# Getting Started)

[comment]: <> (### TDD )

[comment]: <> (#### Desafio)

[comment]: <> (``Como usuário gostaria de uma funcionalidade que valide se uma frase ou palavra é)

[comment]: <> (palíndromo.``)

[comment]: <> (#### rodar test)

[comment]: <> (> mvn test)


## Atividade Spring Boot 
### LAB Coding
#### - Order


> Criar registro
````
URL : http://localhost:8080/order/create
Método : POST
{
  "email": "jeffersonclark@gmail.com",
  "nomeCompleto": "Jefferson Clark",
  "shippingAddress": "Rua California",
  "idPedido": 2,
  "descricaoPedido": "IPhone 13",
  "quantidadePedido": 2,
  "preco": 10000.00,
  "precoTotalPagamento": 200000.00,
  "formaPagamento": "cartao",
  "dataPedido": "01/01/2022",
  "status": "ativo",
  "idTransacao": 3,
  "numeroCartao": "21321321321",
  "validadeCartao": "99/2099",
  "bandeira": "Nubank"
}
````

> Buscar registro
 ````
URL : http://localhost:8080/order/findById/0
Método : GET
````

> Atualizar registro
```
URL : http://localhost:8080/order/update/0
Método : POST
{
  "email": "jeffersonclark@aluno.impacta.com",
  "nomeCompleto": "Jefferson Clark S de Souza",
  "shippingAddress": "Rua California - 1002 SP",
  "idPedido": 2,
  "descricaoPedido": "IPhone 13 Pro Max",
  "quantidadePedido": 2,
  "preco": 10000.00,
  "precoTotalPagamento": 200000.00,
  "formaPagamento": "cartao",
  "dataPedido": "01/01/2022",
  "status": "ativo",
  "idTransacao": 3,
  "numeroCartao": "21321321321",
  "validadeCartao": "99/2099",
  "bandeira": "ELO"
}
```
> Deletar registro
````
URL : http://localhost:8080/order/delete/0
Método : DELETE
````

-------------------------------------------------------------

#### - Payment


> Criar registro
````
URL : http://localhost:8080/payment/create
Método : POST
{
  "idTransacao": 99,
  "numeroCartao": "38210929103812",
  "validadeCartao": "99/2222",
  "bandeira": "ELO"
}
````

> Buscar registro
 ````
URL : http://localhost:8080/payment/findById/99
Método : GET
````

> Atualizar registro
```
URL : http://localhost:8080/payment/update/99
Método : POST
{
  "idTransacao": 99,
  "numeroCartao": "3821092910381223",
  "validadeCartao": "22/2221",
  "bandeira": "Master Card Black"
}
```
> Deletar registro
````
URL : http://localhost:8080/payment/delete/99
Método : DELETE
````
