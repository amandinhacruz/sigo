# 🚨 SIGO – Sistema de Registro de Ocorrências

O **SIGO** é um projeto acadêmico desenvolvido para gerenciar **registros de ocorrências** e o **controle de usuários**, aplicando boas práticas de desenvolvimento backend com **Spring Boot**, **autenticação JWT** e integração com **banco de dados PostgreSQL** hospedado no **Neon**.  
O sistema conta ainda com um **front-end em React**, hospedado na **Vercel**, que consome as rotas da API.

---

## 🌐 Links do projeto

| Parte | Link | Tecnologias |
|-------|------|--------------|
| 🖥️ Front-end | [p-i-cbmpe.vercel.app](https://p-i-cbmpe.vercel.app/list) | React, Vite, Tailwind |
| ⚙️ Back-end | [sigo-2hnz.onrender.com](https://sigo-2hnz.onrender.com) | Java, Spring Boot |
| 🗄️ Banco de dados | Neon (PostgreSQL) | — |

---

## 🧠 Visão geral

O sistema permite o **cadastro, listagem e atualização de ocorrências**, além do **gerenciamento de usuários com diferentes níveis de permissão**.  
Usuários autenticados podem acessar as funcionalidades de CRUD e apenas administradores (`ROLE_ADMIN`) podem criar novos usuários.

---

## ⚙️ Funcionalidades principais

- 🔐 **Autenticação e autorização** via JWT (JSON Web Token)  
- 👥 **Controle de acesso** baseado em roles (`USER` e `ADMIN`)  
- 🧾 **CRUD de ocorrências** – criação, atualização e listagem  
- 🧍 **CRUD de usuários** – cadastro e listagem  
- ✅ **Validação de dados** com Spring Validation  
- 🧱 **Persistência com ORM (JPA/Hibernate)**  
- 🌍 **Integração com front-end em React**

---

## 🛠️ Tecnologias e ferramentas utilizadas

### 💻 Backend
- **Java 17**
- **Spring Boot 3.5.6**
  - `spring-boot-starter-web` → Criação das APIs REST  
  - `spring-boot-starter-data-jpa` → ORM com Hibernate  
  - `spring-boot-starter-security` → Autenticação e autorização  
  - `spring-boot-starter-validation` → Validação de campos
- **JJWT (io.jsonwebtoken)** → Geração e validação de tokens JWT  
- **Lombok** → Redução de código repetitivo (getters, setters, builders)
- **Maven** → Gerenciamento de dependências e build

### 🗄️ Banco de dados
- **PostgreSQL** (hospedado no **Neon**)  
- Configuração via **Spring Data JPA**

### 🎨 Front-end
- **React**  
- **Vite**  
- **Tailwind CSS**  
- **Hospedagem:** Vercel

---

## 🧩 Estrutura do sistema

| Módulo | Descrição |
|--------|------------|
| `auth` | Autenticação e geração de tokens JWT |
| `usuarios` | CRUD de usuários e controle de permissões |
| `ocorrencias` | CRUD de registros de ocorrências |
| `security` | Configuração de segurança e filtros JWT |
| `repository` | Interfaces de persistência JPA |
| `model` | Entidades e enums do sistema |

---


