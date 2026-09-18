# Calculadora de Soma - JavaFX

Aplicação gráfica moderna e simples desenvolvida em **Java 21** utilizando **JavaFX** e **Maven**.

---

## 📋 Sobre o Projeto

A aplicação exibe uma janela intuitiva contendo:
- Dois campos de texto (`TextField`) para digitação de valores numéricos.
- Um botão de comando (`Button`) para efetuar a soma.
- Uma caixa de mensagem (`Alert`) com estilo nativo do JavaFX que exibe o resultado da soma ou alertas de validação caso os campos estejam vazios ou contenham valores não numéricos.

---

## 📁 Estrutura de Arquivos

```text
javafx/
├── .mvn/
│   └── maven.config          # Configuração automática de plataforma para o Maven
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── exemplo/
│                   ├── App.java    # Interface gráfica, controles e lógica de soma
│                   └── Main.java   # Ponto de entrada padrão (Launcher)
├── pom.xml                   # Gerenciamento de dependências JavaFX 21 e plugins
├── run.bat                   # Script para executar no Windows (Prompt de Comando)
├── run.ps1                   # Script para executar no PowerShell
└── README.md                 # Documentação do projeto
```

---

## 🚀 Como Executar

### Opção 1: Usando os Scripts Prontos
Basta clicar duas vezes ou rodar no terminal:
- **Prompt de Comando (CMD)**:
  ```cmd
  run.bat
  ```
- **PowerShell**:
  ```powershell
  .\run.ps1
  ```

### Opção 2: Pelo Maven diretamente
```bash
mvn javafx:run
```

### Opção 3: Executando o JAR empacotado (Standalone)
Você pode gerar e executar o arquivo JAR executável completo:
```bash
mvn package
java -jar target/calculadora-javafx-1.0-SNAPSHOT-shaded.jar
```

---

## 🔍 Entendendo o Código (`App.java`)

1. **Herança de `Application`**:
   A classe estende `javafx.application.Application` e implementa o método `start(Stage primaryStage)`, que recebe o palco principal da janela.

2. **Controles de Entrada (`TextField`)**:
   - `txtValor1` e `txtValor2` recebem as entradas do usuário e possuem placeholders (`setPromptText`).

3. **Botão e Ação (`Button` e `setOnAction`)**:
   - Ao clicar em **Somar Valores**, os dados são capturados e validados.
   - O tratamento com `try-catch` (`NumberFormatException`) previne erros caso o usuário digite texto em vez de números.
   - Suporta tanto ponto (`.`) quanto vírgula (`,`) como separador decimal.

4. **Caixa de Mensagem (`Alert`)**:
   - Utiliza `Alert` com tipo `Alert.AlertType.INFORMATION` para exibir o resultado.
   - Utiliza `Alert.AlertType.WARNING` ou `ERROR` para validações e avisos ao usuário.
