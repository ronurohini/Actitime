package hashmap;

import java.util.Scanner;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is java again java again";
		 
        char c = 'a';
 
        int count = s.length() - s.replace("a", "").length();
 
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
    }
}

	


