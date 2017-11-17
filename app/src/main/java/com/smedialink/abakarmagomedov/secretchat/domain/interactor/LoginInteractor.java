package com.smedialink.abakarmagomedov.secretchat.domain.interactor;

import com.smedialink.abakarmagomedov.secretchat.data.repository.UserRepository;

import rx.Completable;

/**
 * Created by abakarmagomedov on 21/10/2017.
 */

public class LoginInteractor {

    private UserRepository userRepository;

    public LoginInteractor(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Completable logInUser(String login, String password) {
        return userRepository.logInUser(login, password);
    }
}
