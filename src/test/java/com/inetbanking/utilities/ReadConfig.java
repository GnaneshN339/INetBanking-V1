package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configurations/Config.properties");
		//also we can write baseurl= https://demo.guru99.com/v4/ as baseurl= https://demo.guru99.com/v4/index.php
	try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);	
	}
	catch(Exception e) {
		System.out.println("Exception is "+e.getMessage());
		
	}
	
	}
	
	public String getUrl() {
	String url = pro.getProperty("baseurl");
	return url;
	}
	
	public String getUsername() {
	String username	= pro.getProperty("username");
	return username;
	}
	
	public String getpassword() {
		String password	= pro.getProperty("password");
		return password;
		}
	public String getChromePath() {
		String chromepath= pro.getProperty("chromepath");
		return chromepath;
		}
	public String getIEPath() {
		String iepath= pro.getProperty("iepath");
		return iepath;
		}
	public String getedgePath() {
		String edgepath= pro.getProperty("edgepath");
		return edgepath;
		}

}
