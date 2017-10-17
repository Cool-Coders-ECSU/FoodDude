/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddude;
import java.util.Scanner;
/**
 *
 * @author drcouncil
 */
public class Main {
    
    public static void main(String args[])
    {
        //Prompt user for which type of meal
    System.out.println("Hey, thanks for coming to FoodDude choose from Dinner, Dessert, and Breakfast: \n ");
    
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    
    System.out.print("Your input - " + input );
    
    
    //PASS STRING TO MENU CLASS AND DISPLAY MENU
    if (input.toUpperCase() == "BREAKFAST")
    {
    System.println( t.Breakfast());
    }
    
    else if( input.toUpperCase() == "DINNER")
    {
    System.println( t.Dinner());
    
    
    }
    
    else if(input.toUpperCase() == "DESSERT")
    { 
        
    System.out.println( t.Dessert());
    
    }
    else 
    
    { System.out.print("Sorry, please just enter in 'Breakfast', 'Dinner', or 'Dessert'. \n");
            
            }
    
    
    
    
    
    
    
    }
    
}
