package com.BitwiseOperators;

public class bitwise {
    public static void main(String[] args){
        int a = 3;
        int b = 6;

//      OR Bitwise Operator
        System.out.println("OR Value "+ (a|b));

        //      AND Bitwise Operator
        System.out.println("AND Value "+ (a&b));

        //      XOR Bitwise Operator
        System.out.println("XOR Value "+ (a^b));

        //      NOT Bitwise Operator((2 raised power 32)-1)
        System.out.println("NOT Value "+ (~a));

        //      Left Shift Bitwise Operator
        System.out.println("Left Shift Value "+ (a<<28));


    }
}
