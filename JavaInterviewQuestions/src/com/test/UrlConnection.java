package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL aws = new URL("https://aws.amazon.com");
			BufferedReader br = new BufferedReader(new InputStreamReader(aws.openStream()));
			
			String line;
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			
			br.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
