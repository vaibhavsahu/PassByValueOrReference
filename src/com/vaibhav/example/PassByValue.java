package com.vaibhav.example;


public class PassByValue {
    private String var;

    public PassByValue(String s){
        this.var = s;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
}
