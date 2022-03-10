package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAplicacao() {
        driver.get("https://portal.brq.com/");
    }
    public void nomeUsuario() {
        driver.findElement(By.id("txtUsuario")).sendKeys("riazevedo");
    }
    public void digitarSenha() {
        driver.findElement(By.id("txtSenha")).sendKeys("Server3131@");
    }
    public void clicarEntrar() {
        driver.findElement(By.id("btnEntrar")).click();
        driver.findElement(By.id("txtEmpréstimo/Consignado")).click();
    }

}
