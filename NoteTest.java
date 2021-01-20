import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoteTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoteTest extends SmoothMover
{
    /**
     * Act - do whatever the NoteTest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void scaleNote( int x, int y )
    {
        GreenfootImage img = getImage();
        img.scale( x, y );
        
        /*
         * 58   48
         * 27   22
         * 
         */
    }
    public void act() 
    {
        
    }    
}
