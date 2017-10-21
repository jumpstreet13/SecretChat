package com.smedialink.abakarmagomedov.secretchat.presentation.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.EditText;


import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.smedialink.abakarmagomedov.secretchat.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class LoginActivtiy extends MvpActivity<LoginView, LoginPresenter> implements LoginView {

    @BindView(R.id.log_in_edit_text) EditText editText;
    @Inject LoginPresenter presenter;

    @OnClick(R.id.log_in_button)
    void onButtonClick() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return presenter;
    }

}
