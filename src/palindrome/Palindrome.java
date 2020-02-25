/*
 * Author: Ahmed A.
 * Completion date: 24/2/2020
 * This program tests to see if a word is a palindrome.
 */
package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Try statement to make sure program doesn't crash when invalid input is inserted.
        try {
            //Take input from user and store it as a string.
            String input = JOptionPane.showInputDialog("Please enter your word to check if it's a palindrome:");
            //Initiate backwards string as a null temporarily
            String backwards = "";
            //For loop to run as many times as there are letters or characters in the word.
            for (int i = 1; i <= input.length(); i++) {
                //Makes the backwards string equal to the input string backwards.
                backwards += input.charAt(input.length() - i);
            }
            //Condition statement that tells user if the word is a palindrome or not.
            if (backwards.equalsIgnoreCase(input)) {
                System.out.println(backwards + " is a palindrome of " + input);
            } else {
                System.out.println(backwards + " is not a palindrome of " + input);
            }
        } catch (NullPointerException e) {
            //Exits system when cancel or X is pressed.
            System.exit(0);
        }

    }

}
