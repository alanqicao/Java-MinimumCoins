/*
    Student Name    :  Qi Cao
  
*/
package minimumcoinsprogram;

import java.util.Scanner;

public class MinimumCoinsProgram
{

    public static void main(String[] args)
    {
        //start
        // initalization
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int change = 999;
        
        // class-object-work
        Scanner input = new Scanner(System.in);
         // ***** loop *****
        while (change != 0)
        {
            //***** sequence *****
            // user output to the screen
            System.out.println("Please Enter Amount of Change (1-99) or ZERO to EXIT");
            System.out.println("");
            change = input.nextInt();
            
            // ***** if-then *****
            if (change != 0)
            {
                // ***** while loop check for quarters*****
                while (change >= 25)
                {
                    change = change - 25;
                    quarters = quarters + 1;
                }
                // ***** while loop check for dimes*****
                while (change >= 10)
                {
                    change = change - 10;
                    dimes = dimes + 1;
                }
                // ***** if check for nickels*****
                if (change >= 5)
                {
                    change = change - 5;
                    nickels = nickels + 1;
                }
                
                //out put result

                System.out.println("");
                System.out.println("Quarters: " + quarters);
                System.out.println("Dimes:" + dimes);
                System.out.println("Nickels: " + nickels);
                System.out.println("Pennies:" + change); //change here are pennies
                System.out.println("");
                
                // reset variable
                quarters = 0;
                dimes = 0;
                nickels = 0;
                change = 999;
            } //if

        } //while loop

    } //main

}//class
