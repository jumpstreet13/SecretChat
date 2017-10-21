package com.smedialink.abakarmagomedov.secretchat.di;

import android.app.Activity;

import com.smedialink.abakarmagomedov.secretchat.presentation.login.LoginActivtiy;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by abakarmagomedov on 21/10/2017.
 */

@Module(subcomponents = {LoginActivityComponent.class})
public abstract class AppScBuildersModule {

    @Binds
    @IntoMap
    @ActivityKey(LoginActivtiy.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindLoginActivityInjectorFactory(LoginActivityComponent.Builder builder);

}
