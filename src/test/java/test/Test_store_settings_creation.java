package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_store_settings_creation extends BaseFile {


	@Test
	public void Store_part() throws IOException, InterruptedException {
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass")); 
		store_settings_create.store_create_add();


	}


}
