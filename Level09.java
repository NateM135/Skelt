import greenfoot.Greenfoot;

public class Level09 extends Level
{
    public void setFields()
    {    
        map = new String[] { "                        s ",
            "                        l ",
            "          k             ",
            "          b       ",
            "                        ",
            "             ",
            "      z       z            ",
            "      b   f   b       ",
            "                        ",
            "                   ",
            "                       ",       
            "          bb              ",
            "                 ",
            "     z          z      ",
            "     bb        bb                            ",
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