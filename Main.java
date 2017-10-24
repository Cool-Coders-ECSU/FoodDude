package fooddude;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author drcouncil
 */



public class Main {
    
    private static DecimalFormat df2 = new DecimalFormat(".00");
    
    public static void main(String args[])
    {
        double price=0;// Saved amount for customer
        double tax =0.05; 
        char choice = 'y';// decision from customer
     String breakfast = "BREAKFAST\0";
        Menu t = new Menu();
        //Prompt user for which type of meal
    System.out.println("Hello, thanks for coming to eat at FoodDude choose from Dinner, Dessert, and Breakfast:");
     
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
  
    
    
    System.out.print("Your input - " + input.toUpperCase() +"\n" );
    
        
    do{
    //PASS STRING TO MENU CLASS AND DISPLAY MENU
    if (input.toUpperCase() == breakfast)
    {
    System.out.println("\n\tBREAKFAST MENU\n ------------------------------------");
        t.BreakfastMenu();
        System.out.println("\nChoose from the list above which number you will like: \n (choose 0 to exit)");
        
        }
       //---------------------------------------------------------------------------------------------- 
    
    
        else if(input.toUpperCase() == "DINNER")
        {
            System.out.println("\n\tDINNER MENU\n ----------------------------------");
        t.DinnerMenu();
        System.out.println("\nCgoose from the list above which number you will like: \n (Choose 0 to exit)");
        }
       //------------------------------------------------------------------------------------------------
        
        
        else if(input != "DESSERT")
        {
    System.out.println("\n\tDESSERT MENU\n ------------------------------------");
        t.DessertMenu();
        
        double n;
        System.out.println("\nChoose from the list above which number you will like: \n (choose 0 to exit)");
          n = scan.nextDouble();
          //System.out.println("You enter " + n + " --");
        
        
        System.out.println("Your total is $"+df2.format(t.Dessert(n)));
       price += t.Dessert(n);
       
        }
      //-----------------------------------------------------------------------------------------------------------
        
        
        
        
        
        else
        { System.out.print("Sorry, please just enter in 'Breakfast', 'Dinner', or 'Dessert'. \n");
        }
    
    
     System.out.println("Is there anything else you will like to add on your order? [y/n] ");
     
             choice = scan.next().charAt(0);
             if (choice == 'y')
             {
             System.out.println("What whould you like? ");
             input = scan.nextLine();
             }
             
    }
     while(choice=='y');
    
    
    
    
    
    }
    
}
