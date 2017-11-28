package com.smedialink.abakarmagomedov.secretchat.data.model;

public final class UserModel {

    private int id;
    private String email;
    private String avatar;
    private String token;
    private String username;
    private String rtKey;

    public UserModel() {
    }

    public UserModel(String username, String rtKey) {
        this.username = username;
        this.rtKey = rtKey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRtKey() {
        return rtKey;
    }

    public void setRtKey(String rtKey) {
        this.rtKey = rtKey;
    }
}