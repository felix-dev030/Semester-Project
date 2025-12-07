/**
 * Name: [Felix Sanchez Cantu]
 * Date: [December 6, 2025]
 * Purpose: [The main purpose is to run a code that is built over everything we have learned this semester]
 * 
 *
 */

 import java.util.Scanner; // this is my import scanner

 public class SemesterProject_RNG
 {
    public static String (String[] args) // my main method
    {
    
    }

    public static String Dialouge() // this is my dialouge string 
    {
     String BoringDialouge = "Greetings Traveller...\nBefore you lies the indomitable Slime King on the brink of death.\nThis feat, will grant you the acheivement \"Conqueror of Slimes\"What you really care about is if you aqcuire any rare drops...\nSo you farm the King Slime 10 times";
     Return BoringDialouge;
    }

   public static String Loot()
   {
     Random RNG = new Random();// this is my random class assigned as RNG that will use the random java class

     int DropRate = RNG.nextint(100);//this is my int data type that will use the values from up to 100 inclusive.

    if(DropRate < 67)// if the drop chance is 
    {
        return common;
    }
    else if(DropRate < 75)
    {
        return uncommon;
    }
    else if(DropRate < 88)
    {
        return rare;
    }
    else if(DropRate < 99)
    {
        return epic;
    }
    else
    {
        return Legendary;
    }
   }
 }
