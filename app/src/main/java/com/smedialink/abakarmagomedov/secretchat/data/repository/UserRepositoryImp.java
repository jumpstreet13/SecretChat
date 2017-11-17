package com.smedialink.abakarmagomedov.secretchat.data.repository;

import com.qiscus.sdk.Qiscus;

import rx.Completable;

/**
 * Created by abakarmagomedov on 17/11/2017.
 */

public class UserRepositoryImp implements UserRepository {
    @Override
    public Completable logInUser(String login, String password) {
        return Completable.fromObservable(Qiscus.setUser(login, password).save());
    }
}
