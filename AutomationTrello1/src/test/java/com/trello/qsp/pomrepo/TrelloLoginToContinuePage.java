package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginToContinuePage {

	
	public TrelloLoginToContinuePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginToContinueButton() {
		return loginToContinueButton;
	}

	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement loginToContinueButton;
}
