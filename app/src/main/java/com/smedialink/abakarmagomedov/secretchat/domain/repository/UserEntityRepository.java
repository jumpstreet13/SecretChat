package com.smedialink.abakarmagomedov.secretchat.domain.repository;

import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;

import rx.Completable;
import rx.Single;

public interface UserEntityRepository {
    Completable logIn(UserEntity user);
    Single<UserEntity> getUser();
}