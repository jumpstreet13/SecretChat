package com.smedialink.abakarmagomedov.secretchat.data.mapper;

import com.qiscus.sdk.data.model.QiscusAccount;
import com.smedialink.abakarmagomedov.secretchat.data.model.UserModel;

import javax.inject.Inject;

/**
 * Created by abakarmagomedov on 28/11/2017.
 */

public final class QiscusAccountMapper {

    @Inject
    public QiscusAccountMapper() {
    }

    public UserModel map(QiscusAccount from) {
        UserModel model = new UserModel();
        model.setAvatar(from.getAvatar());
        model.setRtKey(from.getRtKey());
        model.setUsername(from.getUsername());
        model.setEmail(from.getEmail());
        model.setToken(from.getToken());
        return model;
    }

}
