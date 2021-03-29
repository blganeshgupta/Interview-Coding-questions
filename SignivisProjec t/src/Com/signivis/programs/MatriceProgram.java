package Com.signivis.programs;

import java.util.Scanner;

public class MatriceProgram {
public static void main(String[] args) {
	System.out.println("Enter size of the matrix");
Scanner scan=new Scanner(System.in);
int size=scan.nextInt();
int []a[]=new int[size][size];
for(int i=0;i<size;i++) {
	System.out.println("enter row"+ (i+1)+ "  elements");
	for(int j=0;j<size;j++) {
		a[i][j]=scan.nextInt();
	}
	System.out.println();
}
for(int i=0;i<size;i++) {

	for(int j=size-1;j>=0;j--) {
		System.out.print(a[j][i]+" ");
	}
	System.out.println();
}

}
}
