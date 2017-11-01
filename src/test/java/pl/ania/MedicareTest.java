package pl.ania;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MedicareTest {


    public void logIn(WebDriver webDriver) {

        WebElement username = webDriver.findElement(By.name("username"));
        WebElement password = webDriver.findElement(By.name("password"));

        username.sendKeys("user1");
        password.sendKeys("user1");
        password.submit();
    }

    @Test
    public void shouldLogIn() {
        WebDriver webDriver;
        System.setProperty("webdriver.chrome.driver", "c:/tools/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://localhost:8080/");
        logIn(webDriver);

        WebElement user = webDriver.findElement(By.id("userID"));
        Assert.assertEquals(user.getText(), "user1");

    }

    @Test
    public void shouldCheckLinks() {

        WebDriver webDriver;
        System.setProperty("webdriver.chrome.driver", "c:/tools/chromedriver.exe");
        webDriver = new ChromeDriver();

        webDriver.get("http://localhost:8080/");
        logIn(webDriver);
        WebElement linkAdmin = webDriver.findElement(By.linkText("Admin"));
        linkAdmin.click();
        String currentUrl = webDriver.getCurrentUrl();

        Assert.assertEquals(currentUrl, "http://localhost:8080/admin");

        webDriver.navigate().back();
        WebElement linkMyVisits = webDriver.findElement(By.linkText("Moje wizyty"));
        linkMyVisits.click();
        String currentUrl2 = webDriver.getCurrentUrl();

        Assert.assertEquals(currentUrl2, "http://localhost:8080/my_visits");

        webDriver.navigate().back();

        WebElement selectSpecialization = webDriver.findElement(By.tagName("select"));
        List<WebElement> allOptions = selectSpecialization.findElements(By.tagName("option"));
        for (WebElement option : allOptions) {
            System.out.println(String.format("Value is: %s", option.getAttribute("value")));
            option.click();


            WebElement selectDoctors = webDriver.findElement(By.id("doctors"));
            WebElement selectselect = selectDoctors.findElement(By.name("doctorId"));
            List<WebElement> allOptionsDoctors = selectselect.findElements(By.tagName("option"));
            for (WebElement optionDoctor : allOptionsDoctors){
            System.out.println(String.format("ValueDoctor is: %s", optionDoctor.getAttribute("value")));
                optionDoctor.click();
            }

        }

    }


}
