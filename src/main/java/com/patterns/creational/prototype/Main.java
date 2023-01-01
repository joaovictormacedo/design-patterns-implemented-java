package com.patterns.creational.prototype;

public class Main {

    public static void main(String[] args) {

        Employees employees = new Employees();
        employees.load();


        Employees empCopy1 = (Employees) employees.clone();
        empCopy1.get().remove("Macedo");

        System.out.println("Original List: "+ employees.get());
        System.out.println("List copied and removed element: "+empCopy1.get());

    }
}
