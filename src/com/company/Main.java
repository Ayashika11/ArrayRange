package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int arrayLength;
	Scanner sc = new Scanner(System.in);
	arrayLength = sc.nextInt();
	int[] array = new int[arrayLength];
	for(int index=0;index<arrayLength;index++)
    {
        array[index]=sc.nextInt();
    }
	Arrays.sort(array);
	System.out.println("The range of the array is "+ String.format("%d", array[arrayLength-1]-array[0]));
    }
}
