package com.javastudy.ch2;

public class VarEx1 {

    public static void main(String[] args){

        int year = 0;
        int age = 22;

        year = age + 2000;
        age = age + 1;

        System.out.println("year : " + year);
        System.out.println("age : " + age);

        /* x와 y의 값 바꾸기  */
        int x = 10;
        int y =20;

        int temp; // x값 임시 저장 할 변수

        temp = x;
        x = y;
        y = temp;

        System.out.println("x : " + x  +", y : " + y + ",  temp : " + temp);

    }

}
