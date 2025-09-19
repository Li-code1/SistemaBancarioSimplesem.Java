💳 Sistema Bancário Simples em Java

Este projeto é um sistema bancário básico desenvolvido em Java. Ele permite que o usuário visualize o saldo da conta, realize saques, faça depósitos e acompanhe o histórico de movimentações financeiras.

🚀 Funcionalidades

Visualizar saldo atual

Realizar saques com verificação de saldo

Realizar depósitos com validação de valor

Exibir total sacado e total depositado

Interface de menu interativo via terminal

📦 Estrutura do Projeto


BancoSimples.java

README.md

🛠️ Tecnologias Utilizadas
Java (JDK 8 ou superior)

Scanner (para entrada de dados via terminal)

📋 Como Executar

Clone o repositório ou copie o código para um arquivo chamado BancoSimples.java.

Compile o código:


javac BancoSimples.java
Execute o programa:



java BancoSimples

🧪 Exemplo de Uso
text
💰 Menu:
1 - Ver saldo
2 - Realizar saque
3 - Realizar depósito
4 - Sair

Escolha uma opção: 2

Digite o valor do saque: R$200

✅ Saque de R$200 realizado com sucesso.

📌 Observações

O saldo inicial é definido como R$1000, mas pode ser alterado no construtor da classe BancoSimples.

O sistema não salva os dados após o encerramento (sem persistência em arquivo ou banco de dados).

📈 Melhorias Futuras

Suporte a múltiplas contas

Autenticação com senha

Persistência de dados em arquivo ou banco de dados

Interface gráfica com JavaFX ou Swing

🧑‍💻 Autor
Desenvolvido por Liliane Lima como exemplo de sistema bancário simples em Java. Contribuições e melhorias são bem-vindas!
