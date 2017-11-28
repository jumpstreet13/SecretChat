package com.smedialink.abakarmagomedov.secretchat.di;

import com.smedialink.abakarmagomedov.secretchat.data.datasource.UserModelStore;
import com.smedialink.abakarmagomedov.secretchat.data.datasource.factory.UserModelStoreFactory;
import com.smedialink.abakarmagomedov.secretchat.data.datasource.impl.DiskUserModelStore;
import com.smedialink.abakarmagomedov.secretchat.data.mapper.QiscusAccountMapper;
import com.smedialink.abakarmagomedov.secretchat.data.mapper.UserEntityMapper;
import com.smedialink.abakarmagomedov.secretchat.data.repository.UserEntityRepositoryImpl;
import com.smedialink.abakarmagomedov.secretchat.di.scope.PerActivity;
import com.smedialink.abakarmagomedov.secretchat.di.scope.PerApplication;
import com.smedialink.abakarmagomedov.secretchat.domain.repository.UserEntityRepository;
import com.smedialink.abakarmagomedov.secretchat.utils.SharedPrefManager;

import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;

/**
 * Created by abakarmagomedov on 28/11/2017.
 */

@Module(includes = {AndroidInjectionModule.class})
public class RepoModule {

    @PerApplication
    @Provides
    UserEntityRepository provideUserEntityRepository(UserModelStoreFactory dataSourceFactory,
                                                     UserEntityMapper mapper) {
        return new UserEntityRepositoryImpl(dataSourceFactory, mapper);
    }

    @PerApplication
    @Provides
    UserModelStore provideUserModelStore(SharedPrefManager manager, QiscusAccountMapper mapper) {
        return new DiskUserModelStore(manager, mapper);
    }

}
