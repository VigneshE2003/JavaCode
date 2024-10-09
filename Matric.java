package indexpro;

public class Matric {

	public static void main(String args[]) {
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{2,3,4},{2,4,3},{4,4,5}};
		
		int i,j;
		
		int c[][]=new int[3][3];
		for( i=0;i<3;i++) {
			for( j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
}
