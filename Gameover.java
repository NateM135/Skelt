import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Level
{
    public void setFields()
    {
        map = new String[] {" "};
    }
    public void nextLevel()
    {
        Greenfoot.stop();
    }
}
