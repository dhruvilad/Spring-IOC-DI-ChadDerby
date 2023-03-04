package org.chad;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //create the object
        Coach baseballCoach=new TrackCoach();

        //use the object
        System.out.println(baseballCoach.getDailyWorkout());

    }
}
