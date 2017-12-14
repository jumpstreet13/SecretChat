package com.smedialink.abakarmagomedov.secretchat.presentation.avatar_choosing;

import com.hannesdorfmann.mosby3.mvp.MvpView;

/**
 * Created by abakarmagomedov on 14/08/17.
 */

public interface AvatarView extends MvpView {

    void showSucces();

    void showError(String error);

}
