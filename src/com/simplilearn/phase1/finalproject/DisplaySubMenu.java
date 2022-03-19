package com.simplilearn.phase1.finalproject;

import java.util.Scanner;

public class DisplaySubMenu {

public static void displaySubMenu(){
		
		System.out.println("**************************************************************************");
		System.out.println("**************************************************************************");
		System.out.println("**\t\t\t\t\t\t\t\t\t**");
		System.out.println("**\tWelcome to LockedMe.com secure application\t\t\t**");
		System.out.println("**\t\t\t\t\t\t\t\t\t**");
		System.out.println("**************************************************************************");
		System.out.println("**************************************************************************");
		System.out.println("**\t\t\t\t\t\t\t\t\t**");
		System.out.println("**\tSUB MENU : Available File Operation\t\t\t\t**");
		System.out.println("**\t====================================\t\t\t\t**");
		System.out.println("**\t\t\t\t\t\t\t\t\t**");
		System.out.println("**\t1. Add a new file\t\t\t\t\t\t**");
		System.out.println("**\t2. Delete a file\t\t\t\t\t\t**");
		System.out.println("**\t3. Search file\t\t\t\t\t\t\t**");
		System.out.println("**\t0. Back to Main Menu\t\t\t\t\t\t**");
		System.out.println("**\t\t\t\t\t\t\t\t\t**");
		System.out.println("**************************************************************************");
		System.out.println("**\tDeveloped By : Jitedra Makvana\t\t\t\t\t**");
		System.out.println("**************************************************************************");
		System.out.println("**************************************************************************");
		
	}	

	public static void PerformSubMenuFileOperation(){
		
		//Variable declaration
		Scanner sc= new Scanner(System.in);
		int subOption = 0;
		
		do{
			try{
				
				//Display main menu
				DisplaySubMenu.displaySubMenu();
				
				//getting user input
				System.out.print("Please enter your choice : ");
				subOption = sc.nextInt();
				
				//Performing user selected operation 
				switch(subOption){
				
				case 1:
					FileOperation.createFile();
					break;
				case 2:
					FileOperation.deleteFile();
					break;
				case 3:
					FileOperation.searchFile();
					break;
				case 0:
					//System.out.println("In the case 0");
					break;
				default:
					System.out.println("Invalid input entered");
				
				}
			
			}catch(Exception e){
				System.out.println("Invalid input. Please try again......");
				System.out.println(e);
				//assigning variable option value 5 to continue the execution of the applications
				//subOption = 5;
			}
			
		}while(subOption>0);
		
		
		//Close all object
		//sc.close();		
	}
}
