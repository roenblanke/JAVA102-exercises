
package newpackage;

import javax.swing.JOptionPane;
public class Dollars {
    public static void main(String [] args){
        
        //get some young userInput
        String userInput;
        userInput = JOptionPane.showInputDialog(null, "Enter an integer number", "I'm going to turn into dollars");
        int intUI = Integer.parseInt(userInput);
        
        //at this point im unsure what im supposed to do
        //does the textbook want me to tell the user how many
        //20s represent the inputed #? (And then same thing
        //for 10s, 5s, 1s) Or does it want me to display the input
        //# in the least number of bills possible?
        
        //intialize int vars 
        int twenties = 0;
        int tens = 0;
        int fives = 0;
        int ones = 0;
        
        //logic chain to get the right bill numbers
        twenties = intUI / 20;
        if(intUI%20 > 0){
            intUI = intUI - twenties * 20;
            tens = intUI / 10;
            if(intUI%10 > 0){
                intUI = intUI - tens * 10;
                fives = intUI / 5;
                if(intUI%5 > 0){
                    intUI = intUI - fives * 5;
                    ones = intUI / 1;
                }//close if
            }//close if
        }//close if chain
        
        //show the bill numbers to user
        JOptionPane.showConfirmDialog(null, twenties + " 20s, "
                                      + tens + " 10s, "
                                      + fives + " 5s, "
                                      + ones + " 1s, ",
                                      "This is your number in the least amount of bills",
                                      JOptionPane.YES_OPTION,
                                      JOptionPane.INFORMATION_MESSAGE);
    }//close main method
}//close class
