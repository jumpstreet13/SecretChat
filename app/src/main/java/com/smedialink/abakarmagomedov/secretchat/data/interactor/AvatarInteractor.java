package com.smedialink.abakarmagomedov.secretchat.data.interactor;

import android.media.MediaActionSound;

import com.qiscus.sdk.Qiscus;
import com.smedialink.abakarmagomedov.secretchat.data.mapper.QiscusAccountMapper;
import com.smedialink.abakarmagomedov.secretchat.data.model.UserModel;
import com.smedialink.abakarmagomedov.secretchat.utils.SharedPrefManager;

import javax.inject.Inject;

import rx.Completable;

/**
 * Created by abakarmagomedov on 14/12/2017.
 */

public class AvatarInteractor {
    private SharedPrefManager manager;
    private QiscusAccountMapper mapper;

    @Inject
    public AvatarInteractor(SharedPrefManager manager, QiscusAccountMapper mapper) {
        this.manager = manager;
        this.mapper = mapper;
    }

    public Completable setAvatar(String avatar) {
        UserModel user = manager.readUserFromPref();
        return Qiscus.updateUserAsObservable(user.getUsername(), avatar)
                .doOnNext(qiscusAccount -> manager.writeUserToPref(mapper.map(qiscusAccount)))
                .toCompletable();
    }
}
