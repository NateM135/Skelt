import greenfoot.*;


public class Score extends Actor
{
    int score = 0;
    
    public void act()   
    {    
        int score = ((Player) getWorld().getObjects(Player.class).get(0)).getScore();
        setImage(new GreenfootImage("Score: " + score +" ", 20, Color.white, Color.black));
    }
}