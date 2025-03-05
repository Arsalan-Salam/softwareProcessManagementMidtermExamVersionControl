package com.sheridan;

public class midtermExam {
    private int num1;
    private int total;

    public midtermExam(int num1, int total){
        this.num1 = num1;
        this.total = total;
    }

    public int addition(int num2){
        total = num1 + num2;
        return total;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}