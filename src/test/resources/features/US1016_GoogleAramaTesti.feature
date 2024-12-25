
  Feature: US1015 kullanici arama sonuclarini yazdirir

    Scenario: TC22 Kullanici ilk 10 arama sonucunu yazdirir

      Given kullanici google anasayfaya gider
      Then google cookies kabul eder
      When google'da "Apple" icin arama yapar
      And ilk 10 sonucu yazdirir



