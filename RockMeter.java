import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RockMeter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RockMeter extends Actor
{
    /**
     * Act - do whatever the RockMeter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if( Meter.meterValue > 15 )
       {
          setImage( "rmGreen.png" );
       }
       else if( Meter.meterValue < -13 )
       {
            setImage( "rmRed.png" );  
        }
       else 
          setImage( "rmYellow.png" );
    }    
}
