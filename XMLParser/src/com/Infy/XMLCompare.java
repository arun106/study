package com.Infy;

import java.io.IOException;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLUnit;
import org.xml.sax.SAXException;

public class XMLCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String xml1 = "<POSPDM><pdm1>value1</pdm1><pdm2>value2</pdm2></POSPDM>";
		String xml2 = "<POSPDM><pdm1>value3</pdm1><pdm2>value4</pdm2></POSPDM>";
		
        DetailedDiff diff;
		try {
			diff = new DetailedDiff(XMLUnit.compareXML(xml1, xml2));
			List<?> allDifferences = diff.getAllDifferences();  
			
			System.out.println(allDifferences);
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
