public class monsterClass
{
    private int mHealth;
    private int mLevel;
    private int mGold;
    public monsterClass(int monsterID, int mLevel)
    {
     mHealth = (monsterID * 10);
     this.mLevel = mLevel;
     mGold = 1 + (int)(Math.random()*10);
    }
    public int getHealth()
    {
     return mHealth;   
    }
    public int getLevel()
    {
     return mLevel;   
    }
    public int getGold()
    {
     return mGold;   
    }
    public void setHealth(int mHealth)
    {
     this.mHealth = mHealth;   
    }
    public void setLevel(int mLevel)
    {
     this.mLevel = mLevel;   
    }
    public void setGold(int mGold)
    {
     this.mGold = mGold;   
    }
}   

