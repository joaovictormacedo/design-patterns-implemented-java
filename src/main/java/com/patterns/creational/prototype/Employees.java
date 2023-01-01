package com.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    public void load(){
        this.employees.add("Joao");
        this.employees.add("Victor");
        this.employees.add("Macedo");
    }


    public List<String> get(){
        return this.employees;
    }

    @Override
    public Object clone(){
        var temp = new ArrayList<String>(employees);
        return new Employees(temp);
    }

}
