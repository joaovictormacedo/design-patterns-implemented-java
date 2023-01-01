package com.patterns.creational.singleton;

import java.util.UUID;

public class ConnectionDatabase {

    private String connectionId;
    private String url;
    private String username;
    private String password;


    public ConnectionDatabase(String url, String username, String password) {
        this.connectionId = UUID.randomUUID().toString();
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static ConnectionDatabase getConnection(){
        return new ConnectionDatabase("mysql:host=test;dbname=test", "username", "password");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
}
