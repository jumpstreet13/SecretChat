package com.smedialink.abakarmagomedov.secretchat.presentation.login.di;

import com.smedialink.abakarmagomedov.secretchat.presentation.login.LoginActivtiy;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by abakarmagomedov on 15/10/2017.
 */

@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent extends AndroidInjector<LoginActivtiy> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivtiy> {

    }

}
