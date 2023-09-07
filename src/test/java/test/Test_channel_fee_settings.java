package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.proper;

public class Test_channel_fee_settings extends BaseFile {


	@Test
	public void Test_channel_fee_settings_levelwise() throws IOException, InterruptedException {

		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));

		Channel_Fee_SettingsC.Channel_Fee_Settings_levels();

	}











}
