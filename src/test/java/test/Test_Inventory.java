package test;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Inventory extends BaseFile {

	
	@Test
	public void invitory() throws InterruptedException {
		login.credentialsuser("user");
		login.credentialspass("pass");
	invit.add_item();
	}
	
}
