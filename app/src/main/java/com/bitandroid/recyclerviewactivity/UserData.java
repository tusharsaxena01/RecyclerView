package com.bitandroid.recyclerviewactivity;

public class UserData {

    String uuid;
    String name;
    String email;
    String mobile;
    String password;

    String image;

    public UserData() {
    }

    public UserData(String uuid, String name, String email, String mobile, String password, String image) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.image = image;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}