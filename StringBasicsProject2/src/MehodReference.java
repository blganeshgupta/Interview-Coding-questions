import java.util.Scanner;

interface CaseChanger{
	public String parameter();
}

class Converter{
	public void Accept(String s ,CaseChanger c){
		String str=c.parameter( );
		System.out.println(str);
	}
}
class StringConverter{
	public static String accept(String s) {
		if(s.length()<=3) {
			s=s.toUpperCase();
		}
		else {
			s.toLowerCase();
		}
		return s;
	}
}


public class MehodReference {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	Converter c=new Converter();
		/*
		 * CaseChanger ch=new CaseChanger() {
		 * 
		 * public String parameter(){ return StringConverter.accept(str); } };
		 */	c.Accept(str,new CaseChanger() {
			 public String parameter() {
				return StringConverter.accept(str);
				 
			 }
		 } );
	
}
}
