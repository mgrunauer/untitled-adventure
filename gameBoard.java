public class gameBoard
{
    public static String gameBoard(int random, CharacterStuff character1)
    {
     int monsterHealth;   
     String board = "";  
     int monsterID = 1 + (int) (Math.random()*4);
     
     if (random == 1)
     {
      board = "";
      for (int i = 0; i < 11; i++)
      {
       if (i != 6)
       {
        board += "\n▓▓░░░▓▓";
       }
       if (i == 6)
       {
        board += "\n▓▓░☻░▓▓";   
        }
      }
      System.out.println(board);
      journeyHandler.subseqChoice(false,0,character1);
        }
     
     /*
      * Generic board above
      */
      
     else if (random == 2)
     {
      board = "";
      monsterID = 1 + (int) (Math.random()*4);
      if (monsterID == 1)
      {
       System.out.println("====================");   
       System.out.println("A wild slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        } 
      if (monsterID == 2)
       {
       System.out.println("====================");   
       System.out.println("A trained slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      if (monsterID == 3)
      { 
       System.out.println("====================");   
       System.out.println("An expert slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }   
      if (monsterID == 4)
      { 
       System.out.println("====================");   
       System.out.println("A King Slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      for (int i = 0; i < 7; i++)
      {
       if (i == 2)
       {
        board += "\n▓▓░(ಠ_ಠ)░▓▓";   
        }
       if (i != 5 && i != 2)
       {
        board += "\n▓▓▓░░░▓▓▓";
       }
       if (i == 5)
       {
        board += "\n▓▓▓░☻░▓▓▓";   
        }
      }
      System.out.println(board);
      journeyHandler.subseqChoice(true,monsterID,character1);
        }
        else if (random == 3)
     {
      board = "";
      monsterID = 1 + (int) (Math.random()*4);
      if (monsterID == 1)
      {
       System.out.println("====================");   
       System.out.println("A wild slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        } 
      if (monsterID == 2)
       {
       System.out.println("====================");   
       System.out.println("A trained slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      if (monsterID == 3)
      { 
       System.out.println("====================");   
       System.out.println("An expert slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }   
      if (monsterID == 4)
      { 
       System.out.println("====================");   
       System.out.println("A King Slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      for (int i = 0; i < 7; i++)
      {
       if (i == 2)
       {
        board += "\n▓▓░(ಠ_ಠ)░▓▓";   
        }
       if (i != 5 && i != 2)
       {
        board += "\n▓▓▓░░░▓▓▓";
       }
       if (i == 5)
       {
        board += "\n▓▓▓░☻░▓▓▓";   
        }
      }
      System.out.println(board);
      journeyHandler.subseqChoice(true,monsterID,character1);
        }
        else if (random == 4)
     {
      board = "";
      monsterID = 1 + (int) (Math.random()*4);
      if (monsterID == 1)
      {
       System.out.println("====================");   
       System.out.println("A wild slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        } 
      if (monsterID == 2)
       {
       System.out.println("====================");   
       System.out.println("A trained slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      if (monsterID == 3)
      { 
       System.out.println("====================");   
       System.out.println("An expert slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }   
      if (monsterID == 4)
      { 
       System.out.println("====================");   
       System.out.println("A King Slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      for (int i = 0; i < 7; i++)
      {
       if (i == 2)
       {
        board += "\n▓▓░(ಠ_ಠ)░▓▓";   
        }
       if (i != 5 && i != 2)
       {
        board += "\n▓▓▓░░░▓▓▓";
       }
       if (i == 5)
       {
        board += "\n▓▓▓░☻░▓▓▓";   
        }
      }
      System.out.println(board);
      journeyHandler.subseqChoice(true,monsterID,character1);
        }
          else if (random == 5)
     {
      board = ""; 
      monsterID = 1 + (int) (Math.random()*4);
      if (monsterID == 1)
      {
       System.out.println("====================");   
       System.out.println("A wild slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        } 
      if (monsterID == 2)
       {
       System.out.println("====================");   
       System.out.println("A trained slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      if (monsterID == 3)
      { 
       System.out.println("====================");   
       System.out.println("An expert slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }   
      if (monsterID == 4)
      { 
       System.out.println("====================");   
       System.out.println("A King Slugman approaches..");
       System.out.println("====================");
       System.out.println("");
       System.out.println("Your health: " + character1.getHealth());
       System.out.println("Your Level: " + character1.getLevel());
        }
      for (int i = 0; i < 7; i++)
      {
       if (i == 2)
       {
        board += "\n▓▓░(ಠ_ಠ)░▓▓";   
        }
       if (i != 5 && i != 2)
       {
        board += "\n▓▓▓░░░▓▓▓";
       }
       if (i == 5)
       {
        board += "\n▓▓▓░☻░▓▓▓";   
        }
      }
      System.out.println(board);
      journeyHandler.subseqChoice(true,monsterID,character1);
        }
     return "";
    }
    public static void buyStuff(CharacterStuff character1)
    {
     int random = 1 + (int) (Math.random()*5);
     
     System.out.println("Your health: " + character1.getHealth());
     System.out.println("Your Level: " + character1.getLevel());
     System.out.println("▓▓▓▓▓▓▓▓▓");
     for (int j = 0; j < 10; j++)
     {
      if (j == 3)
      {
       System.out.println("▓░░(>_>)░░▓");
        }
      if (j == 8)
      {
       System.out.println("▓░░░☻░░░▓");   
        }
      if (j != 3 && j != 8)
      {
       System.out.println("▓░░░░░░░▓");
      }
        }
     System.out.println("▓▓▓▓▓▓▓▓▓");
     
     randomOther.buyStuff(character1);
     gameBoard.gameBoard(random,character1);
    }
}
