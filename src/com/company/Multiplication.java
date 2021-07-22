package com.company;

public class Multiplication implements Operator{
    private float firstNumber;
    private float secondNumber;

    public Multiplication(float firstNumber, float secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void answer(){
        System.out.println(secondNumber + " times " + firstNumber + " is " +(firstNumber * secondNumber));
    }
}
