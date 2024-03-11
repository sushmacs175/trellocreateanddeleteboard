package com.trello.testscript;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.trello.qsp.genericutility.BaseClass;
import com.trello.qsp.pomrepo.TrelloHomePage;
import com.trello.qsp.pomrepo.TrelloJailerPage;
import com.trello.qsp.pomrepo.TrelloLoginPage;
import com.trello.qsp.pomrepo.TrelloLoginToContinuePage;
import com.trello.qsp.pomrepo.TrelloLogoutPage;
import com.trello.qsp.pomrepo.TrelloUserWorkSpacePage;

public class CreateAndDeleteBoard extends BaseClass{
	

	@Test                                                                                                                 
	public void OneEndToEndUponTrello() throws IOException
	{
			TrelloHomePage homePage = new TrelloHomePage(driver);
			homePage.getLoginOption().click();
			
			TrelloLoginPage loginPage = new TrelloLoginPage(driver);
			
			loginPage.getEmailTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("email"));
			loginPage.getContinueButton().submit();
			
			TrelloLoginToContinuePage loginToContinuePage = new TrelloLoginToContinuePage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
			
			loginToContinuePage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
			loginToContinuePage.getLoginToContinueButton().submit();
			TrelloUserWorkSpacePage userWorkSpacePage = new TrelloUserWorkSpacePage(driver);
			userWorkSpacePage.getCreateNewBoardOption().click();
			userWorkSpacePage.getBoardTitleTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("boardtitle"));
			userWorkSpacePage.getCreateBoardButton().click();
			TrelloJailerPage jailerPage = new TrelloJailerPage(driver);
			jailerPage.getMenuOption().click();
			jailerPage.getLogoutOption().click();
			TrelloLogoutPage logoutPage = new TrelloLogoutPage(driver);
			logoutPage.getLogoutButton().click();
			
			
	    
	}
}
