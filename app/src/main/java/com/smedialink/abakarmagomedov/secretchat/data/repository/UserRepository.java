package com.smedialink.abakarmagomedov.secretchat.data.repository;

import rx.Completable;

/**
 * Created by abakarmagomedov on 21/10/2017.
 */

public interface UserRepository {
    Completable logInUser(String login, String password);
}
