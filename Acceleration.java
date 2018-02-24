package com.example.houmanazemati.myapplication;

/**
 * Created by houman.azemati on 2/23/18.
 */

public class Acceleration {
    private float x,y,z;

    /*
     * Construction
     * @param init_x The initial acceleration in the x direction
     * @param init_y The initial acceleration in the y direction
     * @param init_z The initial acceleration in the z direction
     */
    public Acceleration(float init_x, float init_y, float init_z) {
        x = init_x;
        y = init_y;
        z = init_z;
    }

    /*
     * setAcceleration
     * @param pos_x The acceleration in the x direction
     * @param pos_y The acceleration in the y direction
     * @param pos_z The acceleration in the z direction
     */
    public void setAcceleration(float pos_x, float pos_y, float pos_z) {
        x = pos_x;
        y = pos_y;
        z = pos_z;
    }

    /*
     * get the
     * @param pos_x The acceleration in the x direction
     * @param pos_y The acceleration in the y direction
     * @param pos_z The acceleration in the z direction
     */

    public float getAccelerationX() {
        return x;
    }
    public float getAccelerationY() {
        return y;
    }
    public float getAccelerationZ() {
        return z;
    }
}
