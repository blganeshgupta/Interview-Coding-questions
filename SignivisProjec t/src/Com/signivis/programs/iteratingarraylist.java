package Com.signivis.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iteratingarraylist {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter value of you enter number of colors");
	int size=scan.nextInt();
	System.out.println("please enter colors");
	ArrayList<String>ar=new ArrayList();
	for(int i=0;i<size;i++) {
		ar.add(scan.next());
	}
Iterator<String> iterator = ar.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
}
}
