/*Mohau Tshukudu
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarcompany;
import javax.swing.*;

/**
 *
 * @author tshuk
 */
public class SolarCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClientMethods aca = new ClientMethods();
        String choice = "";
        int fnd = -1;
        do
        {
        choice = JOptionPane.showInputDialog("MENU\n\n"
                + "1. Add a Client\n"
                + "2. Edit a Client\n"
                + "3. Display all Client\n"
                + "4. Search for a Client\n"
                + "5. Sort alphabetically by Client's Name\n"
                + "6. Delete a Client\n"
                + "7. Exit the Program");
        
        switch(choice)
        {
            case "1": aca.add();
                break;
                 case "2": System.out.println ("EDIT");
                            fnd = aca.search();
                          if (fnd == -1)
                          {
                              System.out.println("Already told you, CLIENT NOT FOUND");
                          } else {
                              aca.edit(fnd);
                          }
                 
                break;
                 case "3": System.out.println("DISPLAY");
                            aca.display();
                break;
                 case "4": System.out.println("SEARCH");
                            fnd = aca.search();
                break;
                 case "5": System.out.println("SORT");
                            aca.sort();
                            
                break;
                 case "6": System.out.println("DELETE");
                     String delCap = JOptionPane.showInputDialog("Enter the client name to delete");
                            aca.delete(delCap);
                break;
                 case "7": JOptionPane.showMessageDialog(null,"Goodbye and thanks.");
                    //write back to the text file
                            aca.writing();
      
                break;
                 default: JOptionPane.showMessageDialog(null,"Please enter a choice between 1 - 7");
        }
        }while(!choice.equalsIgnoreCase("7"));
    }
    
}
