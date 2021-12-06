package com.practice.arrays;

public class ArrayAssisted {

	public static void main(String[] args) {
		int[] a = {10,20,30};

		System.out.println("Elements in 1-D array A :");
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}

		int[][] b = {{10,20,3},{30,40,50}};

		System.out.println("Length od 2-D array B : "+ b.length);
		System.out.println("Elements in 2-D array B :");
		for(int i=0; i< b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
