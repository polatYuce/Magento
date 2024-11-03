#1. Kişisel Bilgilerin Girilmesi:
#Yeni kullanıcılar, ad ve soyad bilgilerini girmelidirler.
#Form, ad ve soyad giriş alanlarını içermelidir.

#2. Giriş Bilgilerinin Girilmesi:
#Yeni kullanıcılar, geçerli bir e-posta adresi ve güvenli bir şifre belirlemelidirler.
#Form, e-posta adresi ve şifre giriş alanlarını içermelidir.
#Şifre girişi sırasında, şifrenin gücü kullanıcıya gösterilmelidir.

#3. Şifre Onayı:
#Kullanıcılar, belirledikleri şifreyi doğrulamak için bir onay şifresi girmelidirler.
#Şifre onayı giriş alanı, belirlenen şifreyle eşleşmelidir.

#4. Hesap Oluşturma Butonu:
#Kullanıcılar, formu doldurduktan sonra "Create an Account" (Hesap Oluştur) butonuna tıklayarak kayıt işlemini tamamlayabilmelidirler.

#5. Navigasyon Seçenekleri:
#Kullanıcılar, kayıt formundan çıkmak istediklerinde "Back" (Geri) seçeneği ile giriş sayfasına dönebilmelidirler.

Feature: Register Functionality

  Scenario: Successful Register
    Given Navigate to Magento
    When Enter First Name,Last Name,Email,Password, Confirm Password and Create an Account button
    Then User should Register successfully

  Scenario: Register page back
    Given Navigate to Magento
    When Click Create an Account and back home page
    Then User should back successfully

