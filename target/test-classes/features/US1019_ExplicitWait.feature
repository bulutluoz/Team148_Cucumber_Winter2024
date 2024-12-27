
  Feature: US1019 kullanici ozel bir gorev icin bekler


    Scenario: TC25 Kullanici webelementin enabled olmasini bekleyebilmeli

      Given kullanici test data dosyasinda verilen "demoqaUrl" anasayfaya gider
      Then soldaki sekmelerden Elements'e tiklar
      And  acilan menuden Dynamic Properties'e tiklar
      And Will enable 5 seconds butonunun enable olmasini bekler
      Then butonun enable oldugunu test eder

    @wip
    Scenario: TC26 Kullanici webelementin gorunur olmasini bekleyebilmeli
      Given kullanici test data dosyasinda verilen "demoqaUrl" anasayfaya gider
      Then soldaki sekmelerden Elements'e tiklar
      And  acilan menuden Dynamic Properties'e tiklar
