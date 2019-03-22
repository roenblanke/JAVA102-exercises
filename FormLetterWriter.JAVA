package newpackage;

import javax.swing.JOptionPane;

public class FormLetterWriter {
    public static void main(String [] args){
        
        //this frist chunk will execute the method that takes a single argument
        String userName;
        userName = JOptionPane.showInputDialog("What is your name?");
        displaySalutation(userName);
        System.out.println("Thank you for your patronage.");
        System.out.println("Please come again soon.");
        
        //this second chunk will execute the method that takes two arguments
        String userFirstName, userLastName;
        userLastName = JOptionPane.showInputDialog("What is your last name?");
        userFirstName = JOptionPane.showInputDialog("What is your first name?");
        displaySalutation(userLastName, userFirstName);
        System.out.println("Thank you for your patronage.");
        System.out.println("Please come again soon.");
        
        
    }//close main method
    
    //this first non-main method is identical to the second except that it takes
    //one String arg and thus prints to the console only one String
    public static void displaySalutation(String name){
        System.out.println("Hello " +
                           name);
    }//close displaySalutation 
    
    //the method is now overloaded and this String is differentiated by taking
    //two String args. The methods share an indentifier, but they have different
    //args and different implementations
    public static void displaySalutation( String lastName, String firstName){
        System.out.println("Hello " +
                           firstName +
                           " " +
                           lastName);
    }//close displaySalutation 
}//close class
