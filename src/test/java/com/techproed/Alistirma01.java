package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alistirma01 {

    //1. Seleniumda yeni bir Class acalim, ismi Alistirma_1 olsun
    //2. Main methodu yazalim
    public static void main(String[] args) {

//3. Chrome Driver’i Webdriver olarak belirleyelim
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
//4. driver Objesi olusturalim
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        //5. Browser’i 5 saniye bekletmek icin driver methodu olusturalim
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
//6. Browser ekrani tam sayfa yapmak icin driver methodu olusturalim
       // driver.manage().window().maximize();
        driver.manage().window().maximize();
//7. Browser’a www.ebay.com’a gitmesi icin driver methodu olusturalim
        //driver.get("https:\\www.ebay.com");
        driver.get("https:\\www.ebay.com");
//8. www.ebay.com’da arama kutusunu inspect yaparak buranin WebElementlerini alalim
        /*
        <input type="text" class="gh-tb ui-autocomplete-input" size="50" maxlength="300" aria-label="Search for anything" placeholder="Search for anything" id="gh-ac" name="_nkw" autocapitalize="off" autocorrect="off" spellcheck="false" autocomplete="off" aria-haspopup="true" role="combobox" aria-owns="ui-id-1">
         */
//9. Arama kutusuna erisebilmek icin aramaKutusu WebElelment Objesi olusturalim
//10. WebElementlerden id ile arama kutusuna eriselim
        //WebElement aramaKutusu = driver.findElement(By.id("gh-ac"));
        WebElement aramaKutusu = driver.findElement(By.id("gh-ac"));
//11. Arama kutusuna “mineral water bottle” gonderelim ve enter yapalim
        //aramaKutusu.sendKeys("mineral water bottle" + Keys.ENTER);
        aramaKutusu.sendKeys("mineral water bottle");
//12. Fiyat araligini 5-10 $ yapmak icin
//a1. Price linkinin altindaki ilk kutuyu inspect yaparak buranin WebElementlerini alalim
        /*
        <input data-marko="{&quot;onblur&quot;:&quot;onBlurMin s0-13-11-0-1-2-6-0-6[3]-0-textrange false&quot;,&quot;onkeyup&quot;:&quot;onKeyUp s0-13-11-0-1-2-6-0-6[3]-0-textrange false&quot;}" pattern="\d*" type="text" size="6" maxlength="13" aria-label="Minimum Value in $" class="x-textrange__input x-textrange__input--from" value="" autocomplete="off" aria-invalid="false">
        class="x-textrange__input x-textrange__input--from"
         */
//a2. ilk fiyat kutusuna erisebilmek icin ilkFiyatKutusu Objesi olusturalim
//a3. WebElementlerden class ile arama ilkFiyatKutusuna eriselim
        WebElement ilkFiyatKutusu = driver.findElement(By.xpath("//input[@class='x-textrange__input x-textrange__input--from']"));
        //WebElement ilkFiyatKutusu = driver.findElement(By.xpath("//input[@class='x-textrange__input x-textrange__input--from']"));
//a4. ilkFiyatKutusuna “5” rakami gonderelim
        ilkFiyatKutusu.sendKeys("5");
        //ilkFiyatKutusu.sendKeys("5");
//b1. Price linkinin altindaki ikinci kutuyu inspect yaparak buranin WebElementlerini alalim
        /*
        <input data-marko="{&quot;onblur&quot;:&quot;onBlurMax s0-13-11-0-1-2-6-0-6[3]-0-textrange false&quot;,&quot;onkeyup&quot;:&quot;onKeyUp s0-13-11-0-1-2-6-0-6[3]-0-textrange false&quot;}" pattern="\d*" type="text" size="6" maxlength="13" aria-label="Maximum Value in $" class="x-textrange__input x-textrange__input--to" value="" autocomplete="off" aria-invalid="false">
        //class="x-textrange__input x-textrange__input--to"
         */
//b2. ikinci fiyat kutusuna erisebilmek icin ikinciFiyatKutusu Objesi olusturalim
//b3. WebElementlerden class ile arama ikinciFiyatKutusu eriselim
        WebElement ikinciFiyatKutusu = driver.findElement(By.xpath("//input[@class='x-textrange__input x-textrange__input--to']"));
        //WebElement ikinciFiyatKutusu = driver.findElement(By.xpath("//input[@class='x-textrange__input x-textrange__input--to']"));
//b4. ikinciFiyatKutusu “10” rakami gonderelim ve calistiralim
        ikinciFiyatKutusu.sendKeys("10" );

        //ikinciFiyatKutusu.sendKeys("10" + Keys.ENTER);
//////13. Search butonunu inspect yaparak buranin WebElementlerini alalim
        /*
        <input type="submit" class="btn btn-prim gh-spr" id="gh-btn" value="Search">
         */
////////13. Webelement ile aramaYap Objesi olusturalim ve Search kutusuna arama yapmasi talimatini verelim (uc farkli sekilde)
        //WebElement aramaYap = driver.findElement(By.id("gh-btn"));
///////14. Siralama (->) butonunu inspect yaparak buranin WebElementlerini alalim
        /*
        <button aria-label="Submit price range" _sp="p2351460.m4118.l8316.c0" data-track="{&quot;eventFamily&quot;:&quot;LST&quot;,&quot;eventAction&quot;:&quot;ACTN&quot;,&quot;actionKind&quot;:&quot;NAVSRC&quot;,&quot;actionKinds&quot;:[&quot;NAVSRC&quot;],&quot;operationId&quot;:&quot;2351460&quot;,&quot;flushImmediately&quot;:false,&quot;eventProperty&quot;:{&quot;moduledtl&quot;:&quot;mi%3A4118%7Ciid%3A1%7Cli%3A8316%7Cluid%3A45%7C%7C&quot;,&quot;pageci&quot;:&quot;462e0a3d-e902-11ea-be51-9eeae9235a8d&quot;,&quot;parentrq&quot;:&quot;3406362e1740a4b7113b6a78ffffc166&quot;}}" class="btn--states x-refine__block-button  icon-btn icon-btn--no-text icon-btn--secondary" title="Submit price range" data-ebayui="" type="button"><span aria-hidden="true"><svg focusable="false" aria-hidden="true" class="svg-icon" height="16" width="16"><use xlink:href="#svg-icon-arrow-right"></use></svg></span></button>
        //class="btn--states x-refine__block-button  icon-btn icon-btn--no-text icon-btn--secondary"
         */
       // WebElement siralamaButonu = driver.findElement(By.xpath("//button[@class='btn--states x-refine__block-button  icon-btn icon-btn--no-text icon-btn--secondary']"));
      //  siralamaButonu.click();
///////15. Webelement ile siralamaYap Objesi olusturalim ve Search kutusuna arama yapmasi talimatini verelim
        // WebElement siralamaYap = driver.findElement(By.name("aria-label"));
// Bulunan sonuc sayisini gosteren yaziyi almak icin inspect yaparak buranin WebElementlerini alalim
//13. Sonuc sayisina erisebilmek icin sonucSayisi Objesi olusturalim
//14. Sonuc sayisini ekrana yazdiralim
//15. Gelen Sonuclarda benzer bir WebElement var mi diye inspect yapalim
//16. Butun sonuclari almak icin listem Objesi olusturalim
//17. listemde gecen urun isimlerini for each methodu ile alalim
//18. listemdeki urun isimlerini ekrana yadiralim
//19. 10 saniye bekleme
//20. Browseri kapatma


        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //driver.close();

    }
}
