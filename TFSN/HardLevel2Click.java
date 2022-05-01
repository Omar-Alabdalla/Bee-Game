import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardLevel2Click here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardLevel2Click extends Levels
{
    /**
     * Act - do whatever the HardLevel2Click wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HardLevel2());
        }
    }    
}
