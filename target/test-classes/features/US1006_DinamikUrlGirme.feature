
  Feature: US1006 Kullanici url'i dinamik olarak girer

    Scenario: TC10 Kullanici Url'i config dosyasindan dinamik olarak kullanabilmeli

      Given kullanici test data dosyasinda verilen "toUrl" anasayfaya gider
      Then url'in test data dosyasinda verilen "toUrl" ile ayni oldugunu test eder
      And senkronizasyon icin 5 saniye bekler
      And sayfayi kapatir


