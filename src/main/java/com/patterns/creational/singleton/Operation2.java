package com.patterns.creational.singleton;

public class Operation2 {

    private ConnectionDatabase conn;

    public Operation2(ConnectionDatabase conn) {
        this.conn = conn;
    }

    public void showConnectedDatabase(){
        System.out.println("ConnectionId: " + this.conn.getConnectionId());
    }
}
