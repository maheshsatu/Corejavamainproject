package com;

public class Maindef {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		Menu.printWelcomeScreen("LockedMe", "scared heart");
		
		Controloptions.handleWelcomeScreenInput();
	}

	
}