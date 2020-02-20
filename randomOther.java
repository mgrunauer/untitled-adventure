import java.util.Scanner;
public class randomOther
{
    public static void Praise(CharacterStuff character1)
    {
     /*
      * Praise has a chance of either helping or hurting the character.
      */   
     int randomroll = 1 + (int) (Math.random()*10);
     int characterHealth = character1.getHealth();
     int characterGold = character1.getGold();
     
     for (int i = 0; i < 11; i++)
     {
      if (i != 6 && i != 7)
      {
       System.out.println("▓░░░░░░░░▓");   
        }
      if (i == 6)
      {
       System.out.println("▓░░░¥░░░░▓");   
        }
      if (i == 7)
      {
       System.out.println("▓░░░☻░░░░▓");   
        }
        }
     if (randomroll == 1 || randomroll == 3)
     {
      character1.setGold(characterGold + 5);
      System.out.println("Your pocket feels a bit heavier; you have gained 5 gold.");
        }
     if (randomroll == 2)
     {
      character1.setHealth(characterHealth + 10);
      System.out.println("You feel empowered; your health rises by 10.");
        }
     else if (randomroll != 2 && randomroll != 1 && randomroll != 3)
     {
      System.out.println("It seems you didn't praise hard enough.");   
        }
    }
    public static void buyStuff(CharacterStuff character1)
    {
     Scanner kb = new Scanner(System.in);
     int userinp;
     int random = 1 + (int) (Math.random()*5);
     

     
     System.out.println("====================");
     System.out.println("[1] Buy a health potion (10 gold)");
     System.out.println("[2] Return to your adventure");
     System.out.println("====================");
     userinp = kb.nextInt();
     
     if(userinp == 1 && character1.getGold() >= 10)
     {
      System.out.println("You feel invigorated. You lose 10 gold and gain 10 health.");
      character1.setHealth((character1.getHealth() + 10));
      character1.setGold((character1.getGold() - 10));
      System.out.println("Your gold is now: " + character1.getGold());
        }
     else if (userinp == 1 && character1.getGold() < 10)
     {
      System.out.println("You cannot afford this product. Be gone!");   
        }
     else
     {
      System.out.println("You chose not to buy anything.");   
        }
     
     
    }
    public static void showStats(CharacterStuff character1)
    { 
     System.out.println("\n\n\n\n\n");
     System.out.println("====================");
     System.out.println("Name: " + character1.getCharacterName());
     System.out.println("Health: " + character1.getHealth());
     System.out.println("Gold: " + character1.getGold());
     System.out.println("Monsters killed: " + character1.getNumKilled());
     System.out.println("====================");
     System.out.println("\n\n\n\n\n");
    }
}
