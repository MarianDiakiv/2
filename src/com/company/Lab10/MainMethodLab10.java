package com.company.Lab10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class MainMethodLab10 {
    public static void printStack(Stack<String> temp){
        System.out.println("СТЕК");
        while (!temp.isEmpty()){
            System.out.println(temp.pop());
        }

    }
    public static void main(String[] args) {
        try
        {

            String s1="Щоб одержати ”завантажувальний модуль” потрібно здійснити\n" +
                    "інтерпретацію байт-кодів у команди конкретного процесора, для  \n"+
                    "кожної комп’ютерної архітектури (платформи), тобто для кожної операційної системи.\n";
            System.out.println("Поділ речення на слова");
            StringTokenizer st=new StringTokenizer(s1," \t\n\r;,.:-_");
            Stack<String> stack = new Stack<>();
            while (st.hasMoreTokens()){
                stack.push(st.nextToken());
//
            }
            System.out.println(stack);
//           MainMethodLab10.printStack(stack);
//            MainMethodLab10.printStack(stack);


        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}
