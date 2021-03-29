package Com.signivis.programs;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;



public class HashMap {
public static void main(String[] args) {
TreeMap<String, String>t=new TreeMap();
Scanner scan=new Scanner(System.in);
System.out.println("please enter number of colour pairs");
int size=scan.nextInt();
System.out.println(" please Enter key and value like key=value, stop the entering enter finish");
for(int i=0;i<size;i++) {
	String s=scan.next();
	String[] a=s.split("=");
	t.put(a[0], a[1]);
	
}



Iterator<String>itr=t.keySet().iterator();
while(itr.hasNext()) {
	String key=itr.next();
	System.out.print(key);
	System.out.print("="+t.get(key));
	System.out.println();
}
}
}
