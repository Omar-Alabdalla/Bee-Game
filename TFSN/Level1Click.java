import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1Click here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Click extends Levels
{
    /**
     * Act - do whatever the Level1Click wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1());
        }
    }    
}
