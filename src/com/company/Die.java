package com.company;

public class Die {
    private int NumDots;
    public void roll(){
        int NumDots=(int)(Math.random()*6)+1;
    }
    public int getNumDots(){
        return NumDots;
    }

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
}
