package com.smedialink.abakarmagomedov.secretchat.presentation.login;


import com.hannesdorfmann.mosby3.mvp.MvpView;

/**
 * Created by abakarmagomedov on 05/08/17.
 */

interface LoginView extends MvpView {

    void showError(String error);

    void showLoading();

    void loginSuccessful();
}
