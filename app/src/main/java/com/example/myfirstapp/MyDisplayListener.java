package com.example.myfirstapp;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Build;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
public class MyDisplayListener implements DisplayManager.DisplayListener {

    @Override
    public void onDisplayAdded(int arg0) {
        System.out.println("Added Display!");
        android.util.Log.d("tag", "Added Display!");
    }

    @Override
    public void onDisplayRemoved(int arg0) {
        System.out.println("Removed Display!");
        android.util.Log.d("tag", "Removed Display!");
    }

    @Override
    public void onDisplayChanged(int arg0) {
        System.out.println("Changed Display!");
        android.util.Log.d("tag", "Changed Display!");
    }
}
