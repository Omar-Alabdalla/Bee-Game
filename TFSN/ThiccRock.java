import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class ThiccRock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThiccRock extends Actor
{
    /** Size of this asteroid */
    private int size;//Cited Astroids

    /** When the stability reaches 0 the asteroid will break up */
    private int stability;
    /**
     * Act - do whatever the ThiccRock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX() >350)
        {
            setLocation(getX()-1, getY());
        }
        if(getY() <350)
        {
            setLocation(getX(), getY()+1);
        }
        if(getY() >350)
        {
            setLocation(getX(), getY()-1);
        }
        if(getX() <350)
        {
            setLocation(getX()+1, getY());
        }
        destruction();
        GameEnd();
    }  

    /**
     * Hit this asteroid dealing the given amount of damage.
     */
    public void hit(int damage) 
    {
        stability = stability - damage;
        if (stability <= 0) {
            getWorld().removeObject(this);     
        }
    }

    public void destruction()
    {
        if(isTouching(Bee1.class))
        {
            removeTouching(Bee1.class);
            Greenfoot.setWorld(new MenuScreen());
        }
    }

    public void GameEnd()
    {
        if(getX() ==350 && getY() ==350)
        {
            Greenfoot.setWorld(new MenuScreen());
        }
    }
}
