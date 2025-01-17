package com.cc.java;

public class Cat {
    
    private String firstName;
    private String furColor;
    private int age;

    // // public void getInstanceVariable(){
    // //     App.output("Objektadresse:" + this);

    // }

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }
    // GETTER
    public Cat getInstanceVariable(){
        return this;

        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }
    


    
}