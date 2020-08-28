package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input" dir="auto" tabindex="19">
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("samsung headphones" + Keys.ENTER);
        //aramaKutusu.submit();

        //<span dir="auto">1-16 of 357 results for</span>

        WebElement sonucSayisi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(sonucSayisi.getText());

        //<span class="a-size-medium a-color-base a-text-normal" dir="auto">Samsung Galaxy Buds Live, True Wireless Earbuds w/Active Noise Cancelling (Wireless Charging Case Included), Mystic Black (US Version)</span>

        //WebElement ilkUrun = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'"));
       // System.out.println(ilkUrun.getText());


        //<span class="a-size-medium a-color-base a-text-normal" dir="auto">Başlık</span>
        List<WebElement> listem = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(listem.get(2).getText());

        for (WebElement w : listem){
            System.out.println(w.getText());
        }








    }

}
