package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebSiteTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // WebDriver için gerekli ChromeDriver'ı belirtin
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testTitle() {
        // Google ana sayfasına gidin
        driver.get("https://www.google.com");

        // Sayfa başlığını alın ve doğrulayın
        String title = driver.getTitle();
        assertEquals("Google", title);
    }

    @AfterEach
    public void tearDown() {
        // Testten sonra tarayıcıyı kapatın
        if (driver != null) {
            driver.quit();
        }
    }
}
