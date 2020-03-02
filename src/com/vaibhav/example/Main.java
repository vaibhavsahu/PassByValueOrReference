package com.vaibhav.example;

public class Main {

    public static void main(String[] args) {
	    PassByValue passByValue = new PassByValue("test");

        System.out.println("Initially: " + passByValue.getVar());
	    changeReference(passByValue);
        System.out.println("After changing reference: " + passByValue.getVar());
	    modifyReference(passByValue);
        System.out.println("After modifying reference: " + passByValue.getVar());
    }

    private static void changeReference(PassByValue pass) {
        PassByValue p1 = new PassByValue("test1");
        p1 = pass;
        System.out.println("p1: "+ p1.getVar());
        System.out.println("pass: "+ pass.getVar());
    }

    private static void modifyReference(PassByValue pass) {
        pass.setVar("test2");
    }
}
