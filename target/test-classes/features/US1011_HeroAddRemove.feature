
  Feature: US1011 kullanici butonlari calistirir


    Scenario: TC17 Kullanici butonlari kullanabilmeli

      Given kullanici test data dosyasinda verilen "herokuUrl" anasayfaya gider
      When kullanici Add Element butonuna basar
      And senkronizasyon icin 2 saniye bekler
      And Delete butonu’nun gorunur oldugunu test eder
      Then Delete tusuna basar
      And Add Remove Elements yazisinin gorunur oldugunu test eder
      And senkronizasyon icin 2 saniye bekler
      And Delete butonu’nun gorunur olmadigini test eder
      And sayfayi kapatir

