package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[]b=new int[5];
        for (int i = 0; i < b.length; i++) {
            random.nextInt(2);
            b[i]= random.nextInt(2);
            System.out.println(b[i]);
        }
        ArrayList<Integer>integers=new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            int a= random.nextInt(2);
            integers.add(a);
        }
        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i = 0; i < b.length ; i++) {
            int a= random.nextInt(2);
            linkedList.add(a);

        }
        System.out.println("ArrayList massiv:");
        System.out.println(integers);
        Method1(integers);

        System.out.println("LinkedList massiv");
        System.out.println(linkedList);
        Method2(linkedList);



        }
        public static void Method1(ArrayList<Integer>b){
            ArrayList<Integer>integers=new ArrayList<>();
            for (int i = 0; i < b.size(); i++) {
                integers.add(b.get(i));
                Collections.sort(integers);
            }
            System.out.println(integers);
        }
        public static void Method2(LinkedList<Integer>a){
        LinkedList<Integer>integers=new LinkedList<>();
            for (int i = 0; i < a.size(); i++) {
                integers.add(a.get(i));
                Collections.sort(integers);
            }
            System.out.println(integers);
        }



    }

