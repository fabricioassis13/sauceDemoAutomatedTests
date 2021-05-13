# SauceDemoAutomatedTests

Este projeto foi criado com o objetivo de demonstrar meus conhecimentos sobre testes automatizados em aplicações Web. Contém apenas um caso de teste simulando uma compra com sucesso no site [SwagLabs](https://www.saucedemo.com/)

## Tecnologias Utilizadas

- Java (Versão 1.8)
- JUnit5 (Versão 5.7.1)
- Maven (Gerenciador do IntelliJ IDE)
- ExtentReports (Versão 4.0.9)
- Java Faker (Versão 1.0.2)
- WebDriverManager (Versão 4.4.1)
- IntelliJ IDE (Versão 2020.1.2)

## Padrões Utilizados
Observação: O padrão estrutural utilizado foi o PageObjects. Para o mapeamento dos elementos foi usada a técnica SimplePageObjects.

### Main/Java

- **Framework:** Pasta onde se encontram as classes de configuração do projeto
- **Models:** Pasta onde se encontram classes de modelo de objeto para dados (POJO)
- **Utils:** Pasta onde se encontram classes com métodos auxiliares que serão utilizadas em todo o projeto

### Main/Resources

Pasta onde se encontram arquivos de dados para execução dos testes

### Test/Java

- **PageObjects:** Pasta onde se encontram classes de mapeamento dos WebElements.
- **Tasks:** Pasta onde se encontram classes de interação com os WebElements.
- **TestCases:** Pasta onde se encontram classes e métodos de testes.
- **Validations:** Pasta onde se encontram todas as validações feitas pelas Tasks.

## Como executar o projeto?

Primeiramente, você deverá clonar o projeto na sua máquina por meio do seguinte comando:

> git clone linkdorepositorioondeestaoprojeto

### Abrindo o projeto na IDE:

Este projeto foi feito no IntelliJ, porém, você pode usar a IDE de sua preferência para executa-lo.

Assim que abri-lo, clique com o botão direito do mouse em cima da classe TestCases/RealizarCompraComSucesso.java e execute-a.

### Reports:

Este projeto foi construido com o gerador de relatórios ExtendReports.

Para visualizar os reports, após a execução dos testes, seram geradas pastas na raiz do projeto dentro do diretório Reports, cuja nomenclatura é Report_{DATA ATUAL}. Vá até a pasta gerada do seu teste e abra o aquivo MyReport.html.