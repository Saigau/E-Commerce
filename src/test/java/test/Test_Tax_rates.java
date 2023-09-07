package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_Tax_rates extends BaseFile {


	@Test
	public void Tax_Rate_levelC() throws IOException, InterruptedException {


		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));

		Tax_rates_Wisec.Tax_rates_levec();
	}

}
