import greenfoot.Greenfoot;

public class Level06 extends Level
{
    public void setFields()
    {    
        map = new String[] { "                        s ",
            "                        l ",
            "                       ",
            "                   ",
            "                        ",
            "              ",
            "                         ",
            "                   k",
            "                      bbbbbbbb   ",
            "                    ",
            "    ",
            "              bbbbbbbb           ",
            "                      ",
            "                       ",
            "   bbbbbbbbbbbb                      ",
            "        ",
            "cd          ",
            "bbbbbbbbbbbbbbbbbbbbbbbbb                     ",
            "" };
        
    }

    public void nextLevel()
    {
        Greenfoot.setWorld(new Level07());
    }
}