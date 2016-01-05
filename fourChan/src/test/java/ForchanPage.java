import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Marcin on 2015-12-17.
 */
public class ForchanPage {

    private WebDriver driver;
    public ForchanPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String IMAGE = "//a[contains(@class,'fileThumb')]//img";

    @FindBy(xpath = IMAGE)
    private List<WebElement> image;


    public List<WebElement> getListOfImages() {
      return image;
    }
}