package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Store_hours extends BaseFile {

	@Test
	public void Store_hours_rules() throws IOException, InterruptedException {
		
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		Store_hours_creationwise.store_hours_creation_part();
	}
	
	
	
	
}
