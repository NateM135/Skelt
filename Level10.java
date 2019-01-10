import greenfoot.Greenfoot;

public class Level10 extends Level
{
    public void setFields()
    {    
        map = new String[] { "                        s ",
            " k                       l ",
            " b                     ",
            "               ",
            "                        ",
            "         b    ",
            "                         ",
            "                   ",
            "   b                     ",
            "                   ",
            "                       ",       
            "         b               ",
            "                 ",
            "                  ",
            "    b                                    ",
            "        ",
            "cd          ",
            "ppppppppppppppppppppppppppp                  ",
            "" };
        }
    

    public void nextLevel()
    {
        Greenfoot.setWorld(new Level10());
    }
}