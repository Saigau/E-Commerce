package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.proper;



public class Test_login extends BaseFile {
	
	@Test
	public void Cred() throws IOException
	
	{
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
	}

}
