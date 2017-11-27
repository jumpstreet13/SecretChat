package com.smedialink.abakarmagomedov.secretchat.di;

import android.content.Context;
import android.support.annotation.NonNull;

import com.smedialink.abakarmagomedov.secretchat.App;
import com.smedialink.abakarmagomedov.secretchat.di.scope.PerApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by abakarmagomedov on 16/08/17.
 */

@Module
public class AppModule {

    @PerApplication
    @Provides
    Context provideContext(App application) {
        return application;
    }
}
