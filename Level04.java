import greenfoot.Greenfoot;

public class Level04 extends Level
{
    public void setFields()
    {    
        map = new String[] { "                         ",
                             "                         ",
                             "               k         ",
                             "      bbbb               ",
                             "            bb             ",
                             "    m       bbbb           ",
                             "            bbbbb             ",
                             "              gggggg     ",
                             "                         ",
                             "           m              ",
                             "   bbbbbbbbbbbbbbbbb    ",
                             "                         ",
                             "                   m      ",
                             "              bbbbbbbbbbbbb         ",
                             "                         ",
                             "     m      ",
                             "bbbbbbbbbbbbbb            ",
                             "          m         dc    ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level05());
    }
}