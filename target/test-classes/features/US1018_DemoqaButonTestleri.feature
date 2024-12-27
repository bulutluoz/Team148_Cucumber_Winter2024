
  Feature: US1018 kullanici Demoqa sayfasindaki butonlari kullanir


    Scenario: TC24 kullanici butonlarin calistigini test edebilmeli

      Given kullanici test data dosyasinda verilen "demoqaUrl" anasayfaya gider
      Then soldaki sekmelerden Alerts'e tiklar
      When On button click, alert will appear after 5 seconds karsisindaki click me butonuna basar
      And Allert’in gorunur olmasini bekler
      Then Allert uzerindeki yazinin "This alert appeared after 5 seconds" oldugunu test eder
      And Ok diyerek alerti kapatir