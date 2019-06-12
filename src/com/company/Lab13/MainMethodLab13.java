package com.company.Lab13;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public class MainMethodLab13 {
    public static void main(String[] args){

        try {
            int n=6;
            byte mass1[] = new byte[n];
            System.out.println("1 потік ");
            for (int i=0;i<n;i++){
                Random r = new Random();
                mass1[i] = (byte)(r.nextInt(40)+10);
                System.out.println(mass1[i]);
            }
            byte mass2[] = new byte[n];
            System.out.println("2 потік ");
            for (int i=0;i<n;i++){
                Random r = new Random();
                mass2[i] = (byte)(r.nextInt(40)+10);
                System.out.println(mass2[i]);
            }
            byte mass3[] = new byte[n];
            System.out.println("3 потік ");
            for (int i=0;i<n;i++){
                Random r = new Random();
                mass3[i] = (byte)(r.nextInt(40)+10);
                System.out.println(mass3[i]);
            }
            InputStream in1 = new ByteArrayInputStream(mass1);
            InputStream in2 = new ByteArrayInputStream(mass2);
            InputStream in3 = new ByteArrayInputStream(mass3);
            Vector myVector = new Vector();
            myVector.add(in1);
            myVector.add(in2);
            myVector.add(in3);
            Enumeration num = myVector.elements();
            InputStream inAll = new SequenceInputStream(num);
            int count=0;
            System.out.println("Послідовний сумарний потік");
            int x;
            while ((x=inAll.read())!=-1){
                System.out.print(x+ " ");
                count++;
            }
            System.out.println("Загальна кількість елементів " + count);
            in1.close();
            in2.close();
            in3.close();
            inAll.close();






        }catch (Exception e){
            System.out.println(e);
        }
    }
}
