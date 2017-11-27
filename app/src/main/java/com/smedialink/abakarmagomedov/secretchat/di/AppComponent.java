package com.smedialink.abakarmagomedov.secretchat.di;

import com.smedialink.abakarmagomedov.secretchat.App;
import com.smedialink.abakarmagomedov.secretchat.presentation.avatar_choosing.AvatarActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by abakarmagomedov on 05/08/17.
 */

@Component(modules = {AppModule.class, AppScBuildersModule.class, AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<App> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }
}
