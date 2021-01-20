import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meter extends Actor
{
    public static int meterValue = 0;
    public int lights = 0;
    /**
     * Act - do whatever the Meter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void setRot(int n)
    {
        setRotation( n );  
    }
    
    

    public void act() 
    {
        if( meterValue < 41 && meterValue > -40 )
        {
            setRotation( meterValue );
            lights = 0;
        }

    }    
}
