@UcmsLoginTest
Feature: Login Test

  @UcmsPozitifLoginTest
  Scenario: TC_001_PozitifLoginTest
    Given Kullanıcı ucmsadmin sayfasına gider
    When kullanıcı ucmsadmin için geçerli username girer
    And kullanıcı ucmsadmin için geçerli password girer
    And kullanıcı giriş butonuna tıklar
    Then kullanıcı Anasayfaya girildiğini doğrular
    And kullanıcı sayfayı kapatır
