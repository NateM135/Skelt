     import greenfoot.Greenfoot;

public class Level01 extends Level
{
 //GreenfootSound music = new GreenfootSound("mega.mp3");
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        m = monster         f = floating platform
    //      p = platform     k = key             w = wall
    //      c = character    d = door            s = score
    public void setFields()
    {
        map = new String[] { "                    s    ",
                             "d           c       l   ",
                             "w           k             ",
                             " w                    ",
                             "  w              z        ",
                             "wwwwwwwwwwwwwwwwwwwwwwww       ",
                             "             ",
                             "   m       m      z",
                             " wwwwwwwwwwwwwwwwwwwwwwww         ",
                             "                   ",
                             "          ",
                             "wwwwwwwwwwwwwwwwwwwwwwww      ",
                             "       ",
                             "k     m      m            ",
                             "wwwwwwwwwwwwwwwwwwwwwwwww    ",
                             "              ",
                             "mmmmmmmmmmmmmmmmmmmmmmmm                   ",
                             "mmmmmmmmmmmmmmmmmmmmmmmmm  ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    public void nextLevel()
    {
        
        Greenfoot.setWorld(new Level02());
    }
}