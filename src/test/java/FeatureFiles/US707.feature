Feature: Arama (Search functionality)

  Background:
    Given Navigate to Magento
    When Enter email and password and click login button
    Then User should login successfully

  Scenario: Olan ürünü arama
    When ürün ara
    Then Ürünün olduğunu doğrular

  Scenario: Olmayan ürünü arama
    When Olmayan ürünü ara
    Then Ürünün olmadığını doğrula