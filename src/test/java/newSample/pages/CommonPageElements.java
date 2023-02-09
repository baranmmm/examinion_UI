package newSample.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import newSample.utilities.Driver;

public abstract class CommonPageElements extends Driver {

    public CommonPageElements() {
        PageFactory.initElements(driver,this);
    }

    public void goToSidebarOption(String sidebarOption){
        driver.findElement(By.xpath("//p[.='"+sidebarOption+"']")).click();
    }

    public WebElement getSidebarOption(String sidebarOption){
        return driver.findElement(By.xpath("//p[.='"+sidebarOption+"']"));
    }


}
