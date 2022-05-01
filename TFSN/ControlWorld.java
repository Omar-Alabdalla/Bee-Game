import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlWorld extends World
{
    Back back = new Back();
    /**
     * Constructor for objects of class ControlWorld.
     * 
     */
    public ControlWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        TextMenu();
    }

    private void TextMenu()
    {
        getBackground().drawImage(new GreenfootImage("W to move Forward", 18, null, null), 35, 150);
        getBackground().drawImage(new GreenfootImage("A to turn Left", 18, null, null), 35, 450);
        getBackground().drawImage(new GreenfootImage("D to turn right", 18, null, null), 35, 300);
        getBackground().drawImage(new GreenfootImage("Up to move Forward", 18, null, null), 465, 150);
        getBackground().drawImage(new GreenfootImage("Right to turn Right", 18, null, null), 476, 300);
        getBackground().drawImage(new GreenfootImage("Left to turn Left", 18, null, null), 498, 450);
        getBackground().drawImage(new GreenfootImage("Controls", 64, null, null), 250, 50);
        getBackground().drawImage(new GreenfootImage("Space to shoot", 18, null, null), 35, 370);
        getBackground().drawImage(new GreenfootImage("Space to shoot", 18, null, null), 498, 370);
        getBackground().drawImage(new GreenfootImage("S to reverse", 18, null, null), 35, 220);
        getBackground().drawImage(new GreenfootImage("Down to reverse", 18, null, null), 498, 220);
        addObject(back, 350, 650);
    }
}
