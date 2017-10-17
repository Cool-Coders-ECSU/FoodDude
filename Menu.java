/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddude;

/**
 *
 * @author drcouncil
 */
public class Menu {
    
    private String key;
    private Menu next;
    private int count;   
    Menu(String k)
    {
        count ++;
    key = k;
    }
    
    public void setNext(Menu n)
    { next = n; }
    
    // Print out dessert menu and price Hashtable
    public static void Desssert()
    { //
    for(int i=0; i < arr.length; i++)
    { System.out.println( arr[i] + "\n");}
    
    
    }
     // Print out dinner menu and price Hashtable
    public static void Dinner()
    {
    
    }
    
     // Print out breakfast menu and price Hashtable
    public static void Breakfast()
    {
    
    
    }
}
