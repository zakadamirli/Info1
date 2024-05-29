package StringMassivler;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any text");
        String text=sc.nextLine();

        int u=text.length();
        System.out.println("Len: "+u);

        char chartype=text.charAt(2);
        System.out.println("2th index "+chartype);

        String substring=text.substring(1,3);
        System.out.println("Substring: "+substring);

        boolean b=text.contains("Lan");
        System.out.println("contains= "+ b);

        boolean b2=text.equals("Java Language");
        System.out.println("equals= "+b2);

        boolean b22=text.equalsIgnoreCase("JAva LANguagE");
        System.out.println("equals ignore case= "+b22);

        boolean b3=text.isEmpty();
        System.out.println("is empty= "+b3);

        boolean b4=text.startsWith("java");
        System.out.println("start with java=" +b4);

        boolean b5=text.endsWith("age");
        System.out.println("end with age= "+b5);

        String ss=text.trim();
        System.out.println("trim= "+ss);

        String lower=text.toLowerCase();
        System.out.println("Lower case= "+lower);

        String upper=text.toUpperCase();
        System.out.println("Upper case= "+upper);

        int index=text.indexOf("LAN");
        System.out.println("index= "+index);

        int lastindex=text.lastIndexOf("a"); //bir nece defe tekrarlanirsa en sonuncunu goturecek
        System.out.println("Last index of= "+lastindex);

        String replace=text.replace("Java","Hello world");
        System.out.println("Replace Java with Hello world= "+replace);
    }
}
