package com.smedialink.abakarmagomedov.secretchat;

import android.app.Application;

import com.qiscus.sdk.Qiscus;

/**
 * Created by abakarmagomedov on 04/08/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Qiscus.init(this, "durovchat");
    }
}
