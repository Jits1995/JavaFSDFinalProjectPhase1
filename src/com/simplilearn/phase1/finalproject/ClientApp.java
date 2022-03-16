package com.simplilearn.phase1.finalproject;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		
		//Variable declaration
		Scanner sc= new Scanner(System.in);
		int option = 0;
		
		do{
			//Display main menu
			DisplayMenu.displayMainMenu();
			
			//getting user input
			System.out.print("Please enter your choice : ");
			option = sc.nextInt();
			
			//Performing user selected operation 
			switch(option){
			
			case 1:
				FileOperation.getAllFiles();
				break;
			case 2:
				FileOperation.createFile();
				break;
			case 3:
				FileOperation.deleteFile();
				break;
			case 4:
				FileOperation.searchFile();
				break;
			case 5:
				System.out.println("Application closed successfully.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input entered");
			
			}
			
			System.out.println();
			
		}while(option>0);
		
		
		//Close all object
		sc.close();
		
	}

}

