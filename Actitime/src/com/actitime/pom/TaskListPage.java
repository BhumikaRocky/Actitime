package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath=" //input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescriptionTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement enterProjectNameTbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerDD;
	
	@FindBy(xpath="//div[text()='HDFC_001' and @class='itemRow cpItemRow ']")
	private WebElement customerNameTx;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjectDescriptionTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualProject;
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskOption;
	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//div[text()='HDFC_001' and @class='itemRow cpItemRow selected']")
	private WebElement customerName;
	
	@FindBy(xpath="//div[text()='- Select Project -']")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//div[text()='HDFC Bank' and @class='itemRow cpItemRow ']")
	private WebElement projectName;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[1]")
	private WebElement enterTaskName;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement newTasksBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualTask;
	
	public WebElement getNewProjectOption() 
	{
		return newProjectOption;
	}
	public WebElement getEnterProjectNameTbx() 
	{
		return enterProjectNameTbx;
	}
	public WebElement getCustomerDD() 
	{
		return customerDD;
	}
	public WebElement getCustomerNameTx() 
	{
		return customerNameTx;
	}
	public WebElement getEnterProjectDescriptionTbx() 
	{
		return enterProjectDescriptionTbx;
	}
	public WebElement getCreateProjectBtn() 
	{
		return createProjectBtn;
	}
	public WebElement getActualProject() 
	{
		return actualProject;
	}
	public WebElement getNewTaskOption() 
	{
		return newTaskOption;
	}
	public WebElement getEnterCustomerName() 
	{
		return enterCustomerName;
	}
	public WebElement getCustomerName() 
	{
		return customerName;
	}
	public WebElement getEnterProjectName() 
	{
		return enterProjectName;
	}
	public WebElement getProjectName() 
	{
		return projectName;
	}
	public WebElement getEnterTaskName() 
	{
		return enterTaskName;
	}
	public WebElement getNewTasksBtn() 
	{
		return newTasksBtn;
	}
	public WebElement getActualTask() 
	{
		return actualTask;
	}
	public TaskListPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() 
	{
		return addNewBtn;
	}
	public WebElement getNewCustomerOption() 
	{
		return newCustomerOption;
	}
	public WebElement getEnterCustNameTbx() 
	{
		return enterCustNameTbx;
	}
	public WebElement getEnterCustDescriptionTbx() 
	{
		return enterCustDescriptionTbx;
	}
	public WebElement getSelectCustomerDD() 
	{
		return selectCustomerDD;
	}
	public WebElement getBigBangCompanyTx() 
	{
		return bigBangCompanyTx;
	}
	public WebElement getCreateCustomerBtn() 
	{
		return createCustomerBtn;
	}
	public WebElement getActualCustomer() 
	{
		return actualCustomer;
	}	
}