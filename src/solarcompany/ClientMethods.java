/*Mohau Tshukudu
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarcompany;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
/**
 *
 * @author tshuk
 */
public class ClientMethods {
    
    Client [] clients = new Client [400];
    int count = 0;
    
    public ClientMethods()
{
   if(!readFile()) 
   {
      System.out.println("your file does not exist");
   }else {
       System.out.println("your file read correctly");
   }
}
    
     public boolean readFile ()  
  {
     try
     {
         
       Scanner sc = new Scanner (new BufferedReader (new FileReader("clients.txt")));   
      
        while (sc.hasNext())
        {
           String line = sc.nextLine();
            Scanner scLine =new Scanner(line).useDelimiter(",");
            int temp = scLine.nextInt();
            String temp1 = scLine.next();
            String temp2 =scLine.next();
            String temp3 = scLine.next();
            int temp4 = scLine.nextInt();
            String temp5 = scLine.next();
            String temp6 = scLine.next();
            clients [count] = new Client(temp,temp1,temp2,temp3,temp4,temp5,temp6);
            count++;
         }
        sc.close();
        return true;
     } catch (Exception e)
     {
         return false;
     }
  }
  public void display()
  {
      for (int loop = 0 ; loop <=count-1; loop++)
      {
          System.out.println("Client No.: "+clients[loop].getIdNo());
          System.out.println("Client Name: "+clients[loop].getName());
          System.out.println("Client's Surname: "+clients[loop].getSurname());
          System.out.println("Client's Gender: "+clients[loop].getGender());
          System.out.println("Client's House number: "+clients[loop].getHouseNo());
          System.out.println("Client's Number: "+clients[loop].getCellNo());
          System.out.println("Client's Email: "+clients[loop].getEmail());
      }
  }
  
  //add in the remaining methods
  public int search() //NISO
  {
                        String searchName = "";
                        int found = -1;
                        searchName = JOptionPane.showInputDialog("Enter the name to search for");
                        for (int loop = 0 ; loop <= count-1; loop++)
                        {
                            if (searchName.equalsIgnoreCase(clients[loop].getName()))
                            {
                               //if the search name is found 
                               found = loop;
                               loop= count-1;


                            }else {
                                //if the search name is not found


                            }
                        }
                        if (found != -1)
                        {
                            System.out.println("Captain " + clients[found].getName() + " " + clients[found].getSurname() + " " + clients[found].getGender() + " "+ clients[found].getHouseNo()); 
                        }else {
                               JOptionPane.showMessageDialog(null, "This captain was not found");
                        }
                        return found;
  }
  
  public void edit(int fd) //SINO
  {
       String ed = JOptionPane.showInputDialog("What field do you want to edit?"
                                 + "\n1. Name"
                                 + "\n2. Surname"
                                 + "\n3. Gender"
                                 + "\n4. House Number"
                                 + "\n Please enter a 1 - 4 to edit that field");
                         switch(ed)
                         {
                             case "1":  String temp = JOptionPane.showInputDialog("Enter the new name");
                                        clients[fd].setName(temp);
                                        break;
                             case "2" : temp = JOptionPane.showInputDialog("Enter the new planet");
                                        clients[fd].setSurname(temp);
                                 break;
                             case "3" : temp = JOptionPane.showInputDialog("Enter the new ship");
                                        clients[fd].setGender(temp);
                                 break;
                             case "4":  String temp1 = JOptionPane.showInputDialog("Enter the new age");
                                        clients[fd].setHouseNo( Integer.parseInt(temp1));
                                 break;
                             default:JOptionPane.showMessageDialog(null, "What did you not understand"
                                     + " about entering only a 1-4, try and keep up, you blithering fool");
                         }

                        
  }
  public void sort ()
  {
      for(int outer =0; outer <= count-2;outer++)
                        {
                            for(int inner = outer+1; inner <= count -1; inner++)
                            {
                                
                                  if(clients[outer].getName().compareTo(clients[inner].getName()) < 0)// alphabetic ascending     
                                 
                                {
                                    //do nothing
                                }else{
                                    
                                    /*Client temp = new Client();
                                    temp = clients[outer];
                                    clients[outer] = clients[inner];
                                    clients[inner] = temp;*/
                                    
                                   }
                            }
                        }
                    
  }
  public void delete (String serSur)
  { 
        int fd = -1;
       for (int loop = 0 ; loop <= count-1; loop++)
                    {
                        if (serSur.equalsIgnoreCase(clients[loop].getName()))   //if (searchAge == age[loop])
                        {
                           //if the search name is found 
                           fd = loop;
                           loop= count-1;
                           clients[fd] = clients[count-1];
                           count--; //count=count-1 NB NB NB

                        }else {
                            //if the search name is not found


                        }
                    }
                   
  }
  public void add()
  {   String choice = "";
      do
                    {
                        String tempo =JOptionPane.showInputDialog("Enter number");
                        int temp  =Integer.parseInt(tempo);
                        String temp1 = JOptionPane.showInputDialog("Enter Name");
                        String temp2 = JOptionPane.showInputDialog("Enter Surname");
                        String temp3 = JOptionPane.showInputDialog("Enter Gender");
                        String tempy =JOptionPane.showInputDialog("Enter HouseNo");
                        int temp4  =Integer.parseInt(tempy);
                        String temp5 = JOptionPane.showInputDialog("Enter cell number");
                        String temp6 = JOptionPane.showInputDialog("Enter email address");
                        clients [count] = new Client(temp,temp1,temp2,temp3,temp4,temp5,temp6);
                        //System.out.println("the captain was born in " + yob[counter]);
                        choice=JOptionPane.showInputDialog("is there another captain");
                        count++;//NB NB NB NB NB NB NB NB NB NB NB 
                    }while(choice.equalsIgnoreCase("y"));
  }
  
  public void writing ()
  {
       try
      {
          //write to file
          PrintWriter outFile = new PrintWriter (new FileWriter("newclient.txt"));
       for (int loop = 0 ; loop <=count-1;loop++)
       {
          outFile.println(clients[loop].toString());
       }  
          outFile.close();
          
          
      } catch (Exception e){
          
  }
}
    
}
    
