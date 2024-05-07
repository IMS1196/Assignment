package org.example;

public class Program {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                str1+= Character.toUpperCase(c);
            } else {
                str1 += c;
            }
        }

        System.out.println(str1);
    }
}
