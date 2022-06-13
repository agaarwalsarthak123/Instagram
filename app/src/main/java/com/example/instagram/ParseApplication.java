package com.example.instagram;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate()
    {
        super.onCreate();

        // Registering Parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("m0vJFavzjEj1y1QWaQPcoBr1NosMPZvEnlW1INpx")
                .clientKey("8KotGi2YoYYqDaqM8W9X6Vmn3Iux96Dnl6ZyrrY9")
                .server("https://parseapi.back4app.com")
                .build()
        );


    }

}
