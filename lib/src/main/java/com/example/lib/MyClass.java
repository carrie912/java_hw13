package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("�п�J�ʧO");

        String by = scanner.next();

        while (by.matches("�k")==false&&by.matches("�k")==false){

            System.out.println("�п�J�ʧO(�k&�k)");
            by = scanner.next();
        }
        if(by.matches("�k")){
            System.out.println("�п�J�~��");

            int age = scanner.nextInt();

            if(age<18){

                System.out.println("�A�٤��൲�B");

            }
            else {

                System.out.println("�A�i�H���B");

            }

        }

        if(by.matches("�k")){

            System.out.println("�п�J�~��");

            int age = scanner.nextInt();

            if(age<16){

                System.out.println("�p�٤��൲�B");
            }

            else {

                System.out.println("�p�i�H���B");

            }

        }
    }
}
