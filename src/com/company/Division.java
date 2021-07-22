package com.company;

public class Division implements Operator{
    private float firstNumber;
    private float secondNumber;

    public Division(float firstNumber, float secondNumber){
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
        System.out.println(firstNumber + "divided by " + secondNumber + " equals " + (firstNumber / secondNumber));
    }
}
