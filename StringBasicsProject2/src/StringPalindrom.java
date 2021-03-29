import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String s1=scanner.next();
		String s2="";
	boolean status=false;
		
			for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		
			
		}
			if(s2.equalsIgnoreCase(s1)) {
			status=true;
			}
		System.out.println("The given String is status:"+status);
		System.out.println(s2);

	}

}
