/* @author: Christopher Hatton *Unit4* This program takes the weight of the package from the user's input. Determines the price per pound shipping cost using if-else-if statements.  The program then determines the product of the price per pound shipping cost 
and the weight of the package to determine the Total cost of shipping. It then outputs the weight of the package and the total amount that will be needed for shipping. */ 

import java.util.Scanner;

public class ShippingCost
{
   public static void main(String[] args)
   {
      double weight;
      double shipping;
      
      Scanner keyboard = new Scanner(System.in);
       
      System.out.print("Please enter the weight of the package being shipped: ");    //Asks the user to input the weight of the package to be shipped
      weight = keyboard.nextDouble();                                                
      
         if (weight <= 5.0)                 //Thru the if-else-if statements the program tests the input from user against the conditions of the if-else-if statements to determine the price per pound shipping cost
         {
            shipping = 1.20;
         }
         else if (weight <= 10.0)
         {
            shipping = 1.00;
         }
         else if (weight <= 20.0)
         {
            shipping = 0.90;
         }
         else                    //weight > 20      
         {
            shipping = 0.80;
         }
         
         double totalShippingCost = shipping * weight;   // This line will take the determined price per pound shipping rate and multiply it by the weight of the package from the input of user
         
         System.out.printf("The weight of your package was " + weight + " pounds. And your total shipping cost is $%.2f", totalShippingCost);
                      //The program will output the weight of the package from the user and also the total shipping cost for that package formatted to be displayed with the dollar sign and be given the precision value of 2 decimal places
   }
}
       