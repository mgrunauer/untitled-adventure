import java.util.*;
public class Main
{
    public static void main(String[] args)
    {   
     Scanner kb = new Scanner(System.in);   
     String name = "";
     System.out.print("Enter a name: ");
     name = kb.nextLine();
     while (name.length() == 0)
     {
      System.out.print("Reenter a name with atleast one character: ");
      name = kb.nextLine();   
        }
     
     CharacterStuff character1 = new CharacterStuff(name);
     character1.setCharacterName(name);
     System.out.println("You are " + name + ", and look like this ☻");
     journeyHandler.journeyHandler(character1);
     
    }
}
