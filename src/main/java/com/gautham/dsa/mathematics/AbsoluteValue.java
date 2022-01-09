/*
 * You are given an interger I, find the absolute value of the interger I.
 */
package com.gautham.dsa.mathematics;

import java.util.Scanner;

/**
 *
 * @author gauth
 */
public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); //Number of test cases
        while (testCases > 0) {
            int integer = sc.nextInt();
            AbsoluteValue absoluteValue = new AbsoluteValue();
            System.out.println(absoluteValue.findAbsolute(integer));
            testCases--;
        }
    }

    public int findAbsolute(int integer) {
        if (integer < 0) {
            return -1 * integer;
        }
        return integer;
    }

}
