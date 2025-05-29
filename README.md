# 🚀 Delivery API - Gerenciamento Inteligente de Entregas

![GitHub repo size](https://img.shields.io/github/repo-size/leonardobossolanidev/delivery-api-v2)
![GitHub language count](https://img.shields.io/github/languages/count/leonardobossolanidev/delivery-api-v2)
![GitHub top language](https://img.shields.io/github/languages/top/leonardobossolanidev/delivery-api-v2)
![GitHub last commit](https://img.shields.io/github/last-commit/leonardobossolanidev/delivery-api-v2)
![License](https://img.shields.io/github/license/leonardobossolanidev/delivery-api-v2)

## 📦 Sobre o Projeto

Delivery API é uma aplicação backend desenvolvida em **Java 17** com **Spring Boot**, que oferece uma solução robusta e segura para gerenciar entregas de forma eficiente.  
Pensada para empresas e clientes, a API integra funcionalidades como cadastro, atualização, consulta e remoção de entregas, além de autenticação via JWT para proteger os dados.

---

## ⚙️ Funcionalidades Principais

- CRUD completo de entregas (Create, Read, Update, Delete)  
- Autenticação e autorização JWT para segurança avançada  
- Estrutura modular seguindo boas práticas (Controller, Service, Repository)  
- Integração com banco de dados MySQL Server  
- Configuração via Maven para fácil gerenciamento de dependências  
- Tratamento de erros personalizado para melhor experiência do usuário

---

## 🛠 Tecnologias Utilizadas

| Tecnologia         | Versão          | Descrição                         |
|--------------------|-----------------|----------------------------------|
| Java               | 17              | Linguagem de programação          |
| Spring Boot        | 3.x             | Framework para APIs RESTful       |
| Maven              | Última versão   | Gerenciamento de dependências     |
| MySQL Server       | 8.x             | Banco de dados relacional         |
| JWT                | Biblioteca      | Segurança e autenticação          |
| Git & GitHub       | -               | Controle de versão e hospedagem   |

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/leonardobossolanidev/delivery-api-v2.git
Configure o banco de dados MySQL Server e atualize as credenciais no arquivo src/main/resources/application.properties.

Execute a aplicação:

Com Maven instalado:

bash
Copiar
Editar
mvn spring-boot:run
Ou com o wrapper Maven (Linux/Mac):

bash
Copiar
Editar
./mvnw spring-boot:run
No Windows:

powershell
Copiar
Editar
mvnw.cmd spring-boot:run
Acesse os endpoints via http://localhost:8080/api/entregas.

📄 Endpoints Disponíveis
Método	Endpoint	Descrição
POST	/api/entregas	Criar nova entrega
GET	/api/entregas	Listar todas as entregas
GET	/api/entregas/{id}	Buscar entrega por ID
PUT	/api/entregas/{id}	Atualizar entrega
DELETE	/api/entregas/{id}	Remover entrega

🔐 Segurança
Autenticação JWT para proteger os recursos da API

Endpoints protegidos para garantir que apenas usuários autenticados acessem

🤝 Contribuindo
Contribuições são muito bem-vindas! Para colaborar:

Fork o repositório

Crie uma branch com a sua feature (git checkout -b feature/nome-da-feature)

Faça commit das suas alterações (git commit -m 'Adiciona nova feature')

Faça push para a branch (git push origin feature/nome-da-feature)

Abra um Pull Request aqui no GitHub

📞 Contato
Leonardo Bossolani Oliveira Mendes

GitHub: leonardobossolanidev

LinkedIn: linkedin.com/in/leonardobossolani

📄 Licença
Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para detalhes.

Gostou do projeto?
Deixe uma ⭐ para apoiar o desenvolvimento!
