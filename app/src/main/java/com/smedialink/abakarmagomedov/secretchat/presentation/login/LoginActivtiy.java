package com.smedialink.abakarmagomedov.secretchat.presentation.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.qiscus.sdk.Qiscus;
import com.qiscus.sdk.data.model.QiscusAccount;
import com.qiscus.sdk.data.model.QiscusChatRoom;
import com.qiscus.sdk.ui.QiscusGroupChatActivity;
import com.smedialink.abakarmagomedov.secretchat.BaseActivity;
import com.smedialink.abakarmagomedov.secretchat.R;

import java.io.IOException;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.HttpException;

public class LoginActivtiy extends BaseActivity implements LoginView {

    @BindView(R.id.log_in_edit_text) EditText editText;
    @InjectPresenter
    LoginPresenter presenter;

    @OnClick(R.id.log_in_button)
    void onButtonClick() {
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSucces(String message) {

    }

}
