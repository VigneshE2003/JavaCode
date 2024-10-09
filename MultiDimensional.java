package indexpro;

import java.util.Scanner;

public class MultiDimensional {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int a[][]=new int [100][100];
		int row,col,i,j;
		System.out.println("Enter Number of Row");
		row=scan.nextInt();
		
		System.out.println("Enter Number of Column");
		col=scan.nextInt();
		//i-row,j-column
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.printf("Enter the array element a[%d][%d]",i,j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Display 2D Array Elements is:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.printf(a[i][j]+" ");
	}
			
			
}
	}
}
