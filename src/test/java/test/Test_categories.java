package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_categories extends BaseFile {

	
	
	@Test
	public void Categories_wise() throws IOException, InterruptedException {
		
		
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		categories_levelWise.categories_wise();
	
	}
	
	
}
