import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Note here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note extends SmoothMover
{
    private double slope;
    private int key;
    
    public Note( int key )
    {
        this.key = key;
        setImage( "note" + key + ".png" );
        if( key == 0 ) slope = 2.4224;
        if( key == 1 ) slope = 4.8228;
        if( key == 2 ) slope = 0;
        if( key == 3 ) slope = 4.8228;
        if( key == 4 ) slope = 2.4224;
    }
    public void scaleNote( )
    {
        GreenfootImage img = getImage();
        double x = 48 + ( 0.03559*( getY() - 273 ) );
        //double y = x / 2.1481;
        double y = x / 2.1481;
        img.scale( (int)x, (int)y );
        setImage( img );
        /*
         * 58   48
         * 27   22
         * 
         */
    }
    
    public void act() 
    {
        scaleNote();
        if( getY() > 575 )
        {
            getWorld().removeObject( this );
            Button.multi = 1;
            if( (Meter.meterValue - 2 >= -40) ){
                    Meter.meterValue -= 2; 
                }
            if( Button.exactScore > 0 ) Button.exactScore--;
            Greenfoot.playSound( "miss" + (int)(Math.random()) + ".mp3" );
            Button.exactScore--;
        }
        else
        {
            if( key == 0 ) setLocation( getExactX() - 0.5, getExactY() + ( slope / 2 ));
            else if( key == 1 ) setLocation( getExactX() - 0.25, getExactY() + (slope/4) );
            else if( key == 2 ) setLocation( getExactX(), getExactY() + 1.25 );
            else if( key == 3 ) setLocation( getExactX() + 0.25, getExactY() + (slope/4) );
            else if( key == 4 ) setLocation( getExactX() + 0.5, getExactY() + ( slope/2 ) );
                
        }
    }    
}
