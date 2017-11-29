package com.smedialink.abakarmagomedov.secretchat.domain.repository;

import com.qiscus.sdk.data.model.QiscusAccount;
import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;

import rx.Completable;
import rx.Observable;
import rx.Single;

public interface UserEntityRepository {
    Completable logIn(UserEntity user);

    Single<UserEntity> getUser();
}