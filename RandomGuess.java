
package newpackage;

import javax.swing.JOptionPane;

public class RandomGuess {
    
    public static void main(String [] args){
        
        int randNum = (1 + (int)(Math.random() * 10));
        
        JOptionPane.showInputDialog(null,"Guess a # between 1-10", "This is gonna be your guess.");
        
        JOptionPane.showConfirmDialog(null, "Yo the number was " + randNum, "Let's see if it you were right", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
    }//close main method
}
