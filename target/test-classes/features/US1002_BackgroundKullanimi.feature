
  Feature: US1002 ortak baslangic adimlari Backgound olarak yazilabilir

    Background:
      Given kullanici testotomasyonu anasayfaya gider


    Scenario: TC04 Kullanici testotomasyonu sitesinde phone bulabilmeli
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC05 Kullanici testotomasyonu sitesinde dress bulabilmeli
      When arama kutusuna dress yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC06 Kullanici testotomasyonu sitesinde java bulamamali
      When arama kutusuna java yazip aratir
      Then arama sonucunda urun bulunamadigini test eder
      And sayfayi kapatir