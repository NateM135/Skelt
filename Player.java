import greenfoot.*;

public class Player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping;
    private int jumpStrength = 16;
    private int speed = 4;
    static int score = 0;
    static int lives = 3;
    int world = 0;
    private boolean haskey = false;
    private int direction = 1; // 1 = right and -1 = left
    private int shootingCounter = 20; // Delay shooting
    int boo = 0;
    //GreenfootSound music = new GreenfootSound("pokemon.mp3");

    private GreenfootImage run1r = new GreenfootImage("runr1.png");
    private GreenfootImage run2r = new GreenfootImage("runr2.png");
    private GreenfootImage run3r = new GreenfootImage("runr3.png");
    private GreenfootImage run4r = new GreenfootImage("runr2.png");
    private GreenfootImage run1l = new GreenfootImage("runl1.png");
    private GreenfootImage run2l = new GreenfootImage("runl2.png");
    private GreenfootImage run3l = new GreenfootImage("runl3.png");
    private GreenfootImage run4l = new GreenfootImage("runl2.png");
    GreenfootSound laser = new GreenfootSound("shootingsound.wav");
    private int frame = 1;
    private int animationCounter = 0;

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if(!music.isPlaying())
        //{
        //    music.play();
        //}
        
        checkKey();
        checkFall();
        checkLives(this.getLives());
        shooting();
        platformAbove();
        checkRightWalls();
        checkLeftWalls();
        grab();
        exit();
        shootingCounter --;
        animationCounter++;
    }   

    public void checkKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            direction = 1;
            moveRight();
        }
        if(Greenfoot.isKeyDown("left"))
        {
            direction = -1;
            moveLeft();
        }
        if(Greenfoot.isKeyDown("up") && jumping == false)
        {
            jump();
        }
    }

    public void checkLives(int x)
    {
        if(x==0){
            lives =3;
            score=0;
            //music.stop();
            Greenfoot.setWorld(new Gameover());
            
        }
    }

    public boolean shooting()
    {
        if(Greenfoot.isKeyDown("space") && shootingCounter <= 0 && direction ==1)
        {
            getWorld().addObject(new ShootRight(), getX(), getY());
            shootingCounter = 20;
            laser.play();
            return true;
        }
        if(Greenfoot.isKeyDown("space") && shootingCounter <= 0 && direction ==-1)
        {
            getWorld().addObject(new ShootLeft(), getX(), getY());
            shootingCounter = 20;
            laser.play();
            return true;
        }
        return false;
    }

    public void moveRight()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 4 == 0)
        {
            animateRight();
        }
    }
    //fix this 

    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(run1r);
        }
        else if(frame == 2)
        {
            setImage(run2r);
        }
        else if(frame == 3)
        {
            setImage(run3r);
        }
        else if(frame == 4)
        {
            setImage(run4r);
            frame = 1;
            return;
        }
        frame++;
    }

    public void moveLeft()
    {
        setLocation(getX()-speed, getY());
        if(animationCounter %4 == 0)
        {
            animateLeft();
        }
    }
    //fix this

    public void animateLeft()
    {
        if(frame == 1)
        {
            setImage(run1l);
        }
        else if(frame == 2)
        {
            setImage(run2l);
        }
        else if(frame == 3)
        {
            setImage(run3l);
        }
        else if(frame == 4)
        {
            //setImage(run4l);
            frame = 1;
            return;
        }
        frame++;
    }

    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, Platform.class);
        if(ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
        if(rightWall == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(rightWall);
            return true;
        }
    }

    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());

    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
        if(leftWall == null)
        {
            return false;
        }
        else
        {
            stopByLeftWall(leftWall);
            return true;
        }
    }

    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
    }

    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
        jumping = true;
        //fix this 
    }

    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }

    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    //fix this 

    public void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }

    public void grab()
    {
        if (canSee(Key.class) )
        {
            get(Key.class);
            haskey = true;
            score = score + 40;
            //Greenfoot.playSound("keyfound.wav");
        }
    }

    public void exit() // If Player has the key, they can open the door.
    {
        if (canSee(Door.class) && haskey == true) ((Level)getWorld()).nextLevel();
    }

    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public  boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        //score+=1;
        return actor != null;        
    }

    /**
     * Try to grab an object of class 'clss'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing.
     */
    public void get(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            score+=10;
            getWorld().removeObject(actor);
        }
    }   

    /**
     * Holds the score variable to be called by the Scores class for display.
     */
    public static int getScore()
    {    
        return score;
    }  

    public int getLives()
    {
        return lives;

    }

    public static void minusLife()
    {
        lives--;
        score=0;
    }

    public static void addScore(int x)
    {
        score +=x;

    }

    public void add10()
    {
        score +=10;
    }
}
