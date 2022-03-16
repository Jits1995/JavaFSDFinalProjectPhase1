package com.simplilearn.phase1.finalproject;

import java.io.File;

public class FileOperation {

	//Declaring class variable
	static final String projectFilesPath = "C:\\Users\\Jits\\Desktop\\Phase1_FinalProject_LockedMe\\Repository"; 
	
	public static void getAllFiles() {

		//Declaring Vairable and Instantiate Object 
		File folder = new File(projectFilesPath);
		String[] listOfFiles = folder.list();
				
		//Checking folder and files status
		if(listOfFiles.length>0){
			
			//Printing all files
			System.out.println("FILES LISTED BELOW :");
			System.out.println("====================\n");
			
			for(String file : listOfFiles){
				System.out.println(file);
			}
			
		}else{
			System.out.println("The folder is empty.");
		}
	}

	public static void createFile() {
		// TODO Auto-generated method stub
		
	}

	public static void deleteFile() {
		// TODO Auto-generated method stub
		
	}

	public static void searchFile() {
		// TODO Auto-generated method stub
		
	}

}
