package spos.lab1;

public class Counter {
    int counter;

    Counter(){
        counter = 0;
    }

    void increaseCounter(){
        counter++;
    }

    int getCounter(){
        return counter;
    }

    void resetCounter(){
        counter = 0;
    }
}
