package com.practice.arrays;

public class ArraysCreation {

	public static void main(String[] args) {
		
	int[] a = new int[5];
	
	//int[] x = new int[]; //Compilation error : Array dimension missing
	
	System.out.println(a.getClass().getName()); // O/P : [I
	
	int[][] a1 = new int[5][5];
	System.out.println(a1.getClass().getName());// O/P : [[I
	
	long[] l = new long[4];
	System.out.println(l.getClass().getName());// O/P : [J
	
	byte[] b = new byte[3];
	System.out.println(b.getClass().getName());// O/P : [B
	
	boolean[] c = new boolean[3];
	System.out.println(c.getClass().getName());// O/P : [Z
	
	int[] z = new int[0]; // it is legal to have array size as 'zero'
	
	int[] n = new int[-5];/* we can't specify array size as negative int value. 
	                      if we specify negative int value will throw runtime exception as "NegativeArraySizeException" */
	
	//int[] al = new int[10l]; //only allowed datatypes to specify array size are byte,short,char and int, for tothers it will throw Compile error.
	
	
	}
}
