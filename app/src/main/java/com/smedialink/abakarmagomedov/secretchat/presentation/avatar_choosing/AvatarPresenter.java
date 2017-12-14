package com.smedialink.abakarmagomedov.secretchat.presentation.avatar_choosing;


import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.smedialink.abakarmagomedov.secretchat.data.interactor.AvatarInteractor;

import javax.inject.Inject;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by abakarmagomedov on 14/08/17.
 */

public class AvatarPresenter extends MvpBasePresenter<AvatarView> {

    private AvatarInteractor interactor;

    @Inject
    public AvatarPresenter(AvatarInteractor interactor) {
        this.interactor = interactor;
    }

    public void setUserAvatar(String avatar) {
        interactor.setAvatar(avatar)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(() -> getView().showSucces(), throwable -> getView().showError(throwable.getMessage()));
    }

}
