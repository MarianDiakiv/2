package com.company.Lab12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Random;

public class MainMethodLab12 {
    public static void main(String[] args) throws IOException {
        try {


            byte mass[] = new byte[6];
            int arr[] = new int[6];
            Random r = new Random();
            int pos = 0;
            PipedOutputStream p1 = new PipedOutputStream();
            PipedInputStream p2 = new PipedInputStream(p1);
            System.out.println("Вихідний потік");
            for (int i = 0; i < 6; i++) {
                mass[i] = (byte) (r.nextInt(40) + 10);
                //arr[i] =  (r.nextInt(40) + 10);
            }
            for (int i = 0; i < 6; i++) {
                System.out.println(i + " " + mass[i]);
                p1.write(mass[i]);
                //System.out.println(i + " " + arr[i]);
                //p1.write(arr[i]);
            }
            System.out.println("Вихідний потік");
            while (p2.available() > 0) {
                System.out.println(p2.read() + " ");

            }
            p1.close();
            p2.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
