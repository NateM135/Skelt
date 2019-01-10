import greenfoot.Greenfoot;

public class Level08 extends Level
{
    public void setFields()
    {    
        map = new String[] { "                        s ",
            "                        l ",
            "                       ",
            "                   ",
            "    k                    ",
            "    b          ",
            "                         ",
            "              f     ",
            "                         ",
            "                   ",
            "    ",       
            "                   bb     ",
            "              bb       ",
            "         bb            ",
            "    bb                                  ",
            "        ",
            "cd          ",
            "ppppppppppppppppppppppppppp                  ",
            "" };
        }
    

    public void nextLevel()
    {
        Greenfoot.setWorld(new Level09());
    }
}