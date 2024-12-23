

@deneme
Feature: US1001 Testotomasyonu phone arama testi

  Scenario: TC01 Kullanici testotomasyonu sitesinde phone bulabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

  @smoke @E2E1 @regression
  Scenario: TC02 Kullanici testotomasyonu sitesinde dress bulabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

  Scenario: TC03 Kullanici testotomasyonu sitesinde java bulamamali
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna java yazip aratir
    Then arama sonucunda urun bulunamadigini test eder
    And sayfayi kapatir