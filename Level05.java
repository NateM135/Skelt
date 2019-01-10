import greenfoot.Greenfoot;

public class Level05 extends Level
{
    public void setFields()
    {    
        map = new String[] { "                         s",
                             "                         l",
                             "                       ",
                             "                   ",
                             "                        ",
                             "              ",
                             "                         ",
                             "                   ",
                             "                         ",
                             "                    ",
                             "    ",
                             "                         ",
                             "                      ",
                             "                       ",
                             "                         ",
                             "   mmmmmmmm k m      ",
                             "bbbbbbbbbbbbbbb            ",
                             "          m         dc    ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level06());
    }
}