public class CharacterStuff
{
    private int NumKilled;
    private int Faith;
    private int Health;
    private String CharacterName;
    private int Level;
    private int Experience;
    private int Gold;
    public CharacterStuff(String CharacterName)
    {
     NumKilled = 0;   
     Faith = 0;   
     Health = 100;
     CharacterName = "";
     Level = 0;
     Experience = 0;
     Gold = 10;
    }
    public int getNumKilled()
    {
     return NumKilled;   
    }
    public int getFaith()
    {
     return Faith;   
    }
    public int getHealth()
    {
     return Health;   
    }
    public String getCharacterName()
    {
     return CharacterName;   
    }
    public int getLevel()
    {
     return Level;   
    }
    public int getExperience()
    {
     return Experience;   
    }
    public int getGold()
    {
     return Gold;   
    }
    public void setFaith(int Faith)
    {
     this.Faith = Faith;   
    }
    public void incNumKilled(CharacterStuff character1)
    {
     NumKilled += 1;   
    }
    public void setHealth(int Health)
    {
     this.Health = Health;   
    }
    public void setCharacterName(String CharacterName)
    {
     this.CharacterName = CharacterName;   
    }
    public void setLevel(int Level)
    {
     this.Level = Level;   
    }
    public void setExperience(int Experience, CharacterStuff character1)
    {
     this.Experience = Experience;
     if (character1.getExperience() > 50)
     {
      character1.levelUp(character1.getLevel(),character1);   
        }
    }
    public void setGold(int Gold)
    {
     this.Gold = Gold;   
    }
    public void levelUp(int Level, CharacterStuff character1)
    {
     this.Level += 1;
     System.out.println("Your level is now " + character1.getLevel() + ".");
     character1.setExperience(0, character1);
    }
}
