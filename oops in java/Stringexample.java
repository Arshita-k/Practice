class Stringexample{
    public static void main(String[] args)
    {
        //Strings are immutable 
        String S1="This is my string1";
        char chars[]={'M','y','H','e','l','l','o'};
        String Str1=new String(chars,2,5);
        String Str2="How are you";
        String Str3=Str1.toUpperCase();
        String Str4="HELLO";
        System.out.println("String1"+ S1);
        System.out.println(Str1 + " and " + Str2);
        System.out.println("Length of string1 using length():" + S1.length());   
        System.out.println("Character at index 6 in string1: " + S1.charAt(6)); 
        System.out.println(Str1 + " equals " + Str2 + "->" + Str1.equals(Str2));
        System.out.println(Str1 + " equalsIgnoreCase " + Str3 + "->" + Str1.equalsIgnoreCase(Str3));
        System.out.println(Str3 + " == " + Str4 + "->" + (Str3==Str4));

    }
}