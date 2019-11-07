package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入性別");

        String by = scanner.next();

        while (by.matches("男")==false&&by.matches("女")==false){

            System.out.println("請輸入性別(男&女)");
            by = scanner.next();
        }
        if(by.matches("男")){
            System.out.println("請輸入年齡");

            int age = scanner.nextInt();

            if(age<18){

                System.out.println("你還不能結婚");

            }
            else {

                System.out.println("你可以結婚");

            }

        }

        if(by.matches("女")){

            System.out.println("請輸入年齡");

            int age = scanner.nextInt();

            if(age<16){

                System.out.println("妳還不能結婚");
            }

            else {

                System.out.println("妳可以結婚");

            }

        }
    }
}
