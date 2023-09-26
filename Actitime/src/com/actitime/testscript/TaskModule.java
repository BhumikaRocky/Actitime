package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule extends BaseClass
{
	@Test
	public void testCreateTask() throws EncryptedDocumentException, IOException
	{
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTasksTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn();
		t.getNewTaskOption().click();
		t.getEnterCustomerName().click();
		t.getCustomerName().click();
		t.getEnterProjectName().click();
		t.getProjectName().click();
		FileLib f = new FileLib();
		String taskname = f.getExcelData("CreateCustomer", 3, 6);
		t.getEnterTaskName().sendKeys(taskname);
		t.getNewTasksBtn().click();
		String actualTaskName = t.getActualTask().getText();
		Assert.assertEquals(actualTaskName, taskname);
	}
}