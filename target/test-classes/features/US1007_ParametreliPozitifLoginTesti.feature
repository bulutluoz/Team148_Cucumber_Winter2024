
  Feature: US1007 Kullanici gecerli bilgilerle sisteme giris yapar

    @wip
    Scenario: TC11 Gecerli bilgilerle sisteme giris yapilabilmeli

      Given kullanici test data dosyasinda verilen "toUrl" anasayfaya gider
      Then account butonuna basar
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecerliPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilabildigini test eder
      And senkronizasyon icin 3 saniye bekler
      And sayfayi kapatir
