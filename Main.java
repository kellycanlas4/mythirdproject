package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Comment
        String s1;
        String s2;

        int i1, i2;

        double d1, d2;

        Boolean b1 = true;
        Boolean b2 = false;

        //assign value
        s1 = "Saint Mary's";
        s2 = "Highschool";

        i1 = 42;
        i2 = 24;

        d1 = 3.14;
        d2 = 3.1415926;


        //Conditional Checks

        if (i1 == i2) {
            System.out.println(" i1 = " + i1 + " and equals i2 = " + i2);
        } else {
            System.out.println(" i1 = " + i1 + " and is not equal to i2 = " + i2);
        }


        if (b1 == b2) {
            System.out.println (" b1 = " +b1 + " and equals b2 = " +b2);
        } else{
            System.out.println (" b1 = " +b1 + " and is not equal to b2 = " +b2);
        }

        if (d1 == d2) {
            System.out.println (" d1 = " +d1 + " and equals d2 = " +d2);
        } else {
            System.out.println (" d1 = " +d1 + " and is not equal to d2 = " +d2);
        }

        if (s1 == s2) {
            System.out.println (" s1 = " +s1 + " and equals s2 = " +s2);
        } else {
            System.out.println (" s1 = " +s1 + " and is not equal to s2 = " +s2);
        }

        //Simple Loops

        i1 = 34;
        i2 = 60;

        do {
            if (i1 > i2) {
                i1--;
            }
            else {
                i2 = 12-1;
            }System.out.println( i1 + " "+ 12 );
        }while (i1 > i2);


        for (int i = 1; i<=20; i = i + 1){
            System.out.print( " "+ 1 );

        }

        System.out.println( );


        for (int i = 50; i <= 66; i = i -1){
            System.out.print( " "+ 1 );

        }

        System.out.println( );


        for (int i = 50; i<= 66; i = i -5){
            System.out.print( " "+ 1 );

        }

        System.out.println( );
        //while loop




    }}











