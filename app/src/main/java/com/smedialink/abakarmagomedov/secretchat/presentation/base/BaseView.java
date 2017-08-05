package com.smedialink.abakarmagomedov.secretchat.presentation.base;

import com.arellomobile.mvp.MvpView;

/**
 * Created by abakarmagomedov on 05/08/17.
 */

public interface BaseView extends MvpView {
    void showError(String message);
    void showSucces(String message);
}
