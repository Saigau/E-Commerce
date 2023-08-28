package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Inventory extends BaseFile {

	
	@Test
	public void invitory() throws InterruptedException, IOException {
		login.credentialsuser(proper.prop("user"));
<<<<<<< HEAD
		login.credentialspass( proper.prop("pass"));
=======
		login.credentialspass(proper.prop("pass"));
>>>>>>> 8ece73f92a3ad8e633f07d95fa140232684840b8
	invit.add_item();
	}
	
}
