package com.simplilearn.phase1.finalproject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileOperation {

	//Declaring class variable
	static final String projectFilesPath = "C:\\Users\\Jits\\Desktop\\Phase1_FinalProject_LockedMe\\Repository";
	private static Scanner sc;
	
	/**
	 * This method will retrieve all the available file and display to the end user.
	 */
	
	public static void getAllFiles() {

		//Variable Declaration 
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

	/**
	 * This method will read file details from user and create file in project folder.
	 */
	
	public static void createFile() {

		try{
				
			//Variable Declaration
			sc = new Scanner(System.in);
			String fileName;
			int linesCount=0;
			
			//Getting filename from user
			System.out.print("Enter file name : ");
			fileName = sc.nextLine();
			System.out.print("Enter how many lines in the file : ");
			linesCount = Integer.parseInt(sc.nextLine());
			
			//Calling method to check user enter file extension or not
			fileName = checkFileExtension(fileName);
			
			FileWriter fw = new FileWriter(projectFilesPath+"\\" + fileName);
			
			//Reading line by line from user
			for(int i=1; i<=linesCount; i++){
				System.out.println("Enter file line :");
				fw.write(sc.nextLine()+"\n");
			}
			
			System.out.println("File created successfully.");
			fw.close();
			
		}catch (Exception e) {
			System.out.println("Something went wrong. Try again....");
		}
	}

	/**
	 * This method will take filename from user and delete that file from project folder. 
	 */

	public static void deleteFile() {
		
		try{
			//Variable Declaration
			sc = new Scanner(System.in);
			String fileName;
			
			//Getting filename from user
			System.out.print("Enter (case sensitive) file name to be delete : ");
			fileName = sc.nextLine();
			
			//Calling method to check user enter file extension or not
			fileName = checkFileExtension(fileName);
		
			//Performing delete file action based on the file availability
			if(checkFileExist(fileName)){
				File file = new File(projectFilesPath+"\\" + fileName);
				file.delete();
				System.out.println("File deleted successfully.");
			}else{
				System.out.println("File does not exist.");
			}
			
		}catch (Exception e) {
			
			System.out.println("Unable to delete the file. Please contact to admin@test.com");
			//System.out.println(e);
		}
		
	}

	/**
	 * This method will take filename from user and search file from project folder.
	 */
	public static void searchFile() {
		
		try{
			
			//Variable Declaration
			sc = new Scanner(System.in);
			String fileName = "";
			
			//Getting user input for searching file
			System.out.print("Enter File name to search : ");
			fileName = sc.nextLine();
			
			//Calling method to check user enter file extension or not
			fileName = checkFileExtension(fileName);
			
			//Displaying the file availability status to user
			if(checkFileExist(fileName)){	
				System.out.println("File is available.");
			}else{
				System.out.println("File is not available.");
			}	
			
		}catch(Exception e){
			System.out.println("");
		}
		
	}
	
	/**
	 * This method will take file name as parameters and checks if
	 * it is present in the project folder or not
	 * @param fileName String
	 * @return boolean
	 */
	private static boolean checkFileExist(String fileName){
		
		//Declaring variables
		ArrayList<String> allAvailaableFilesName = new ArrayList<>();
		File folder = new File(projectFilesPath);
		String[] listOfFiles = folder.list();
		
		//Getting all available files from folder
		if(listOfFiles.length>0){
			for(String file : listOfFiles){
				allAvailaableFilesName.add(file);
			}	
		}
		return allAvailaableFilesName.contains(fileName);
		
	}
		
	/**
	 * This method will take file name as parameter and check user has entered file extension or not
	 * if not then it will add .txt at end of filename
	 * @param fileName String
	 * @return String
	 */
	private static String checkFileExtension(String fileName) {
		
		//Checking file type(.txt) entered or not
		if(!fileName.contains(".txt")){
			fileName = fileName+".txt";
		}		
		return fileName;
	}

}
