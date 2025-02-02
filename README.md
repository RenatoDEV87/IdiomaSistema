# 🌍 Idioma do Sistema

Este é um programa simples em **Java** que identifica e exibe o **idioma padrão** do sistema operacional. Ele utiliza a classe `Locale` para obter essa informação.

---

## 📑 Tabela de Conteúdos

1. [📖 Descrição](#-descrição)  
2. [💻 Código](#-código)  
3. [⚙️ Como Funciona](#️-como-funciona)  
4. [🚀 Como Executar](#-como-executar)  
5. [🖥️ Exemplo de Execução](#-exemplo-de-execução)  
6. [🛠️ Tecnologias Utilizadas](#️-tecnologias-utilizadas)  
7. [🤝 Contribuições](#-contribuições)  
8. [📜 Licença](#-licença)  

---

## 📖 Descrição

Este programa foi criado para demonstrar o uso da classe `Locale` do Java, que permite capturar informações sobre **idioma e região** do sistema operacional.

O objetivo é mostrar como obter essas informações de forma simples e eficiente, sendo útil para a **internacionalização de aplicações**.

---

## 💻 Código

Abaixo está o código-fonte do programa:

```java
import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        // Obtendo o idioma do sistema
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + idioma.getDisplayLanguage());
    }
}

```

---

## Como Funciona

1. O programa usa a classe Locale para obter o idioma padrão do sistema operacional.
2. O método Locale.getDefault() captura a configuração de idioma atual.
3. O método getDisplayLanguage() retorna o nome do idioma de forma legível.
4. O resultado é exibido no console.

---

## Como Executar

Pré-requisitos

- Ter o Java Development Kit (JDK) instalado na sua máquina.
- Um terminal ou IDE (como VS Code, IntelliJ IDEA ou Eclipse) para rodar o código.

Passos para executar:

1 - Clone ou faça o download do repositório:

```java
git clone https://github.com/seu-usuario/idioma-do-sistema.git
cd idioma-do-sistema
```
2 - Compilar o programa:

```java
javac IdiomaSistema.java
```
3 - Execute o programa:

```java
java IdiomaSistema
```

---

## Exemplo de Execução

Saída esperada no console:

```java
O idioma do sistema é: português
```
Nota: Se o idioma do seu sistema estiver configurado para inglês, o resultado será:

```java
O idioma do sistema é: English
```

---

## Tecnologias Utilizadas

- Linguagem: Java
- Biblioteca utilizada: java.util.Locale

---

## Licença

Este projeto está licenciado sob a MIT License.