package de.openhpi.capstone1.counter.starter;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	public static void main(String[] args) {
		
		try {
			// Set cross-platform Java L&F (also called "Metal")
			UIManager.setLookAndFeel(
					UIManager.getCrossPlatformLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e) {
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (InstantiationException e) {
			System.out.println(e.getMessage());
		}
		catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		
		TheApp gui = new TheApp();
		gui.init();
	}

}
