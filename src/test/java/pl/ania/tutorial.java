package pl.ania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tutorial {

    public static void main(String[] args) {

        WebDriver webDriverF;
        System.setProperty("webdriver.chrome.driver", "c:/tools/chromedriver.exe");
//        webDriverF = new ChromeDriver();
//
//        String url = "http://www.facebook.com";
//        webDriverF.get(url);
//
//        String tagName = webDriverF.findElement(By.id("email")).getTagName();
//        System.out.println(tagName);
//        webDriverF.close();

//        WebDriver webDriverM = new ChromeDriver();
//
//        webDriverM.get("http://demo.guru99.com/selenium/newtours/");
//        WebElement webElementUserName = webDriverM.findElement(By.name("userName"));
//        WebElement webElementPassword = webDriverM.findElement(By.name("password"));
//        webElementUserName.sendKeys("tutorial");
//        webElementPassword.sendKeys("tutorial");
//        webDriverM.findElement(By.name("submit")).click();

//        WebDriver webDriverM = new ChromeDriver();
//
//        webDriverM.get("http://demo.guru99.com/selenium/deprecated.html");
//        webDriverM.switchTo().frame("classFrame");
//        webDriverM.findElement(By.linkText("Deprecated")).click();
//        webDriverM.close();

        webDriverF = new ChromeDriver();

//        webDriverF.get("http://demo.guru99.com/selenium/newtours/");
//        webDriverF.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
//        String text = webDriverF.switchTo().alert().getText();
//        webDriverF.switchTo().alert().accept();
//        System.out.println(text);
//        webDriverF.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriverF.close();
        WebDriverWait wait = new WebDriverWait(webDriverF, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
//        webDriverF.findElement(By.name("userName")).sendKeys("tutorial");

//        WebElement username = webDriverF.findElement(By.name("userName"));
//        if (username.isEnabled()){
//            username.sendKeys("tutorial");
//        }
//
//        WebElement username = webDriverF.findElement(By.name("userName"));
//        do {
//
//        } while (username.isDisplayed());

//        webDriverF.get("http://demo.guru99.com/selenium/newtours/reservation.php");
//        if (webDriverF.findElement(By.cssSelector("input[value = \"roundtrip\"]")).isSelected()){
//            webDriverF.findElement(By.cssSelector("input[value = \"oneway\"]")).click();
//        }

//        if (wait.until(ExpectedConditions.alertIsPresent()) != null){
//            System.out.println("alert is present");
//        }
//
//        wait.until(ExpectedConditions.elementToBeClickable(webDriverF.findElement(By.name("userName"))));
//
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("viewFrame"));
//
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
//            webDriverF.findElement(By.name("username")).sendKeys("tutorial");
//        } catch (TimeoutException toe){
//            toe.toString();
//        }


//        webDriverF.get("http://demo.guru99.com/selenium/webform/radio.html");
//        WebElement radio1 = webDriverF.findElement(By.id("vfb-7-1"));
//        WebElement radio2 = webDriverF.findElement(By.id("vfb-7-2"));
//
//        //Radio Button1 is selected
//        radio1.click();
//        System.out.println("Radio Button Option 1 Selected");
//
//        //Radio Button1 is de-selected and Radio Button2 is selected
//        radio2.click();
//        System.out.println("Radio Button Option 2 Selected");
//
//        // Selecting CheckBox
//        WebElement option1 = webDriverF.findElement(By.id("vfb-6-0"));
//
//        // This will Toggle the Check box
//        option1.click();
//
//        // Check whether the Check box is toggled on
//        if (option1.isSelected()) {
//            System.out.println("Checkbox is Toggled On");
//
//        } else {
//            System.out.println("Checkbox is Toggled Off");
//        }
//
//
//        //Selecting Checkbox and using isSelected Method
//        webDriverF.get("http://demo.guru99.com/selenium/facebook.html");
//        WebElement chkFBPersist = webDriverF.findElement(By.id("persist_box"));
//        for (int i = 0; i < 2; i++) {
//            chkFBPersist.click();
//            System.out.println("Facebook Persists Checkbox Status is -  " + chkFBPersist.isSelected());
//
//
//        }

//        webDriverF.get("http://demo.guru99.com/selenium/newtours/register.php");
//        Select drpCountry = new Select(webDriverF.findElement(By.name("country")));
//        drpCountry.selectByVisibleText("ANTARCTICA");
//        webDriverF.close();


//
//
//        webDriverF.get("http://newtours.demoaut.com/");
//        String innerText = webDriverF.findElement(By.xpath("//table[@width = \"270\"]/tbody/tr[4]/td")).getText();
//        System.out.println(innerText);
////        webDriverF.quit();
//
//        String text = webDriverF.findElement(By
//                .xpath("//table/tbody/tr/td[2]" +
//                        "/table/tbody/tr[4]/td/" +
//                        "table/tbody/tr/td[2]/" +
//                        "table/tbody/tr[2]/td[1]/" +
//                        "table[2]/tbody/tr[3]/td[2]/" +
//                        "font")).getText();
//        System.out.println(text);
//        //table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font
//    }
//
//        webDriverF.get("http://newtours.demoaut.com/");
//        WebElement link = webDriverF.findElement(By.linkText("Home"));
//        WebElement td_home = webDriverF.findElement(By
//                .xpath("//table/tbody/tr/td[1]" +
//                "/table/tbody/tr/td/" +
//                        "table/tbody/tr/td" +
//                        "/table/tbody/tr[1]/td[2]" +
//                        "/font/a"));
//
//        Actions builder = new Actions(webDriverF);
//        Action mouse = builder
//                .moveToElement(link)
//                .build();
//
//        String bgcolor = td_home.getCssValue("bordercolor");
//        System.out.println(bgcolor);
//        mouse.perform();
//        System.out.println(bgcolor);
//        webDriverF.close();

//        webDriverF.get("https://www.facebook.com/");
//        WebElement webElement = webDriverF.findElement(By.id("email"));
//
//        Actions builder = new Actions(webDriverF);
//        Action mouse = builder
//                .moveToElement(webElement)
//                .keyDown(webElement, Keys.SHIFT)
//                .sendKeys(webElement, "hello")
//                .keyUp(webElement, Keys.SHIFT)
//                .doubleClick()
//                .contextClick()
//                .build();
//
//        mouse.perform();


        webDriverF.get("http://demo.guru99.com/selenium/upload/");
        WebElement uploadFile = webDriverF.findElement(By.id("uploadfile_0"));
        uploadFile.sendKeys("C:/users/lukasz/Desktop/Ania/github/selenium/file.txt");

        webDriverF.findElement(By.id("terms")).click();

        webDriverF.findElement(By.name("send")).click();


    }
}

