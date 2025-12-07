/**
 * Name: [Felix Sanchez Cantu]
 * Date: [December 6, 2025]
 * Purpose: [The main purpose is to run a code that is built over everything we have learned this semester
 * 
 *
 */

 import java.util.Random;// this is my import random for the random class to work
 import java.util.Scanner;// this is my import scanner

 public class SemesterProject_SlimeKingDROP// the name of my file and the program
 {
    public static void main(String[] args) // my main method
    {
        BoringDialouge();// the Boring diolouge method that will print out the string of println statements (lines 29 - 32)

        System.out.println("\n\"Queue Epic montage farming music\"\n");// a "page break" in the terminal 

        for(int x = 0; x < 10; x++)// my for loop that will iterate 10 times
        {
           String drops = Loot();// here this new string called drops, is now set to the Loot() method 
           System.out.println("Killing the Slime King on the " + ( x + 1 ) + " run, you obtained " + drops + " drop.");// here it will print out the number of run (1 - 10) and it will also say what drop i got in the terminal
        }
    }

    public static void BoringDialouge() // this is my dialouge string that will retrun nothiung but i will use this in main
    {
     System.out.println("Greetings Traveller...");//simple println statement
     System.out.println("Before you lies the indomitable Slime King on the brink of death.");//simple println statement
     System.out.println("This feat, will grant you the acheivement \"Conqueror of Slimes\"");//simple println statement with the \"\" doing quotations marks in the statement
     System.out.println("What you really care about is if you aqcuire any rare drops...\nSo you farm the King Slime 10 times");//simple println statement with the \n being a new line
    }

   public static String Loot()// my second and final method that is a string class for the RNG determintation
   {
     Random random = new Random();// this is my random class assigned that will use the random java class

     int DropRate = random.nextInt(100);//this is my int data type that will use the values from up to 100 inclusive.

    if(DropRate < 67)// The start of a simple boolean statement, if the drop chance is less that 67, you will get the common item
    {
        return "Common Slime Gel";// this is what will be returned to main
    }
    else if(DropRate < 90)//if the drop chance is less that 88, you will get the rare item
    {
        return "Rare Slime Core";// this is what will be returned to main
    }
    else if(DropRate < 99)//if the drop chance is less that 99, you will get the epic item
    {
        return "Epic Slime Crown Gem";// this is what will be returned to main
    }
    else//the end of the boolean which will return anything else or in this case the legendary item
    {
        return "Legendary Slime Crown";// this is what will be returned to main
    }
   }
 }
