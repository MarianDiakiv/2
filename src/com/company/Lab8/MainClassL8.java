package com.company.Lab8;

import java.util.HashMap;
import java.util.Scanner;

public class MainClassL8 {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<>();
        books.put("M Кідрук", "Бот");
        books.put("С Кінг", "Сяйво");
        books.put("Д Браун", "Янголи і демони");

        int i=1;
        String str = "1 Додати \n 2 пошук по ключу \n 3 видалити \n 0 вихід ";
        Scanner sc = new Scanner(System.in);
        Scanner scstr = new Scanner(System.in);
        while (i!=0){
            System.out.println(str);
             i = sc.nextInt();
            if (i==1){
                System.out.println("Введіть автора ");
                String avtor = scstr.nextLine();
                if (books.containsKey(avtor)){ // if key are
                    System.out.println("замінити запис 1 так 2 ні  ");
                    Scanner sci = new Scanner(System.in);
                    if (sci.nextInt()==1){
                        System.out.println(" Введіть назву книжки ");
                        String bname = scstr.nextLine();
                        books.put(avtor,bname);
                    }else {

                    }
                }else {
                    System.out.println(" Введіть назву книжки ");
                    String bname = scstr.nextLine();
                    books.put(avtor,bname);
                }
            }else if (i==2){
                System.out.println("введіть ключ");
                Scanner keysc = new Scanner(System.in);
                String key = keysc.nextLine();
                if (books.containsKey(key)){
                    System.out.println( books.get(key));
                }else {
                    System.out.println("Не знайдено");
                }
            }else if(i==3){
                System.out.println("введіть ключ");
                Scanner keysc = new Scanner(System.in);
                String key = keysc.nextLine();
                books.remove(key);
                System.out.println("видалено");
            }else {
                i=0;
            }
        }


    }
}
