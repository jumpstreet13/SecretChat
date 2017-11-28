package com.smedialink.abakarmagomedov.secretchat.domain.entity;

public final class UserEntity {

    private String login;
    private String passwrod;
    private String avatarUrl;

    public UserEntity() {
    }

    public UserEntity(String login, String passwrod) {
        this.login = login;
        this.passwrod = passwrod;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}