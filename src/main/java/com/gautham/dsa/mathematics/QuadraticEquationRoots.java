/*
 * Given a quadratic equation in the form ax2 + bx + c. Find its roots.
 * Note: Return the maximum root followed by the minimum root.
 * 
 */
package com.gautham.dsa.mathematics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gauth
 */
public class QuadraticEquationRoots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); //Number of test cases
        while (testCases > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            QuadraticEquationRoots quadraticEquationRoots = new QuadraticEquationRoots();
            List<Integer> roots = quadraticEquationRoots.findRoots(a, b, c);
            if (roots.size() == 1) {
                System.out.println("Imaginary");
            } else {
                for (int root : roots) {
                    System.out.print(root);
                    System.out.print("\t");
                }
            }

            testCases--;
        }
    }

    public List<Integer> findRoots(int a, int b, int c) {
        List<Integer> roots = new ArrayList<>();
        int determinant = b * b - 4 * a * c;
        if (determinant < 0) {
            roots.add(-1);
            return roots;
        }
        double root1 = Math.floor((-b + Math.sqrt(determinant)) / (2 * a));
        double root2 = Math.floor((-b - Math.sqrt(determinant)) / (2 * a));
        //Returning roots in decreasing order.
        if (root1 > root2) {
            roots.add((int) root1);
            roots.add((int) root2);
        } else {
            roots.add((int) root2);
            roots.add((int) root1);
        }
        return roots;
    }
}
