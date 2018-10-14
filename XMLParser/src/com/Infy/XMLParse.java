package com.Infy;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * XML Parser
 * @author arun mohan
 *
 */

public class XMLParse {
	
	public static void main(String[] args) {
		    XMLParse xmlparse = new XMLParse();
		    //String testdataXML="<rootelement><country id='1'><key>India</key><value>Delhi</value></country><country id='2'><key>Malaysia</key><value>KualaLumpur</value></country></rootelement>";
		    String testdataXML ="<rootelement><India>Delhi</India><Malaysia>KualaLumpur</Malaysia><Sg>Singapore</Sg></rootelement>";
		    System.out.println("Value##"+xmlparse.parseXMLAndGetValue(testdataXML,"India"));
		    System.out.println("Value##"+xmlparse.parseXMLAndGetValue(testdataXML,"Malaysia"));
		    System.out.println("Value##"+xmlparse.parseXMLAndGetValue(testdataXML,"USA"));
	}
	
	public String parseXMLAndGetValue(String testDataXML,String key)
	{
		String value="";
		//File fXmlFile = new File(testDataXML);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			//Document doc = dBuilder.parse(new InputSource(testDataXML));
			Document doc = dBuilder.parse(new InputSource(new ByteArrayInputStream(testDataXML.getBytes("utf-8"))));
			doc.getDocumentElement().normalize();
			//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList list;
			list = doc.getElementsByTagName(key);
			if (list.item(0) !=null)
				return list.item(0).getTextContent();	
			else
				return "Not found";
			
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return value;
	}
}
