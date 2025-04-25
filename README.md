# 🔐 API de Autenticação e Autorização com Spring Boot

Esta API tem como objetivo demonstrar a implementação de uma arquitetura segura utilizando Spring Boot, Spring Security, autenticação baseada em roles e permissões, e persistência com MySQL. 

Ela pode servir de base para projetos que exigem controle de acesso robusto baseado em usuários, papéis (roles) e permissões.

---

## 📌 Funcionalidades

- Cadastro de usuários com criptografia de senha
- Autenticação com Spring Security
- Associação de usuários a papéis (roles)
- Associação de papéis a permissões
- Validação de acesso a rotas com base em permissões
- Banco de dados relacional com MySQL
- Padrão RESTful
- JWT (JSON Web Token)

---

## 🧱 Estrutura das Entidades

- **Usuário**: nome, email, senha, data de criação, estado (ativo/inativo)
- **Papel (Role)**: nome, data de criação, estado
- **Permissão**: nome, data de criação, estado
- **Usuário-Papel**: vínculo entre usuários e papéis
- **Papel-Permissão**: vínculo entre papéis e permissões

---

## ⚙️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Maven
- Docker
- Lombok (opcional)
- JWT
- Postman para testes

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- Java 17+
- MySQL
- IDE (IntelliJ, Eclipse, VS Code etc.)

### Passos

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/springboot-auth-api.git
cd springboot-auth-api
