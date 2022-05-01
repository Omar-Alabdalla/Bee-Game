import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Horn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Horn extends Player
{
    public int rot;
    public Horn(int rotation)
    {
        rot=rotation;
        setRotation(rot);

    }

    /**
     * The bullet will damage asteroids if it hits them.
     */
    public void act()
    {
        if(isTouching(ThiccRock.class))
        {
            removeTouching(ThiccRock.class);
        }
        if (isAtEdge() )
        {
            getWorld().removeObject(this);
        }
        move(10);
    }

    //public void setHornRotation(int Rotation)
    //{/setRotation(Rotation);
    //}

}
