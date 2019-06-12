package com.company.Lab11;

import sun.nio.cs.UTF_32;

import java.io.*;

public class MainMethodLab11 {
    public static void main(String[] args) {

        try
        {
            Reader input =new FileReader("f1.txt");
            Reader input2 =new FileReader("f2.txt");
            Writer output=new FileWriter("f2.txt");
            Writer output2=new FileWriter("f3.txt");
            String myKey="Diakiv";
            int index=0;
            int x;
            while (input.ready( ))
        {
            x=myKey.charAt(index);
            index++;
            if(index==myKey.length( ))
                index=0;
            output.write(input.read( )*x);
        }
            input.close( );
            output.flush( );
            output.close( );


             index=0;
            while (input2.ready( ))
            {
                x=myKey.charAt(index);
                index++;
                if(index==myKey.length( ))
                    index=0;
                output2.write(input2.read( )/x);
            }
            input2.close( );
            output2.flush( );
            output2.close( );
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


//        try {
//            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("L11\\fileOne.txt"),"UTF-8"));
//            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("L11\\fileTwo.txt"),"UTF-8"));
//            BufferedWriter w2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("L11\\fileThree.txt"),"UTF-8"));
//            BufferedReader r2 = new BufferedReader(new InputStreamReader(new FileInputStream("L11\\fileTwo.txt"),"UTF-8"));
//
//            String key = "Дяків Мар'ян";
//            int k=6;
//            while (r.ready()){
//                w.write(r.read()*k);
//            }
//            r.close();
//            w.flush();
//            w.close();
//            while (r2.ready()){
//                w2.write(r2.read()/k);
//            }
//            r2.close();
//            w2.flush();
//            w2.close();
//
//
//
//
//
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//
//
//            Reader input = new FileReader("fileOne.txt");
//            Writer output = new FileWriter("fileTwo.txt");
//            String myKey = "Marian Diakiv";
//            int index = 0;
//            int x;
//            String text;
////            text=input.r;
////            System.out.println(text);
////            int zzz = input.read();
////            int temp  = zzz^;
////            System.out.println(temp);
////            System.out.println(zzz);
//            while (input.ready()) {
//                x = myKey.charAt(index);
//                index++;
//                if (index == myKey.length()) {
//                    index = 0;
////                    output.write(input.read() * x);
//                    int zzz= input.read();
//                    int temp = zzz^x;
//                    //System.out.println(temp);
//                    output.write(temp);
//
//                }
//            }
//            output.close();
//
//
//        }catch (IOException e){
//            System.out.println(e);
//        }
//
//
//        try {
//
//
//            Reader input1 = new FileReader("fileTwo.txt");
//            Writer output = new FileWriter("fileThree.txt");
//            String myKey = "Marian Diakiv";
//            int index1 = 0;
//            int x1;
//            String text1;
//
//            while (input1.ready()) {
//                x1 = myKey.charAt(index1);
//                index1++;
//                if (index1 == myKey.length()) {
//                    index1 = 0;
////                    output.write(input.read() * x);
//                    int zzz1= input1.read();
//                    int temp1 = zzz1^x1;
//                    //System.out.println(temp);
//                    output.write(temp1);
//
//                }
//            }
//            output.close();
//
//
//        }catch (IOException e){
//            System.out.println(e);
//        }


    }
}
