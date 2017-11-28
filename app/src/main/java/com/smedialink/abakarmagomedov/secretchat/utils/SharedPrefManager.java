package com.smedialink.abakarmagomedov.secretchat.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.smedialink.abakarmagomedov.secretchat.data.model.UserModel;
import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;

/**
 * Created by abakarmagomedov on 05/08/17.
 */

public class SharedPrefManager {

    private final static String USER = "user";
    private SharedPreferences sharedPreference;
    private Gson gson;

    public SharedPrefManager(Context context, Gson gson) {
        sharedPreference = PreferenceManager.getDefaultSharedPreferences(context);
        this.gson = gson;
    }


    public void writeUserToPref(UserModel user) {
        SharedPreferences.Editor editor = sharedPreference.edit();
        editor.putString(USER, gson.toJson(user));
        editor.apply();
    }

    public UserModel readUserFromPref() {
        return gson.fromJson(sharedPreference.getString(USER, "null"), UserModel.class);    // TODO: 31/07/17 Put here GSONMANAGER
    }

}
