import greenfoot.*;

public abstract class Level extends World
{
    String[] map;

    public Level()
    {
        super(800, 600, 1);
        //setBackground(new GreenfootImage("StartScreen.png")); // Splash Screen
        setFields();
        //      b = block        m = monster         f = floating platform
        //      p = platform     k = key             w = wall
        //      c = character    d = door            s = score
        //      l = lives        q = boss            z = spikes
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "cbpwmdksflqz".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Player();
                if (kind == 1) actor = new Block();
                if (kind == 2) actor = new Platform2();
                if (kind == 3) actor = new Wall();
                if (kind == 4) actor = new Monster();
                if (kind == 5) actor = new Door();
                if (kind == 6) actor = new Key();
                if (kind == 7) actor = new Score();
                if (kind == 8) actor = new Floater();
                if (kind == 9) actor = new Lives();
                if (kind == 10) actor = new Boss();
                if (kind == 11) actor = new Spikes();
                addObject(actor, 16+j*32, 16+i*32);
        }
        if (Player.lives==0)
        {
            Greenfoot.setWorld(new Gameover());
            Greenfoot.stop();
        }
    }

    public void setFields() {}

    public void nextLevel() {}
}