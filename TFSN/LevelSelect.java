import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{
    Bee1 bee = new Bee1();
    Level1Click level1 = new Level1Click();
    Level2Click level2 = new Level2Click();
    Level3Click level3 = new Level3Click();
    Level4Click level4 = new Level4Click();
    Level5Click level5 = new Level5Click();
    FinalLevelClick finallevel = new FinalLevelClick();
    HardLevel1Click level1hard = new HardLevel1Click();
    HardLevel2Click level2hard = new HardLevel2Click();
    HardLevel3Click level3hard = new HardLevel3Click();
    HardLevel4Click level4hard = new HardLevel4Click();
    HardLevel5Click level5hard = new HardLevel5Click();
    HardFinalLevelClick finallevelhard = new HardFinalLevelClick();
    Back back = new Back();
    List<Horn> hornets = new ArrayList<Horn>();
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        Objectadder();
        Text();
    }

    private void Text()
    {
        getBackground().drawImage(new GreenfootImage("Easy", 42, null, null), 94, 50);
        getBackground().drawImage(new GreenfootImage("Hard", 42, Color.RED, null), 545, 50);
    }

    private void Objectadder()
    {
        addObject(level1, 145, 650);
        addObject(level2, 145, 550);
        addObject(level3, 145, 450);
        addObject(level4, 145, 350);
        addObject(level5, 145, 250);
        addObject(finallevel, 145, 150);
        addObject(level1hard, 600, 650);
        addObject(level2hard, 600, 550);
        addObject(level3hard, 600, 450);
        addObject(level4hard, 600, 350);
        addObject(level5hard, 600, 250);
        addObject(finallevelhard, 600,150);
        addObject(back, 350, 50);
    }
}