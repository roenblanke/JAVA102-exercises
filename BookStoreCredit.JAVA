package newpackage;

import javax.swing.JOptionPane;

public class BookStore {
    public static void main(String [] args){
        
        //initialize vars
        String stuName;
        double stuGPA;
        double stuCredit;
        
        //get some young user input
        stuName = JOptionPane.showInputDialog(null, "Please enter your name.");
        stuGPA = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your GPA."));
        
        //lets apply the credit multiplier
        stuCredit = stuGPA * 10;
        
        //we now present the student with their self reported info and their
        //newly awarded bookstore credit
        JOptionPane.showConfirmDialog(null, "Hi " + stuName + " your GPA is " +
                                                stuGPA + ". This entitles you to a "
                                                        + "bookstore credit of "
                                                        + "$" 
                                                        + stuCredit
                                                        + " Happy spending!");
        
    }//close main method
}//close class
