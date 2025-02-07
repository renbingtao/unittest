package org.example.test.inherit;

public class Son extends Father{

    @Override
    public void doTest() {
        super.doTest();
        System.out.println("son");
    }

}
