#AC05
#1. Kullanıcı, hesabına giriş yaptıktan sonra ana sayfada gezinmeye başladığında, herhangi bir ürünü sepete ekleyebilmelidir.
#2. Sepete eklenecek ürün, rastgele bir ürün olmalıdır.
#3. Kullanıcı, sepete eklediği her ürünün sayısını seçebilmelidir.
# 4. Kullanıcı, sepete eklediği bir ürünü sepetten çıkarabilmelidir.
# 5. Kullanıcı, sepete eklediği ürünleri kontrol edebilmeli ve gerektiğinde miktarlarını değiştirebilmelidir.

Feature: sepete ekleme Functionality

  Background:
    Given Navigate to Magento
    When Enter email and password and click login button
    Then User should login successfully

  Scenario: Sepete rastgale ürün ekleme
    When Rastgale ürünü seç ve sepete ekle
    Then Başarıyla sepete eklenmiş olması laz

  Scenario: Rastgale sepete eklenen ürününün miktarını değiştirme paramater
    When Sepete git ürünün sayısını değiştir
    Then Başarıyla miktar değişmiş olması lazım

  Scenario: Sepetteki ürünü silme
    When Sepete git ürünü sil


