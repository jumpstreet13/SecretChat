package com.smedialink.abakarmagomedov.secretchat.di;

import com.smedialink.abakarmagomedov.secretchat.presentation.avatar_choosing.AvatarActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by abakarmagomedov on 05/08/17.
 */

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(AvatarActivity avatarActivity);
}
