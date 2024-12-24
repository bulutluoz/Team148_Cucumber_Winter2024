
  Feature: US1013 Kullanici belirlenen miktarda urun bulabilmeli


    Scenario Outline: TC19 kullanici arattigi urunlerin
                      belirlenen miktar veya daha fazla bulunabildigini test edebilmeli


      Given kullanici test data dosyasinda verilen "toUrl" anasayfaya gider
      When arama kutusuna "<aranacakKelime>" yazip aratir
      Then arama sonucunda "<belirlenenMiktar>" veya daha fazla urun bulunabildigini test eder
      And senkronizasyon icin 1 saniye bekler
      And sayfayi kapatir

      Examples:
      |aranacakKelime|belirlenenMiktar|
      |phone         |3               |
      |dress         |8               |
      |java          |3               |
      |samsung       |2               |
      |baby          |1               |