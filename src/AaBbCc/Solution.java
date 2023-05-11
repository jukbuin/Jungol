package AaBbCc;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        
        
//        for(int i = 0; i < a.length(); i++) {
//            char c = a.charAt(i);
//            if (c >= 'A' && c <= 'Z') {
//               System.out.print((char)(c + 32));
//            } else if (c >= 'a' && c <= 'z') {
//                System.out.print((char)(c - 32));
//            }
//        }
        
        for(int i = 0; i < a.length();i++) {
        	char c = a.charAt(i);
        	char r = '\0';
        	if(Character.isUpperCase(c)) {
        		r = Character.toLowerCase(c);
        	} else {
        		r = Character.toUpperCase(c);
        	}
        	System.out.print(r);
        }
    }
}
