package com.smedialink.abakarmagomedov.secretchat.data.mapper;

import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;
import com.smedialink.abakarmagomedov.secretchat.data.model.UserModel;

import javax.inject.Inject;

public final class UserEntityMapper {

    @Inject
    public UserEntityMapper() {
    }

    public UserEntity map(UserModel from) {
        UserEntity entity = new UserEntity();
        entity.setLogin(from.getUsername());
        entity.setPasswrod(from.getRtKey());
        entity.setAvatarUrl(from.getAvatar());
        return entity;
    }

    public UserModel map(UserEntity from) {
        UserModel model = new UserModel();
        model.setUsername(from.getLogin());
        model.setRtKey(from.getPasswrod());
        model.setAvatar(from.getAvatarUrl());
        return model;
    }
}