package ru.geekbrains.activitystate;

import java.io.Serializable;

public class Counters implements Serializable {


    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;
    private int counter5 = 0;

    public Counters() {
        this.counter1 = 0;
        this.counter2 = 0;
        this.counter3 = 0;
        this.counter4 = 0;
        this.counter5 = 0;
    }


    public int getCounter1() {
        return counter1;
    }

    public int getCounter2() {
        return counter2;
    }

    public int getCounter3() {
        return counter3;
    }

    public int getCounter4() {
        return counter4;
    }
    public int getCounter5() {
        return counter5;
    }

    public void incrementCounter1() {
        counter1++;
    }

    public void incrementCounter2() {
        counter2++;
    }

    public void incrementCounter3() {
        counter3++;
    }

    public void incrementCounter4() {
        counter4++;
    }
    public void incrementCounter5() {
        counter5+=4;
    }
}
