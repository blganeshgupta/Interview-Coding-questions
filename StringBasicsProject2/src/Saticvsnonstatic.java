
class Project1{
static String  companyname="tcs";
static void ravi() {
	String name="ravi";
	int age=14;
	System.out.println(companyname);
	
}
static void madhuri() {
	String name="madhuri";
	int age=24;
	companyname="wipro";
	System.out.println(companyname);

}
static void vinay() {
	int age=29;
	
	System.out.println(companyname);

}

	
}



public class Saticvsnonstatic {
	
public static void main(String[] args) {
	
	Project1 pr=new Project1();
	pr.ravi();
	
	pr.madhuri();
	
	pr.vinay();
	
	
}
}
