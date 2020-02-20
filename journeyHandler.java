import java.util.*;
import java.util.Scanner;
public class journeyHandler
{
    public static void journeyHandler(CharacterStuff character1)
    {
     Scanner kb = new Scanner(System.in);   
     int random;
     String response = "";
     System.out.println("====================");  
     System.out.println("Would you like to begin your adventure?: Y or N");
     response = kb.nextLine();
     while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n"))
     {
      System.out.println("Enter a correct response: Y or N");
      response = kb.nextLine();   
        }
     if (response.equalsIgnoreCase("Y"))
     {
      random = 1 + (int) (Math.random()*5);
      System.out.println("\n\n\n\n\n\n\n\n\n\n");   
      System.out.println(gameBoard.gameBoard(random, character1));
      
        }
     else
     {
      System.out.println("Goodbye.");   
        }   
    }
    public static void subseqChoice(boolean Combat, int monsterID, CharacterStuff character1)
    {
     Scanner kb = new Scanner(System.in);
     int combatChoice; 
     combatChoice = 1;
     int random = 1 + (int) (Math.random()*5);
     if (Combat == true)
     {
      System.out.println("====================");   
      System.out.println("[1] Attack");
      System.out.println("[2] Run");
      System.out.println("[3] Die");
      System.out.println("====================");
      combatChoice = kb.nextInt();
      if (combatChoice == 1)
      {
       journeyHandler.combatHandler(monsterID, character1);    
        }
      else if (combatChoice == 2)
      {
       System.out.println("You flee from the battle..");
       System.out.println("\n\n\n\n\n");
       gameBoard.gameBoard(random,character1);
        }
      else if (combatChoice == 3)
      {
       journeyHandler.characterDeath(character1);   
        }
        }
     /*
      * No combat after this point
      */
     else if(Combat == false)
     {
      System.out.println("====================");   
      System.out.println("[1] Advance");
      System.out.println("[2] Look for shop"); 
      System.out.println("[3] Die");
      System.out.println("[4] Other");
      System.out.println("====================");
      combatChoice = kb.nextInt();
      if (combatChoice == 1)
      {
       System.out.println("====================");   
       System.out.println("You continue your journey..");
       System.out.println("\n\n\n\n\n\n");
       gameBoard.gameBoard(random,character1);   
        }
      if (combatChoice == 2)
      {
       gameBoard.buyStuff(character1);   
        }
      if (combatChoice == 3)
      {
       journeyHandler.characterDeath(character1);   
        }
      if (combatChoice == 4)
      {
       int characterHealth = character1.getHealth();   
       int newChoice;
       newChoice = 0;
       System.out.println("\n\n\n\n\n\n\n\n\n\n");
       System.out.println("====================");
       System.out.println("[1] Pay your respect to the gods.");
       System.out.println("[2] Rest");
       System.out.println("[3] Stats for nerds!1!");
       System.out.println("====================");
       newChoice = kb.nextInt();
       if (newChoice == 1)
       {
        randomOther.Praise(character1);
        gameBoard.gameBoard(random,character1); 
        }
       if (newChoice == 2)
       {
        System.out.println("You awake feeling rested; you gain 10 health.");
        character1.setHealth(characterHealth + 10);  
        gameBoard.gameBoard(random,character1); 
        }
       if (newChoice == 3)
       {
        randomOther.showStats(character1);
        journeyHandler.subseqChoice(false,1,character1); 
        }
        }
        }
    }
    public static void combatHandler(int monsterID, CharacterStuff character1)
    {
     Scanner kb = new Scanner(System.in);
     int randomroll = 0;
     int monsterHealth = 0;
     int hitcounter = 0;
     int random;
     int userChoice = -1;
     random = 1 + (int) (Math.random()*5); 
     
     monsterClass monster1 = new monsterClass(monsterID, character1.getLevel());
     /*
      * ID's
      * 1 = Regular monster
      * 2 = Medium monster
      * 3 = Large monster
      * 4 = Boss monster
      */
      monsterHealth = monster1.getHealth();

      System.out.println("\n\n\n");
      System.out.println("Combat results:");  
      while (monsterHealth > 0 && character1.getHealth() > 0)
      {
       int randomDam1;   
       /*
        * Combat Rolls
        * 1 = Decent Attack (10 DMG)
        * 2 = Bad Attack (10 DMG)
        * 3 = Decent Attack
        * 4 = Decent Attack
        * 5 = Crit Attack (25 DMG)
        */ 
       while (userChoice != 0 && monsterHealth > 0 && character1.getHealth() > 0)
       {
        randomDam1 = 1 + (int) (Math.random()*3);
        randomroll = 1 + (int) (Math.random()*5);
        if (randomroll == 1 || randomroll == 3 || randomroll == 4)
        {
         monsterHealth -= 10;
         monster1.setHealth(monsterHealth);
         hitcounter++;
         System.out.println("A decent hit!");
         System.out.println("The monster's health is now " + monster1.getHealth());
         if (randomDam1 == 1 && monsterHealth > 0)
         { 
          journeyHandler.playerDamage(monsterID,character1);   
         }
         }
        else if (randomroll == 2)
        {
         monsterHealth -= 5;
         monster1.setHealth(monsterHealth);
         hitcounter++;
         System.out.println("Bad hit!");
         System.out.println("The monster's health is now " + monster1.getHealth());
         if (randomDam1 == 1 && monsterHealth > 0)
         {
          journeyHandler.playerDamage(monsterID,character1);    
         }
        }
        else if (randomroll == 5)
        {
         monsterHealth -= 25;
         monster1.setHealth(monsterHealth);
         hitcounter++;
         System.out.println("Crit hit!");
         System.out.println("The monster's health is now " + monster1.getHealth());
         if (randomDam1 == 1 && monsterHealth > 0)
         {
          journeyHandler.playerDamage(monsterID,character1);    
         }
        }
        if (monsterHealth <= 0)
        {
         break;   
        }
        System.out.println("Enter (1) to keep fighting, (0) to Run: ");
        userChoice = kb.nextInt();
       }
       if (userChoice == 0)
       {
        System.out.println("You ran away.\n");   
        gameBoard.gameBoard(random, character1);  
        }
        }
       
     System.out.println("It took you " + hitcounter + " hits to kill the monster!");
     int experienceGained = (monsterID * 2);
     character1.setExperience((character1.getExperience() + experienceGained), character1);
     System.out.println("You gained " + experienceGained + " experience.");
     System.out.println("\n\n\n\n\n");
     character1.incNumKilled(character1);
     int amountGold = character1.getGold();
     character1.setGold(amountGold + monster1.getGold());
     gameBoard.gameBoard(random, character1);
    }
    public static void playerDamage(int monsterID, CharacterStuff character1)
    {
     /*
      * ID's
      * 1 = Regular monster
      * 2 = Medium monster
      * 3 = Large monster
      * 4 = Boss monster
      */
     int characterHealth = character1.getHealth();
     if (monsterID == 1)
     {
      character1.setHealth(characterHealth - 5);  
      System.out.println("You took 5 damage.");
      if (character1.getHealth() <= 0)
      {
       journeyHandler.characterDeath(character1);   
        }
      System.out.println("You have " + character1.getHealth() + " health left.");
        }
     if (monsterID == 2)
     {
      character1.setHealth(characterHealth - 7);
      System.out.println("You took 7 damage.");
      if (character1.getHealth() <= 0)
      {
       journeyHandler.characterDeath(character1);   
        }
      System.out.println("You have " + character1.getHealth() + " health left.");
        }
     if (monsterID == 3)
     {
      character1.setHealth(characterHealth - 10);
      System.out.println("You took 10 damage.");
      if (character1.getHealth() <= 0)
      {
       journeyHandler.characterDeath(character1);   
        }
      System.out.println("You have " + character1.getHealth() + " health left.");
       }
     if (monsterID == 4)
     {
      character1.setHealth(characterHealth - 12);
      System.out.println("You took 12 damage.");
      if (character1.getHealth() <= 0)
      {
       journeyHandler.characterDeath(character1);   
        }
      System.out.println("You have " + character1.getHealth() + " health left.");
        }
    }
    public static void characterDeath(CharacterStuff character1)
    {
     System.out.println("\n\n\n\n\n\n\n");   
     System.out.println("You have died..");
     character1.setHealth(0);
     randomOther.showStats(character1);
     System.exit(0);
    }
}
