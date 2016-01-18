import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;


//pobranie xpath obrazka do img, getatrubute (source), pobranie obrazka przez stream na dysk
//jeden xpath do wszystkich obrazków, zapisanie do listy (findElements)


//MD5 na pliku który chce zapisać albo zapisywać go z TEMP nazwą i później sprawdzać czy nie ma takiego a poźniej zmienić na nazwę z URL



/**
 * Created by Marcin on 2015-12-17.
 */
public class ForchanPageTest {

    private static WebDriver driver;
    ForchanPage forchan = PageFactory.initElements(driver, ForchanPage.class);
//    List<WebElement> listOfImages;


    @BeforeClass
    public static void setUpBeforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://boards.4chan.org/wg");
    }

    @Before
    public void setUp() {

        driver.manage().window().maximize();
    }

    @Test
    public void imageTest() throws IOException {
        forchan.getListOfImages();
        Utils.saveHashToFile(forchan.getListOfImages().get(0).getAttribute("src"));
        Utils.downloadImage(forchan.getListOfImages().get(0).getAttribute("src"));
    }

    @After
    public void tearDown() {
        //driver.quit();
    }
}
