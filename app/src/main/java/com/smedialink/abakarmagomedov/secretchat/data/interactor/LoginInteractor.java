package com.smedialink.abakarmagomedov.secretchat.data.interactor;

import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;
import com.smedialink.abakarmagomedov.secretchat.domain.repository.UserEntityRepository;
import com.smedialink.abakarmagomedov.secretchat.utils.SharedPrefManager;

import javax.inject.Inject;

import rx.Completable;
import rx.Single;

/**
 * Created by abakarmagomedov on 28/11/2017.
 */

public class LoginInteractor {

    private UserEntityRepository userRepository;

    @Inject
    public LoginInteractor(UserEntityRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Completable logInUser(UserEntity user) {
        return userRepository.logIn(user);
    }

    public Single<UserEntity> getUser() {
        return userRepository.getUser();
    }
}
