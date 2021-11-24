package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver;

    @Given("^estoy en la página principal de efset.org$")
    public void estoy_en_la_página_principal_de_efset_org() throws Throwable {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        /*
            Creamos objeto ChromeDriver,
            levantamos una instancia en el navegador que se redirige a la página en cuestion,
            y maximizamos esa ventana
         */
        driver = new ChromeDriver();
        driver.get("https://www.efset.org");
        driver.manage().window().maximize();
    }

    @Given("^tengo internet$")
    public void tengo_internet() throws Throwable {

    }

    @Given("^quiero crear una cuenta en \"([^\"]*)\"$")
    public void quiero_crear_una_cuenta_en(String arg1) throws Throwable {

    }

    @When("^doy click en el botón de \"([^\"]*)\"$")
    public void doy_click_en_el_botón_de(String arg1) throws Throwable {
        WebElement loginLocator = driver.findElement(By.className("jss20"));
        loginLocator.click();
    }

    @When("^soy redireccionado a una página donde tengo que ingresar unos datos$")
    public void soy_redireccionado_a_una_página_donde_tengo_que_ingresar_unos_datos() throws Throwable {
    }

    @When("^ingreso un email en la barra de texto de \"([^\"]*)\"$")
    public void ingreso_un_email_en_la_barra_de_texto_de(String arg1) throws Throwable {
        driver.findElement(By.id("email"));
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("jfhvjfhv0015@gmail.com");
    }
    @When("^ingreso una contraseña en la barra de \"([^\"]*)\"$")
    public void ingreso_una_contraseña_en_la_barra_de(String arg1) throws Throwable {
        driver.findElement(By.id("password"));
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("Skpow1234");
    }

    @When("^doy click en el boton de \"([^\"]*)\"$")
    public void doy_click_en_el_boton_de(String arg1) throws Throwable {
        WebElement signInLocator =driver.findElement(By.id("submit-form-btn"));
        signInLocator.click();
    }

    @When("^soy redireccionado a la pagina principal de efset\\.org$")
    public void soy_redireccionado_a_la_pagina_principal_de_efset_org() throws Throwable {
    }

    @Then("^en donde previamente estaba el boton de \"([^\"]*)\" aparece un avatar de una persona con un menu desplegable$")
    public void en_donde_previamente_estaba_el_boton_de_aparece_un_avatar_de_una_persona_con_un_menu_desplegable(String arg1) throws Throwable {
       String actualUrl ="https://accounts.ef.com/en/efset/login/index.html?continue_uri=https%3A%2F%2Faccounts.ef.com%2Foauth2%2Fauth%3Fresponse_type%3Dtoken%26client_id%3Defcom_efset%26scope%3D%26providers%3Dfacebook%252Cgoogle%252Clinkedin%26redirect_uri%3Dhttps%253A%252F%252Fwww.efset.org%252Fredirect%252F%26state%3Dhttp%253A%252F%252Fwww.efset.org%252F";
       String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @When("^doy click en el boton del footer \"([^\"]*)\"$")
    public void doy_click_en_el_boton_del_footer(String arg1) throws Throwable {
        WebElement cookiesLocator = driver.findElement(By.className("MuiTypography-root MuiTypography-caption"));
        cookiesLocator.click();

    }

    @When("^soy redireccionado a cookie-policy$")
    public void soy_redireccionado_a_cookie_policy() throws Throwable {

    }

    @When("^ingreso mi email en la barra de texto para \"([^\"]*)\"$")
    public void ingreso_mi_email_en_la_barra_de_texto_para(String arg1) throws Throwable {

    }

    @When("^soy redireccionado a la pagina de \"([^\"]*)\"$")
    public void soy_redireccionado_a_la_pagina_de(String arg1) throws Throwable {

    }

}
