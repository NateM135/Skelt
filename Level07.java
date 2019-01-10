import greenfoot.Greenfoot;

public class Level07 extends Level
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
            "   f         f                           ",
            "        ",
            "cd          ",
            "ppppppppppppppppppppppppppp                  ",
            "" };
        
    }

    public void nextLevel()
    {
        Greenfoot.setWorld(new Level08());
    }
}