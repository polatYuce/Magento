#1. TAB menüsünde "What's New", "Women", "Men", "Gear", "Training" ve "Sale" olmak üzere ana kategoriler bulunmalıdır.
# 2. Her ana kategoriye tıklandığında ilgili alt kategoriler görüntülenmelidir.
#3. "Women" ve "Men" ana kategorilerine tıklandığında, ilgili alt kategoriler olan "Tops" ve "Bottoms" alt kategorileri görüntülenmelidir.
#4. "Tops" ve "Bottoms" alt kategorilerine tıklandığında, ilgili ürün alt kategorileri görüntülenmelidir.
#5. Menü düzgün şekilde çalışmalı ve tüm linkler çalışır durumda olmalıdır.

Feature: TAB menü Functionality

  Background:
    Given Navigate to Magento
    When Enter email and password and click login button
    Then User should login successfully

  Scenario:TAB menü kontrolü

    And Click on the Element in Dialog
      | whatsNew |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | women |
      | tops  |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | women   |
      | bottoms |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | men     |
      | bottoms |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | gear |
      | bags |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | gear             |
      | fitnessEquipment |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | gear    |
      | watches |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | training      |
      | videoDownload |
    Then The user should successfully open page.

    And Click on the Element in Dialog
      | Sale |
    Then The user should successfully open page.












