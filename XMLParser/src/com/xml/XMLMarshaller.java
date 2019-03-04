package com.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.xml.pojo.Class;
import com.xml.pojo.Parameter;
import com.xml.pojo.Suite;
import com.xml.pojo.Test;
import com.xml.pojo.Classes;
import com.xml.pojo.Include;
import com.xml.pojo.Methods;

/**
 * Class for marshalling an Object to XML
 * @author Arun Mohan
 *
 */
public class XMLMarshaller {
	
	public static void main(String[] args) {
		
		//Instantiating POJO classes
		Suite suite=new Suite();
		Test test=new Test();
		Parameter parameter=new Parameter();
		Classes classesObj=new Classes();
		Class classObj=new Class();
		Methods methodsObj=new Methods();
		Include includeObj=new Include();
		
		List<Include> includeList =new ArrayList<Include>();
		List<Methods> methodsList=new ArrayList<Methods>();
		List<Class> classList=new ArrayList<Class>();
		List<Classes> classesList=new ArrayList<Classes>();
		List<Parameter> parameterList=new ArrayList<Parameter>();
		List<Test> testList=new ArrayList<Test>();

		includeObj.setName("fnwithparam");
		classObj.setName("com.testng.tests.TestNgSampleClass");
		parameter.setName("abc");
		parameter.setValue("abcfortest");
		test.setName("TestNGTestGroup");
		suite.setName("Main Test Suite");
		suite.setVerbose("2");
		
		includeList.add(includeObj);
		methodsObj.setIncludeObj(includeList);
		
		methodsList.add(methodsObj);
		classObj.setMethods(methodsList);
		
		classList.add(classObj);
		classesObj.setClassObj(classList);
		
		classesList.add(classesObj);
		parameter.setClassesObj(classesList);
		
		parameterList.add(parameter);		
		test.setParameter(parameterList);
		
		testList.add(test);
		suite.setTest(testList);
		
		try {
			JAXBContext contextObj = JAXBContext.newInstance(Suite.class);
			Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		    marshallerObj.marshal(suite,new FileOutputStream("Output/suite.xml"));
		    System.out.println("XML File created! Check suite.xml");
		    
		} catch (JAXBException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}
}
