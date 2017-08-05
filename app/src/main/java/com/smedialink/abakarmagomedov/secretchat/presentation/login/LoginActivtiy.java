package com.smedialink.abakarmagomedov.secretchat.presentation.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.smedialink.abakarmagomedov.secretchat.BaseActivity;
import com.smedialink.abakarmagomedov.secretchat.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivtiy extends BaseActivity implements LoginView {

    @BindView(R.id.log_in_edit_text) EditText editText;

    @OnClick(R.id.log_in_button)
    void onButtonClick(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showSucces(String message) {

    }

}
