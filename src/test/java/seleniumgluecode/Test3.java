package seleniumgluecode;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {

    private ChromeDriver driver;

    @Given("^estoy en la pagina de youtube")
    public void estoy_en_la_pagina_youtube() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        /*
            Creamos objeto ChromeDriver,
            levantamos una instancia en el navegador que se redirige a la página en cuestion,
            y maximizamos esa ventana
         */
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }

    @Given("elegir video")
    public void elegir_video() {
        WebElement input = driver.findElement(By.id("search"));
        input.sendKeys("La Humanidad No Puede Reproducirse Desde Hace 18 Años");
    }


}