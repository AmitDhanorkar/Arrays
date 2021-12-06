package com.practice.arrays;

public class ArraysDeclaration {

	//1-D possible ways of arrays declaration
	int[] a;
	int b[];
	int []c;
	
	//int[5] a1; //AT the time of array declaration we can't specify array size, if we it will throw compile time error
	
	//2-D possible ways of arrays declaration
	int[][] d;
	int e[][];
	int [][]f;
	int[] []g;
	int[] h[];
	int []i[];
	
	//3-D possible ways of arrays declaration
	int[][][] j;
	int k[][][];
	int [][][]l;
	int[][] []m;
	int[][] n[];
	int[] o[][];
	int[] []p[];
	int []q[][];
	int [][]r[];
	
	//valid array declaration
	int[] s,t;
	int[] u[],v;
	int[] x[],y[];
	int[] []z,a1;
	int[] []b1,c1[];
	
	//int[] []d1,[]f1; //this is invalid declaration if we are taking dimension before second variable , we will get compile time error.
	
}
