package org.example;

public class toUpper {
    public static void main(String[] args) {

        System.out.println(convertingToUppercase("raji56&5$#"));
        System.out.println(testCase1());
        System.out.println(testCase2());
        System.out.println(testCase3());
        System.out.println(testCase4());
        System.out.println(testCase5());
//        System.out.println(testCase6());
        System.out.println(testCase7());
        System.out.println(testCase8());
    }

    public static String convertingToUppercase(String var) {
        String result = "";
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) >= 97 && var.charAt(i) <= 122) {
                result += (char) (var.charAt(i) - 32);


            } else {
                result += var.charAt(i);
            }

        }
        return result;
    }


    public static boolean testCase1() {
        String expected = "R";
        String input = "r";
        String result = convertingToUppercase(input);
        if (result.equals(expected))
            return true;
         else
            return false;


    }
    public static boolean testCase2(){
        String expected="HELLO";
        String input="HELLO";
        String result=convertingToUppercase(input);
        if(result.equals(expected))

            return true;

        else
            return false;

    }
    public static boolean testCase3()
    {
        String expected=" ";
        String input=" ";
        String result=convertingToUppercase(input);
        if(result.equals(expected))

            return true;

        else
            return false;

    }
    public static boolean testCase4()
    {
        String expected="$356%$@";
        String input="$356%$@";
        String result=convertingToUppercase(input);
        if(result.equals(expected))
        return true;
        else
            return false;
    }
    public static boolean testCase5()
    {
        String expected="167";
        String input="167";
        String result=convertingToUppercase(input);
        if(result.equals(expected))
            return true;
        else
            return false;
    }
//    public static boolean testCase6()
//    {
//        String expected=null;
//        String input=null;
//        String result=convertingToUppercase(input);
//        if(result.equals(expected))
//            return true;
//        else
//            return false;
//    }
    public static boolean testCase7()
    {
        String expected="H E L L O";
        String input="H E L L O";
        String result=convertingToUppercase(input);
        if(result.equals(expected))
            return true;
        else
            return false;

    }
    public static boolean testCase8()
    {
        String expected="wedrftg";
        String input="wedrftg";
        String result=convertingToUppercase(input);
        if(result.equals(expected))
            return  true;
        else
            return false;
    }


   }