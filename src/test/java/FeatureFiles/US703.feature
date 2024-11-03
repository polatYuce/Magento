#1. Müşteriler, hesaplarına yeni bir adres ekleyebilmelidir.
#2. Adres eklerken, kullanıcıların gerekli alanları doldurması gerekmelidir
# (ad, soyad, adres satırı, şehir, posta kodu, ülke vb.).
# 3. Kullanıcılar, ekledikleri adresleri daha sonra düzenleyebilmelidir.
# 4. Kullanıcılar, ekledikleri adresleri silebilmelidir.
#5. Her bir adresin bir "Varsayılan Fatura Adresi" ve "Varsayılan Teslimat Adresi" seçeneği bulunmalıdır.

Feature: Adres ekleme Functionality

  Background:
    Given Navigate to Magento
    When Enter email and password and click login button
    Then User should login successfully
    Then Go to My Account.

  Scenario Outline: Successful address addition
    When Enter your address details.Name as "<name>" surname as "<surname>"  Company as "<Company>" PhoneNumber as "<PhoneNumber>" StreetAddress as "<StreetAddress>" City as "<City>" StateProvince as "<StateProvince>" Zip as"<Zip>" Country as "" click save adrees button.
    Then User should saved the address successfully
    Examples:
      | name      | surname | Company | PhoneNumber | StreetAddress | City      | StateProvince   | Zip      |
      | FD12SSADF | FDSSFD  | FDAS    | 5464356546  | DSFD          | sdgaads   | dgasafsafsdgds  | 10213    |
      | FS32ADF   | SDFFSA  | SDAF    | 5464356526  | DSFD          | sdsagaads | ddsafasdgasdgds | 10212343 |
      | FS321ADFS | FDSSAF  | GFAG    | 54643565446 | DSFD          | sdgdfaads | sadfdas         | 10213    |

  Scenario:Edit address
    When Correct your address details. ChangedName as "yüce" Changedsurname as "sad" click save adrees button.
    Then User should saved the address successfully

  Scenario:Delete address
    When Adress delete
    Then User should deleted the address successfully






