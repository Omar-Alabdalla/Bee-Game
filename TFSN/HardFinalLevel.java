import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardFinalLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardFinalLevel extends World
{
    private int Score;
    private int Time;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public HardFinalLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        Time = 5000;
        Spawn();
    }

    public void act()//cited sources WBC-1
    {
        if (Greenfoot.getRandomNumber(100) < .06)
        {
            addObject(new ThiccRock(), 699, Greenfoot.getRandomNumber(699));
        }
        if (Greenfoot.getRandomNumber(100) < .06)
        {
            addObject(new ThiccRock(), 1, Greenfoot.getRandomNumber(699));
        }
        if (Greenfoot.getRandomNumber(100) < .06)
        {
            addObject(new ThiccRock(), Greenfoot.getRandomNumber(699), 699);
        }
        if (Greenfoot.getRandomNumber(100) < .06)
        {
            addObject(new ThiccRock(), Greenfoot.getRandomNumber(699), 1);
        }
        timeTick();
        if (Time == 0){
            Greenfoot.setWorld(new HardCongragulations());
        }
    }

    public void Spawn()
    {
        Bee1 bee1 = new Bee1();
        addObject(bee1, 350, 350);
    }

    /**
     * 
     */
    public void addScore(int points)
    {
        Score = Score + points;
        showText("Score: " + Score, 80, 25);
        if(Score <=200)
        {

            Greenfoot.stop();
        }
    }

    /**
     * 
     */
    private void showScore()
    {
        showText("Score: " + Score, 80, 25);
    }

    /**
     * 
     */
    private void showTime()
    {
        showText("Time: " + Time, 300, 25);
    }

    private void timeTick()
    {
        Time = Time - 1;
        showTime();
    }
}
