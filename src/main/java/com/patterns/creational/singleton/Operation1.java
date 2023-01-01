package com.patterns.creational.singleton;

public class Operation1 {

    private ConnectionDatabase conn;

    public Operation1(ConnectionDatabase conn) {
        this.conn = conn;
    }

    public void showConnectedDatabase(){
        System.out.println("ConnectionId: " + this.conn.getConnectionId());
    }
}
