/*  Works for web whatsapp, telegram, instagram.

User Guide : Open the web version of whatsapp, telegram or instagram.
Just enter the text to sent , enter the number of times you want to send the message.
Then enter and quickly switch to the chrome chat tab of the person you want to send
and wait, spamming will start.

*/


//----------------------------------------JAVA-CODE----------------------------------------

import java.awt.AWTException;  
// AWTException - if the platform configuration does not allow low-level input control. 
//This exception is always thrown when GraphicsEnvironment.isHeadless() returns true.
import java.awt.Robot;    
/* The Robot class in the Java AWT package is used to generate native 
system input events for the purposes of test automation, self-running demos, 
and other applications where control of the mouse and keyboard is needed. 
The primary purpose of Robot is to facilitate automated testing of Java platform 
implementations. */
import java.awt.Toolkit;  
// Toolkit is a class that provides methods for obtaining information about the system.
import java.awt.datatransfer.Clipboard; 
// Clipboard - The clipboard is a shared resource in which data can be stored.
import java.awt.datatransfer.StringSelection; 
 // StringSelection - A class that can be used to contain a string selection.
import java.awt.event.KeyEvent; 
// KeyEvent - Represents a keyboard event.
import java.util.Scanner;

public class Java_Spammer {

    
	public static void main(String[] args) {

        try{
		int start = 1,count=0;
		
		Robot robot = new Robot();  // create a robot object
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text:");
		String Text = scanner.nextLine();

        System.out.println("Enter number of times you want to send the message :");
		count = scanner.nextInt();
		
		StringSelection stringSelection = new StringSelection(Text);  
        // StringSelection is a class that allows you to select a string and copy 
        // it to the clipboard.
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();  
        // get the clipboard
		clipboard.setContents(stringSelection, null); 
        // set the clipboard contents
		
		System.out.println("The spamming will start in 5 seconds , please open the chat window of the person you want to send the message to.");
		Thread.sleep(5000);  // wait 5 seconds
		
		while(start <= count) {
			
		Thread.sleep(1000); // wait 1 second before sending the message again
			
		robot.keyPress(KeyEvent.VK_CONTROL);  // CTRL + V
		robot.keyPress(KeyEvent.VK_V);     // V
		robot.keyRelease(KeyEvent.VK_CONTROL); // CTRL + V
		robot.keyRelease(KeyEvent.VK_V);   // V
		
		robot.keyPress(KeyEvent.VK_ENTER);  // ENTER
		robot.keyRelease(KeyEvent.VK_ENTER);   // ENTER
		
		start++;
		
		}
        System.out.println("Spamming was completed successfully :) ");

	}
    catch (AWTException e) {
        System.out.println("Error occured please follow the instructions and try again :)\n Error is: " + e);

    }
    catch (InterruptedException e) {
    System.out.println("Error occured please follow the instructions and try again :)\n Error is: " + e);

    }
    catch (Exception e) {
    System.out.println("Error occured please follow the instructions and try again :)\n Error is: " + e);

    }
    }
    }
