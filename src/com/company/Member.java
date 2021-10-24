package com.company;

public class Member {

    private String name;
    private int possibilities;
    private boolean isFinished;

    public Member(String name, int possibilities){
        this.name = name;
        this.possibilities = possibilities;
        isFinished = false;
    }

    public void getInfo() {
        System.out.println(name + " " + isFinished);
    }

    public int getPossibilities() {
        return possibilities;
    }


    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
