Feature: Ürün siparişi

  Background:
    Given Navigate to Magento
    When Enter email and password and click login button
    Then User should login successfully

  Scenario: Sepete rastgale ürün ekleme
    When Rastgale ürünü seç ve sepete ekle
    Then Başarıyla sepete eklenmiş olması laz
    When Odemeyi yapman gerekiyor
    Then Başarıyla sipariş verilmesi lazım