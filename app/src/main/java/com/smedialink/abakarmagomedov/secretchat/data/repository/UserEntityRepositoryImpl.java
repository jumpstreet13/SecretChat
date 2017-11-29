package com.smedialink.abakarmagomedov.secretchat.data.repository;

import com.smedialink.abakarmagomedov.secretchat.data.datasource.factory.UserModelStoreFactory;
import com.smedialink.abakarmagomedov.secretchat.data.mapper.UserEntityMapper;
import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;
import com.smedialink.abakarmagomedov.secretchat.domain.repository.UserEntityRepository;

import javax.inject.Inject;

import rx.Completable;
import rx.Single;

public class UserEntityRepositoryImpl implements UserEntityRepository {

    private final UserModelStoreFactory dataSourceFactory;
    private final UserEntityMapper mapper;

    @Inject
    public UserEntityRepositoryImpl(UserModelStoreFactory dataSourceFactory,
                                    UserEntityMapper mapper) {
        this.dataSourceFactory = dataSourceFactory;
        this.mapper = mapper;
    }


    @Override
    public Completable logIn(UserEntity user) {
        return dataSourceFactory.getDiskUserModelSource()
                .loginUser(mapper.map(user));
    }

    @Override
    public Single<UserEntity> getUser() {
        return dataSourceFactory.getDiskUserModelSource()
                .getUserModel()
                .map(mapper::map);
    }
}