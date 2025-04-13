package Pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;

public class Homepage extends PageObject
{
	private By AdminButton=By.xpath("//span[normalize-space()='Admin']");
	private By jobsTab=By.xpath("//span[normalize-space()='Job']");
	private By JobTitles=By.xpath("//a[normalize-space()='Job Titles']");
	private By userProfile=By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]");
	private By userLogout=By.xpath("//a[normalize-space()='Logout']");
	static String title="OrangeHRM";
	
	public void verifyHomepage()  {
		
	assertTrue(getDriver().getTitle().contains(Homepage.title));
	}
	
	   public void clickAdminTab()
	    {
	    	$(AdminButton).click();
	    }
	   
	public void navigateToJobTitles()
	{
		$(jobsTab).click();
		$(JobTitles).click();
	}
	public void logout()
	{
		$(userProfile).click();
		$(userLogout).click();

	}
}
