package com.smedialink.abakarmagomedov.secretchat;

import android.app.Activity;
import android.app.Application;

import com.qiscus.sdk.Qiscus;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by abakarmagomedov on 04/08/17.
 */

public class App extends Application implements HasActivityInjector {

    @Inject DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        Qiscus.init(this, "durovchat");
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
