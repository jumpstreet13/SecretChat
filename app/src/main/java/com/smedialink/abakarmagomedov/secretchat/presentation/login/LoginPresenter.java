package com.smedialink.abakarmagomedov.secretchat.presentation.login;


import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.smedialink.abakarmagomedov.secretchat.domain.interactor.LoginInteractor;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by abakarmagomedov on 05/08/17.
 */

class LoginPresenter extends MvpBasePresenter<LoginView> {

    private LoginInteractor loginInteractor;

    @Inject
    public LoginPresenter(LoginInteractor loginInteractor) {
        this.loginInteractor = loginInteractor;
    }

    public void logIn(String login, String password) {
    }

}
