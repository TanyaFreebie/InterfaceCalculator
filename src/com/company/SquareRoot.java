package com.company;

public class SquareRoot implements Operator{
    private float number;


    public SquareRoot(float number){
        this.number = number;

    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }


    public void answer(){
        System.out.println("Square root of " + number + " equals " + (Math.sqrt(number)));
    }
}
