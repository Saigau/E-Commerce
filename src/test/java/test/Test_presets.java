package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_presets extends BaseFile {

	
	
	
	@Test
	public void presets_wising() throws IOException {
	
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		
		presets_levelC.presets_wise();
		
		
	}
	
	
}
