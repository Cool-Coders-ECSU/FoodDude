package fooddude;
import java.util.Scanner;
/**
 *
 * @author drcouncil
 */
public class Menu {
    
    private String key;
    private Menu next;
    private int count; 
   
    Menu()
    {
        count ++;
    
    }
    
    public void setNext(Menu n)
    { next = n; }
    
    // Print out dessert menu and price Hashtable
    public void DessertMenu()
    {System.out.println(" 1. Cinnamon bun\n 2. Peach Cobbler\n 3. Chocolate Ice-cream\n 4. Apple Pie");
    }
    
    public void BreakfastMenu()
    {System.out.println(" 1. Steak Omelette\t 3. Breakfast Sampler\n 2. Original Buttermilk Pancakes\t 5. Blueberry Pancakes\n"
            + " 4.Classic Breakfast\t 7.Chicken & Waffles\n 6. Ham & Egg Melt\t 8.Turkey, Bacon & Egg Wrap\n");
    }
    
    public void DinnerMenu()
    {System.out.println(" 1. Chicken Tenders\t 3. T-Bone Steak\n 2. Ribs\t 5. Grilled BBQ Chicken\n"
        + " 4.Steak & Shrimp Combo\t 7.Shrimp Alfredo\n 6. Smoked House Burger\t 8.Classic Cheesburger\n");
    }
    
    
    
    public double Dessert(double n)
    { double value;
    double total = 0;
    
    int quantity;
    Scanner scan = new Scanner(System.in);
    
   // System.out.println("You choosed this " + n);
      if(n==1)
      {
     value = 1.05; 
     System.out.println("Cinnamon bun is $" + value+ " plus tax "); 
     System.out.println("How many will you like?");
     quantity = scan.nextInt();
     
     if(quantity>0)
     {
      total = (quantity * value);
     }
     else if(quantity == 0)
     {
     System.out.println("Going Back");
     }
     else 
     {
         System.out.println("Wrong Input");
     }
     
   }
      //----------------------------------------choice one
      //--------------------------------------------------
      
      else if(n==2)
      {
     value = 1.45; 
     System.out.println("Peach Cobbler is $" + value+ " plus tax "); 
     System.out.println("How many will you like?");
     quantity = scan.nextInt();
     
     if(quantity>0)
     {
      total = (quantity * value);
     }
     else if(quantity == 0)
     {
     System.out.println("Going Back");
     }
     else 
     {
         System.out.println("Wrong Input");
     }
     
   }
      //--------------------------------------------choice two
      //------------------------------------------------------
      
      else if(n==3)
      {
     value = .99; 
     System.out.println("Chocolate Ice-Cream is $" + value+ " plus tax "); 
     System.out.println("How many will you like?");
     quantity = scan.nextInt();
     
     if(quantity>0)
     {
      total = (quantity * value);
     }
     else if(quantity == 0)
     {
     System.out.println("Going Back");
     }
     else 
     {
         System.out.println("Wrong Input");
     }
     
   }
     //-----------------------------------------choice three
      //-------------------------------------------------------
      
      else if(n==4)
      {
     value = 1.35; 
     System.out.println("Apple Pie is $" + value+ " plus tax "); 
     System.out.println("How many will you like?");
     quantity = scan.nextInt();
     
     if(quantity>0)
     {
      total = (quantity * value);
     }
     else if(quantity == 0)
     {
     System.out.println("Going Back");
     }
     else 
     {
         System.out.println("Wrong Input");
     }
     
   }
      
      
      
      
    return total;
    }



}
    
