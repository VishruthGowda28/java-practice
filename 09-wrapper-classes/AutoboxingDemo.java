import java.util.ArrayList;

public class AutoboxingDemo {
    /*
     * The automatic conversion of primitive types to the object of their
     * corresponding wrapper classes is known as autoboxing. For example: conversion
     * of int to Integer, long to Long, double to Double, etc.
     */
    public static void main(String[] args) {
        char ch = 'a';

        // Autoboxing: char -> Character
        Character c = ch;
        System.out.println(c + ", " + ch);

        ArrayList<Integer> list = new ArrayList<>();
        // Autoboxing: int -> Integer
        list.add(18);
        System.out.println(list.get(0));
    }
}