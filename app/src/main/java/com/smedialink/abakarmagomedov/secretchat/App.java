package com.smedialink.abakarmagomedov.secretchat;

import android.app.Activity;
import android.app.Application;

import com.qiscus.sdk.Qiscus;
import com.smedialink.abakarmagomedov.secretchat.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


/**
 * Created by abakarmagomedov on 04/08/17.
 */

public class App extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Qiscus.init(this, "durovchat");
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
