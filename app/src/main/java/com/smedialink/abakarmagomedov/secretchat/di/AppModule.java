package com.smedialink.abakarmagomedov.secretchat.di;

import android.content.Context;
import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.smedialink.abakarmagomedov.secretchat.App;
import com.smedialink.abakarmagomedov.secretchat.di.scope.PerApplication;
import com.smedialink.abakarmagomedov.secretchat.utils.SharedPrefManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;

/**
 * Created by abakarmagomedov on 16/08/17.
 */

@Module(includes = {AndroidInjectionModule.class})
public class AppModule {

    @PerApplication
    @Provides
    Context provideContext(App application) {
        return application;
    }

    @PerApplication
    @Provides
    SharedPrefManager provideSharedPrefManager(Context context, Gson gson) {
        return new SharedPrefManager(context, gson);
    }

    @PerApplication
    @Provides
    Gson provideGson() {
        return new Gson();
    }
}
