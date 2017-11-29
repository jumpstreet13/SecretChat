package com.smedialink.abakarmagomedov.secretchat.presentation.login;


import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.smedialink.abakarmagomedov.secretchat.data.interactor.LoginInteractor;
import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;

import javax.inject.Inject;

import rx.CompletableSubscriber;
import rx.Scheduler;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by abakarmagomedov on 05/08/17.
 */

class LoginPresenter extends MvpBasePresenter<LoginView> {

    private LoginInteractor interactor;

    @Inject
    public LoginPresenter(LoginInteractor interactor) {
        this.interactor = interactor;
    }

    public void logIn(UserEntity user) {
        interactor.logInUser(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

    public void getUser() {
        interactor.getUser()
                .doOnError(new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        getView().showError(throwable.getMessage());
                    }
                })
                .subscribe(new Action1<UserEntity>() {
                    @Override
                    public void call(UserEntity userEntity) {

                    }
                });
    }

}
