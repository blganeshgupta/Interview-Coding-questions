import java.util.Scanner;

public class StringOvels {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String vowels = "";
		String s1 = scanner.next();
		String s3="";
				for (int i = 0; i < s1.length(); i++) {
					int num=s1.charAt(i);
								if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u' || s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'O'
					|| s1.charAt(i) == 'U' || s1.charAt(i) == 'I') {
				char a = s1.charAt(i);
				String s2 = String.valueOf(a);
				 if(!(vowels.contains(s2))) { 
					 vowels=vowels+s2; 
				 }
								  
				   }
								
								else if(num>64 && num<91||num>96 && num<123 )
						 s3=s3+s1.charAt(i);
						 
					 

		}
		
		
		  System.out.println(vowels);
		  System.out.println(s3);
		  System.out.println("..............vowels................................");

		  for(int i=0;i<vowels.length();i++) 
		  { 
			  int counter=0;
			  if(counter>0) {
				  counter=0;
			  }
			  			
			for(int j=0;j<s1.length();j++) {
			
				if(s1.charAt(j)==vowels.charAt(i)) {
					counter++;
				}
		  } 
			if(!(vowels.charAt(i)==' ')) {
			
			System.out.println(vowels.charAt(i)+"-"+counter);
			}
			}
		  System.out.println(".......................Consonents.........................................");
		  for(int i=0;i<s3.length();i++) 
		  { 
			  int counter=0;
			  if(counter>0) {
				  counter=0;
			  }
			
			for(int j=0;j<s1.length();j++) {
			
				if(s1.charAt(j)==s3.charAt(i)) {
					counter++;
				}
		  } 
			
			
			System.out.println(s3.charAt(i)+"-"+counter);
		
			}

		 }
}
