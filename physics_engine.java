package com.example.houmanazemati.myapplication;

import java.util.Arrays;

/**
 * Created by houman.azemati on 2/17/18.
 */
//
//public class physics_engine {
//    private int position[];
//    private int velocity[];
//    private int acceleration[] ;
//
//    private int prev_position[];
//    private int prev_velocity[];
//    private int prev_accelertion[];
//
//
//    physics_engine(int[] initial_position, int[] initial_velocity, int[] initial_acceleration) {
//        position = new int[3];
//        velocity = new int[3];
//        acceleration = new int[3];
//
//        prev_position = new int[3];
//        prev_velocity = new int[3];
//        prev_accelertion = new int[3];
//
////        prev_position = {0,0,0};
////        prev_velocity = {0,0,0};
////        prev_accelertion = {0,0,0};
//
//        position = Arrays.copyOf(initial_position, initial_position.length);
//        velocity =   Arrays.copyOf(initial_position, initial_velocity.length);
//        acceleration =  Arrays.copyOf(initial_position, initial_acceleration.length);
//    }
//
//    /*
//     * Get the current position
//     * @return The current position
//     */
//    public int[] getPosition()
//    {
//        return position;
//    }
//
//    /*
//     * Get the current velocity
//     * @return The current velocity
//     */
//    public int[] getVelocity()
//    {
//        return velocity;
//    }
//    public int[] getAcceleration()
//    {
//        return acceleration;
//    }
//    public void setPosition(int[] new_position)
//    {
//        prev_position = Arrays.copyOf(position, position.length);
//        position = Arrays.copyOf(new_position, new_position.length);
//    }
//    public void setVelocity(int[] new_velocity)
//    {
//        prev_velocity = Arrays.copyOf(velocity, velocity.length);
//        position = Arrays.copyOf(new_velocity, new_velocity.length);
//    }
//    public void setAcceration(init[] new_Acceleration)
//    {
//        prev_acceleration = Arrays.copyOf(acceleration, acceleration.length);
//        position = Arrays.copyOf(new_acceleration, new_acceleration.length);
//    }
//    public void updatePosition()
//    {
//        position = prev_position + velocity*time;
//    }
//    public void updateVelocity(int time)
//    {
//        prev_velocity = velocity;
//        velocity = acceleration()*time + prev_velocity;
//    }
//    public void updateAcceleration()
//    {
//
//    }
//}
