package com.company;

public class Square implements Operator{
    private float number;


    public Square(float number){
        this.number = number;

    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }


    public void answer(){
        System.out.println("Square of " + number + " equals " + (Math.pow(number, 2)));
    }
}
