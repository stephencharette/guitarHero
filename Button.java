import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    public static double exactScore = 0.0;
    public static double multi = 1.1;
    private String key;
    private int img;
    private double slope;
    private int timer;
    /* 0 = green
     * 1 = red
     * 2 = yellow
     * 3 = blue
     * 4 = orange
     */ 

    public Button( String key, int img )
    {
        this.key = key;
        this.img = img;
        setImage( "button" + img + ".png" );
    }

    public int getButtonX( int n )
    {
        if( n == img )
        {
            return getX();
        }

        return -1;
    }

    public int getKeyNum( String key )
    {
        if( key.equals( "1" ) ) return 0;
        else if( key.equals( "2" ) ) return 1;
        else if( key.equals( "3" ) ) return 2;
        else if( key.equals( "4" ) ) return 3;
        return 4;
    }

    public boolean isTouchingNote()
    {
        if( !isTouching( Note.class ) )
        {
            return false;
        }
        return true;
    }

    public void delay( int n )
    {
        int delay = 0;
        delay++;
        if( delay < n ) return;
        delay = 0;
    }

    public void act() 
    {
        setImage( "button" + getKeyNum(key) + ".png" );
        getWorld().showText( "" + (int)(exactScore), 145, 425 );
        getWorld().showText( "x" + (int)(multi), 183, 470 ); 
        if( Greenfoot.isKeyDown( key ) && Greenfoot.isKeyDown( "enter" ) && isTouching(Note.class ) )
        {
            setImage( "p" + getKeyNum(key) + ".png" );
            while( isTouching( Note.class ) )
            {
                removeTouching( Note.class );
                multi += 0.2;
                if( !(Meter.meterValue + (int)(multi) >= 40) ||
                !(Meter.meterValue + (int)(multi) <= -40 ) ){
                    Meter.meterValue += (int)(multi);
                }
                else {
                    if( multi > 0 ) Meter.meterValue++;
                    else if( multi < 0 ) Meter.meterValue--;
                }
                exactScore += multi;
                timer++;
                if( timer % 35 == 0 )
                {
                    timer = 1;
                }
            }
        }
        else if( Greenfoot.isKeyDown( key ) && Greenfoot.isKeyDown( "enter") && 
        !isTouching( Note.class ) )
        {
            setImage( "p" + getKeyNum(key) + ".png" );
            timer++;
            if( timer % 35 == 0 )
            {
                exactScore --;
                Meter.meterValue-=2;
                timer = 1;
            }
        }
        
         

    }    
}
