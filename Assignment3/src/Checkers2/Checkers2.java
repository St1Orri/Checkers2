package Checkers2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Checkers2 {
	public static int[][] checkerboard={
		{0,1,0,1,0,1,0,1},
		{1,0,1,0,1,0,1,0},
		{0,1,0,1,0,1,0,1},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{2,0,2,0,2,0,2,0},
		{0,2,0,2,0,2,0,2},
		{2,0,2,0,2,0,2,0}
		};
	
	public static void main(String[] args) {
		boolean Q = true;
		int count = 1;
		String p;
		printMatrix(checkerboard);
		while(Q) {
			
			if(count%2 ==1) {
				p="Player1";
			}
			else {
				p=Player2;
			}
			System.out.println("Turn of " + p);
			int X=getOldX();
			int Y=getOldY();
			p.OldCoordinates(5,5);
			printMatrix(checkerboard);
			count+=1;
		}
	}
	
	
	public static int getOldX() {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("Enter X coordinate: ");
		int X = s.nextInt();
		s.close();
		return X;
	}
	
	public static int getOldY() {
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter Y coordinate: ");
		int Y = s.nextInt();
		s.close();
		return Y;
	}
	
	public static void printMatrix(int[][] matrix) {
		String a= "    0 1 2 3 4 5 6 7 <-- X axis";
		String b= "  +-----------------+";
		System.out.println("");
		System.out.println(a + "  ");
		System.out.println(b);
	    for (int row = 0; row < matrix.length; row++) {
	    	System.out.print(row + " |");
	        for (int col = 0; col < matrix[0].length; col++) {
	        	if(matrix[row][col]!=0) {
	            System.out.printf("%2d", matrix[row][col]);
	        	}
	            else {
	            	System.out.printf("  ");
	            }
	        }
	        System.out.print(" |");
	        System.out.println();
	    }
	    System.out.println(b);
	    System.out.println();
	}
}

