


Feature: US1001 Testotomasyonu phone arama testi

  Scenario: TC01 Kullanici testotomasyonu sitesinde phone bulabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

