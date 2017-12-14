package com.smedialink.abakarmagomedov.secretchat.presentation.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.qiscus.sdk.Qiscus;
import com.qiscus.sdk.data.remote.QiscusApi;
import com.qiscus.sdk.util.QiscusRxExecutor;
import com.smedialink.abakarmagomedov.secretchat.R;
import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;
import com.smedialink.abakarmagomedov.secretchat.presentation.avatar_choosing.AvatarActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class LoginActivtiy extends MvpActivity<LoginView, LoginPresenter> implements LoginView {

    @BindView(R.id.login_edit_text) EditText editText;
    @BindView(R.id.progress_bar) ProgressBar progressBar;
    @Inject LoginPresenter presenter;

    @OnClick(R.id.log_in_button)
    void onButtonClick() {
        UserEntity userEntity = new UserEntity();
        userEntity.setLogin(editText.getText().toString().trim());
        presenter.logIn(userEntity);
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

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void loginSuccessful() {
        Toast.makeText(this, "Succes", Toast.LENGTH_LONG).show();
        progressBar.setVisibility(View.GONE);
        startActivity(new Intent(this, AvatarActivity.class));
    }
}












