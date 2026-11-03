package oopss;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Luck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Character,Integer> m=new HashMap<>();
     System.out.println(m);
     Scanner sc=new Scanner(System.in);
    System.out.println("eter thr values");
    String str=sc.nextLine();
    char[] c=str.toCharArray();
    for(char ch:c) {
    	if(m.containsKey(ch)) {
    		m.put(ch, m.get(ch)+1);
    	}else {
    		m.put(ch, 1);
    	}
    }
    System.out.println(m);
	}

}
