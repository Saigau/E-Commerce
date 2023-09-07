package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Option_types extends BaseFile {

	
	
	@Test
	public void Test_Option_types_levelC() throws IOException, InterruptedException {
		
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		Option_types_wise.Option_types_leveling();
		
	}
}
