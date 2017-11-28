package com.smedialink.abakarmagomedov.secretchat.data.datasource;

import com.smedialink.abakarmagomedov.secretchat.data.model.UserModel;

import rx.Completable;
import rx.Single;

public interface UserModelStore {

    Single<UserModel> getUserModel();

    Completable loginUser(UserModel userModel);

}