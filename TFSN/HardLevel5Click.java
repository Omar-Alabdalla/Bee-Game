import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardLevel5Click here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardLevel5Click extends Levels
{
    /**
     * Act - do whatever the HardLevel5Click wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HardLevel5());
        }
    }    
}
