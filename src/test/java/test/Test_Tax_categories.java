package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Tax_categories extends BaseFile {

	
	
	
	@Test
	public void Test_Tax_categories_levelc() throws IOException, InterruptedException {
		
		
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		Tax_categories_lev.Tax_categories_wise();
		
	}
}
