package com.patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {

        ConnectionDatabase conn = ConnectionDatabase.getConnection();

        //use connection 1 in operation 1
        Operation1 op1 = new Operation1(conn);
        op1.showConnectedDatabase();

        //use connection 1 in operation 2
        Operation2 op2 = new Operation2(conn);
        op2.showConnectedDatabase();


    }
}
