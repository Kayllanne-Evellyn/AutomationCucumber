#Author: kayllanne373evellyn@gmail.com
@regressivos
Feature: Realizar login no site saucedemo
  Como usuario do site saucedemo
  Quero informar os dados de acesso
  Para acessar a conta
  
  Background: Acessar tela de login
     Given que esteja na tela de login

@positivo
  Scenario: Login realizado com sucesso 
     When preencher os dados para login 
     Then login realizado com sucesso 
 
 @negativo  
   Scenario: Realizar login com dados em branco   
     When nao preencher os dados
     Then mensagem em tela informando que os campos devem ser preenchidos
 @negativo   
   Scenario: Realizar login com dados invalidos  
     When preencher os dados de login com dados invalidos 
     Then mensagem em tela informando que os dados estao incorretos
 @negativo   
   Scenario: Validar mensagem de erro ao inserir dados invalidos  
      When preencho os dados de login com dados invalidos 
      Then mensagem em tela informando que os dados estao invalidos
   
   