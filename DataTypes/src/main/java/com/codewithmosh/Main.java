package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        int age = 24; //4 bytes
        String name = "Noel";
        name.replace("Noe", "WOO");
        System.out.println(name);


        System.out.println(
                "Data Type\t  Size\t Min. Value\t Max. Value\t");
        System.out.println("1\t  Byte\t\t" + Byte.SIZE
                + "\t" + Byte.MIN_VALUE
                + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("2\t  Short\t\t" + Short.SIZE
                + "\t" + Short.MIN_VALUE
                + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("3\t  Integer\t" + Integer.SIZE
                + "\t" + Integer.MIN_VALUE
                + "\t\t" + Integer.MAX_VALUE);
        System.out.println("4\t  Float\t\t" + Float.SIZE
                + "\t" + Float.MIN_VALUE
                + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("5\t  Long\t\t" + Long.SIZE
                + "\t" + Long.MIN_VALUE + "\t"
                + Long.MAX_VALUE);
        System.out.println("6\t  Double\t" + Double.SIZE
                + "\t" + Double.MIN_VALUE
                + "\t\t" + Short.MAX_VALUE);
        System.out.println("7\t  Character\t"
                + Character.SIZE);
    }
}
