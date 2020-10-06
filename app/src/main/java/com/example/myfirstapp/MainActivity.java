package com.example.myfirstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
//import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private DisplayManager dManager;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Created!");
        android.util.Log.d("tag", "Created a log entry.....");
        super.onCreate(savedInstanceState);
//        MyDisplayListener myListener = new MyDisplayListener();


        DisplayManager.DisplayListener mDisplayListener = new DisplayManager.DisplayListener() {
            @Override
            public void onDisplayAdded(int displayId) {
                android.util.Log.i("tag", "Display #" + displayId + " added.");
            }

            @Override
            public void onDisplayChanged(int displayId) {
                android.util.Log.i("tag", "Display #" + displayId + " changed.");
            }

            @Override
            public void onDisplayRemoved(int displayId) {
                android.util.Log.i("tag", "Display #" + displayId + " removed.");
            }
        };

        dManager = getSystemService((DisplayManager.class));
        dManager.registerDisplayListener(mDisplayListener, null);
        Display[] displays = dManager.getDisplays();
        for (Display display : displays) {
//            System.out.println(display);
            System.out.println("The Display is: " + display.getName());
            System.out.println("The Display is: " + display.getDisplayId());
        }
        setContentView(R.layout.activity_main);
    }
}