package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage {	
	public TrelloLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement emailTextField;
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(id="login-submit")
	private WebElement continueButton;
}
