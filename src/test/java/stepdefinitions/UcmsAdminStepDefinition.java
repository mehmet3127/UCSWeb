package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class UcmsAdminStepDefinition {

    @Given("Kullanıcı ucmsadmin sayfasına gider")
    public void kullanıcıUcmsadminSayfasınaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("gnsysAdmin_Url"));
    }

    @When("kullanıcı ucmsadmin için geçerli username girer")
    public void kullanıcıUcmsadminIçinGeçerliUsernameGirer() {
    }

    @And("kullanıcı ucmsadmin için geçerli password girer")
    public void kullanıcıUcmsadminIçinGeçerliPasswordGirer() {
    }

    @And("kullanıcı giriş butonuna tıklar")
    public void kullanıcıGirişButonunaTıklar() {
    }

    @Then("kullanıcı Anasayfaya girildiğini doğrular")
    public void kullanıcıAnasayfayaGirildiğiniDoğrular() {
    }

    @And("kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
    }



}
