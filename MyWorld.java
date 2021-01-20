import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private double notePercent = 0.005;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(940, 620, 1); 
        
        Meter.meterValue = 0;
        
        Button green = new Button( "1", 0 );
        addObject( green, 293, 554 );
        
        Button red = new Button( "2", 1 );
        addObject( red, 379, 554 );
        
        Button yellow = new Button( "3", 2 );
        addObject( yellow, getWidth()/2 - 2, 554 );
        
        Button blue = new Button( "4", 3 );
        addObject( blue, 555, 554 );
        
        Button orange = new Button( "5", 4 );
        addObject( orange, 643, 554 );
        
        
        
        RockMeter rock = new RockMeter();
        addObject( rock, 759, 483 );
        
        Meter m = new Meter();
        addObject( m, 759, 537 );
        
        Test t = new Test();
        addObject( t, 810, 558 );
        
        
        //NoteTest test = new NoteTest();
        //addObject( test, 402, 277 );
        
        Button.exactScore = 0;
        Greenfoot.playSound("sandman.mp3");
        
    }
    public double getPercent()
    {
        return notePercent;
    }
    public void act()
    {
        int ranKey = (int)( Math.random() * 5 );
        int x = 0;
        if( ranKey == 0 ) x = 408;
        else if( ranKey == 1 ) x = 437;
        else if( ranKey == 2 ) x = getWidth()/2 - 2;
        else if( ranKey == 3 ) x = 500;
        else if( ranKey == 4 ) x = 532;
        if( Math.random() < notePercent )
        {
            Note n = new Note(ranKey);
            addObject( n, x, 273 );
            if( notePercent <= 0.02 ) notePercent += 0.00025;
        }
        
        
    }
}
