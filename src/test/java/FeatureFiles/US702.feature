#1. Giriş Bilgilerinin Girilmesi:
#Kullanıcılar, kayıtlı e-posta adreslerini ve şifrelerini girmelidirler.
# Giriş formu, e-posta ve şifre giriş alanlarını içermelidir.

#2. Giriş Butonu:
#Kullanıcılar, giriş bilgilerini doldurduktan sonra "Sign In" (Giriş Yap) butonuna tıklayarak giriş işlemini tamamlayabilmelidirler.

#3. Şifremi Unuttum Seçeneği:
#Kullanıcılar, şifrelerini unuttuklarında "Forgot Your Password?" (Şifrenizi mi Unuttunuz?) seçeneği ile
# şifre sıfırlama işlemi başlatabilmelidirler.

Feature: Login Functionality

  Scenario: Login with valid username and password
    Given Navigate to Magento
    When Enter email and password and click login button
    Then User should login successfully

  Scenario: Login with valid username and password with parameter Negatif
    Given Navigate to Magento
    When Enter email as "technostudy_51231@gmail.com" and password as "dsagsagasd" and click login button
    Then User should login Negatif






