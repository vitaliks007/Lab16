package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] randArr = new int[n];

        for(int i = 0; i < n; i++){
            randArr[i] = (int)(Math.random() * 100 - 49);
        }

        for(int i = 0; i < n; i++){
            Random random = new Random();
            randArr[i] = random.nextInt(100) - 50;
        }

        for(int val : randArr){
            System.out.print(val + "\t");
        }
        System.out.println();

        Arrays.sort(randArr);

        for(int val : randArr){
            System.out.print(val + "\t");
        }

    }
}
