package com.mygdx.gameobjects;

/**
 * Created by Ayman on 6/3/2015.
 */
import java.util.Random;

public class Pipe extends Scrollable{

    private Random r;

    // When Pipe's constructor is invoked, invoke the super (Scrollable)
    // constructor
    public Pipe(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);

        r = new Random();
    }

    @Override
    public void reset(float newX) {
        // Call the reset method in the superclass (Scrollable)
        super.reset(newX);
        // Change the height to a random number
        height = r.nextInt(90) + 15;
    }

    //When
}
