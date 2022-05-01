import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{
    Bee1 bee = new Bee1();
    ThiccFlower thiccflower = new ThiccFlower();
    Start start = new Start();
    Controls control = new Controls();
    LevelSelector level = new LevelSelector();
    List<Horn> hornets = new ArrayList<Horn>();
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        addObject(thiccflower, 145, 482);
        addObject(start, 350, 250);
        addObject(control, 350, 450);
        addObject(level, 557 ,599);
        act();
        Greenfoot.start();
        int direction = Greenfoot.getRandomNumber(360);
    }
}
