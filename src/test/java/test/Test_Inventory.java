package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Inventory extends BaseFile {

	
	@Test
	public void invitory() throws InterruptedException, IOException {
		login.credentialsuser(proper.prop("user"));
		login.credentialspass( proper.prop("pass"));
	invit.add_item();
	}
	
}
