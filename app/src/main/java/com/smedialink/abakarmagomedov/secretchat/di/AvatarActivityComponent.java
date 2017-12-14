package com.smedialink.abakarmagomedov.secretchat.di;

import com.smedialink.abakarmagomedov.secretchat.presentation.avatar_choosing.AvatarActivity;
import com.smedialink.abakarmagomedov.secretchat.presentation.login.LoginActivtiy;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by abakarmagomedov on 14/12/2017.
 */

@Subcomponent(modules = AvatarActivityModule.class)
public interface AvatarActivityComponent extends AndroidInjector<AvatarActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AvatarActivity> {

    }

}
