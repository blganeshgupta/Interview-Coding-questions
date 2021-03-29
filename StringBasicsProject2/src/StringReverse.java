import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scanner = new Scanner (System.in);
		String s1=scanner.nextLine();
		String []s2=s1.split(" ");
		String s3="";
		for(int i=0;i<s2.length;i++) {
			for(int j=s2[i].length()-1;j>=0;j--) {
			char ref=s2[i].charAt(j);
			s3=s3+String.valueOf(ref);
			
			}
			s3=s3+" ";
			
		}
		System.out.println(s3);
	}

}
