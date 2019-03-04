package com.test;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class FileSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearch ff = new FileSearch();
        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file to be searched.. " );
        String name = "file.xml";
        System.out.println("Enter the directory where to search ");
        String directory = "D:\\Test\\Search";
        ff.findFile(name,new File(directory));

	}
	
	public void findFile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println("File located at "+fil.getParentFile());
                System.out.println("Absolute path "+fil.getAbsolutePath());
                System.out.println("Path "+fil.getPath());
                try {
					Files.copy(new File(fil.getAbsolutePath()).toPath(), new FileOutputStream("D:\\Test\\Final\\"+fil.getName()));
					System.out.println("File copied!!");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
    }
}
