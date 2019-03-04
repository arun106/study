package com.xml;

import java.io.IOException;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLUnit;
import org.xml.sax.SAXException;

public class XMLCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String xml1 = "<P><p1>value1</p1><p2>value2</p2></P>";
		String xml2 = "<P><p1>value3</p1><p2>value4</p2></P>";
		
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
