package com.example.houmanazemati.myapplication;

/**
 * Created by houman.azemati on 2/23/18.
 */

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.os.*;
import com.example.houmanazemati.myapplication.*;

/**
 * Created by houman.azemati on 2/22/18.
 */
public class Accelerometer implements Runnable {

    private Handler handler;
    Acceleration accel;
    float x, y, z;
    /*
     *   process the acceleration
     *   @param accleration The acceleration that needs to be processed
     *   @return void
     */
    private void proccessAcceleration(Acceleration acceleration) {
    }
    /*
     * Constructor
     */
    public Accelerometer() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Handler getHandler() {
        return handler;
    }
    @Override
    public void run() {
        Looper.prepare();

        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                accel = (Acceleration)msg.obj;
                proccessAcceleration(accel);
            }
        };
//        Looper.myQueue().addIdleHandler(handler);
        Looper.loop();
    }

    public void accelometer_callback(float x, float y, float z)
    {   // Movement
        String message = "the (x,y,z) acceleration is"+ x + y + z;
        Log.d("accel", message);
    }
}
