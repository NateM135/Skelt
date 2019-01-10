import greenfoot.Greenfoot;

public class Level02 extends Level
{
    public void setFields()
    {
        Greenfoot.playSound("mega.mp3");
        map = new String[] { "                      s  ",
                             "                      l  ",
                             "                         ",
                             "         f               ",
                             "                 m       ",
                             "                         ",
                             "                         ",
                             "     wwwwwwwwww    f     ",
                             "                         ",
                             "                         ",
                             "     m   f               ",
                             "                      b  ",
                             "                         ",
                             "                f        ",
                             "                         ",
                             " dk                     k ",
                             " w          c            ",
                             "                         ",
                             "ppppppppppppppppppppppppp" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level03());
        setBackground("download.jpg");
    }
}