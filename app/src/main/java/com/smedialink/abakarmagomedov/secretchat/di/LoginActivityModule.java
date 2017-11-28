package com.smedialink.abakarmagomedov.secretchat.di;

import com.qiscus.sdk.Qiscus;
import com.smedialink.abakarmagomedov.secretchat.data.datasource.factory.UserModelStoreFactory;
import com.smedialink.abakarmagomedov.secretchat.data.mapper.UserEntityMapper;
import com.smedialink.abakarmagomedov.secretchat.data.repository.UserEntityRepositoryImpl;
import com.smedialink.abakarmagomedov.secretchat.di.scope.PerActivity;
import com.smedialink.abakarmagomedov.secretchat.domain.repository.UserEntityRepository;

import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;

/**
 * Created by abakarmagomedov on 15/10/2017.
 */

@Module(includes = {AndroidInjectionModule.class})
public class LoginActivityModule {

}
