package edu.austincc.examples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class WillReturnFromCatchStopAFinally {

	public static void main(String[] args) {
		
		System.out.println("About to call openFile()");

		openFile();
		
		System.out.println("Back in main()");
	}

	private static void openFile() {
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("resources/file.txt"));
			System.out.println(bis.read());
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Bad read()");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("Next task...");
		System.err.println("Error, Error!!!");
		System.out.println(System.currentTimeMillis());
	}
}
