package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_sub_categories extends BaseFile {

	@Test
	public void Sub_categories_lev() throws IOException, InterruptedException {
		
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		Sub_categories_levelWisec.Sub_categoriesWise();
		
	}
	
	
	
	
}
