package com.smedialink.abakarmagomedov.secretchat.data.datasource.impl;

import com.qiscus.sdk.Qiscus;
import com.smedialink.abakarmagomedov.secretchat.data.datasource.UserModelStore;
import com.smedialink.abakarmagomedov.secretchat.data.mapper.QiscusAccountMapper;
import com.smedialink.abakarmagomedov.secretchat.data.model.UserModel;
import com.smedialink.abakarmagomedov.secretchat.utils.SharedPrefManager;

import javax.inject.Inject;

import rx.Completable;
import rx.Single;

public class DiskUserModelStore implements UserModelStore {

    private SharedPrefManager manager;
    private QiscusAccountMapper mapper;

    @Inject
    public DiskUserModelStore(SharedPrefManager manager, QiscusAccountMapper mapper) {
        this.manager = manager;
        this.mapper = mapper;
    }

    @Override
    public Single<UserModel> getUserModel() {
        return Single.just(manager.readUserFromPref());
    }

    @Override
    public Completable loginUser(UserModel userModel) {
        return Qiscus.setUser(userModel.getUsername(), userModel.getRtKey())
                .withUsername(userModel.getUsername())
                .save()
                .doOnNext(qiscusAccount -> manager.writeUserToPref(mapper.map(qiscusAccount)))
                .toCompletable();
    }

}