package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Coupons_Categories extends BaseFile {

	
	@Test
	public void Coupons_categories_create() throws IOException, InterruptedException {
		
		
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		Coupons_Categories_level.Coupons_Categories_creationWise();   
		
		
		
	}
	
	
	
}
