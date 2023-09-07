package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Numbers extends BaseFile {

	
	public Test_Numbers() {
		
	}
	@Test
	public void Numbers_level() throws IOException, InterruptedException {
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		Numbers_wisec.Numbers_Module();
	}
	
	
	
}
