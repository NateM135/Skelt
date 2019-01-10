import greenfoot.*;


public class Lives extends Actor
{
    
    public void act()   
    {    
        int lives = ((Player) getWorld().getObjects(Player.class).get(0)).getLives();
        setImage(new GreenfootImage("Lives: " + lives +" ", 20, Color.white, Color.black));
   
    
   
}

public void setLife(int x)
{


  

}
}