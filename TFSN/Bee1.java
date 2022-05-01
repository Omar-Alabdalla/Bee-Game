import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee1 extends Player
{
    private int imageNumber;
    private int gunReloadTime= 1;              // The minimum delay between firing the gun.
    private int reloadDelayCount = 0;           // How long ago we fired the gun the last time.
    private int shotsFired;                 // Number of shots fired.

    /**
     * 
     */
    public Bee1()
    {
        setRotation(90);
    }

    /**
     * 
     */
    public Bee1(int direction)
    {
        setRotation(direction);
    }

    /**
     * Act - do whatever the Bee1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        fire();
        reloadDelayCount--;
    }    

    /**
     * 
     */
    private void movement()
    {
        //cited sources WBC-1
        if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("shift"))
        {
            move(20);
        }
        if (Greenfoot.isKeyDown("w")) 
        {
            move (3);
        }
        if (Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("shift"))
        {
            turn(-20);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("shift"))
        {
            turn(20);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("shift"))
        {
            move(-20);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-5);
        }
    }

    /**
     * Fire a bullet if the gun is ready.
     */
    private void fire() 
    {
        if (Greenfoot.isKeyDown("space"))
        {
            if (reloadDelayCount <= gunReloadTime) 
            {
                Horn h = new Horn(getRotation());
                getWorld().addObject(h, getX(), getY());

                shotsFired++;
                reloadDelayCount = 20;   // time since last shot fired
            }//astroids
        }
        if (Greenfoot.isKeyDown("["))
        {
            if (reloadDelayCount <= gunReloadTime) 
            {
                Horn h = new Horn(getRotation());
                getWorld().addObject(h, getX(), getY());

                shotsFired++;
                reloadDelayCount = 1;   // time since last shot fired
            }//astroids
        }
    }

    public int getBeeRotation()
    {
        return getRotation();
    }
}
