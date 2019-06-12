package com.company.Lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClassl9 {
    public static void main(String[] args) {
        ArrayList<String> books  = new ArrayList<>();
        books.add("Кірук");
        books.add("Бот");
        books.add("Браун");
        books.add("янголи і демони");
        books.add("Кінг");
        books.add("Сяйво");
        for (int i=0;i<books.size();i=i+2){
            System.out.println(i+ " Автор "+ books.get(i)+" Книга "+ books.get(i+1));
        }
        int num=1;
        String str = "1 Додати \n 2 пошук по ключу \n 3 видалити \n 4 вивести \n 0 вихід ";

        Scanner sc = new Scanner(System.in);
        while (num!=0){
            System.out.println(str);
            num = sc.nextInt();
            if (num==1){
                System.out.println("введіть автора " );
                Scanner scstr = new Scanner(System.in);
                String name = scstr.nextLine();
                System.out.println("введіть книгу ");
                String book = scstr.nextLine();
                books.add(name);
                books.add(book);

            }else if (num==2){
                System.out.println("Введіть автора");
                Scanner sca= new Scanner(System.in);
                String av = sca.nextLine();
                int temp=0;
                for (int i=0;i<books.size();i=i+2){
                    if (av.equals(books.get(i))) {
                        System.out.println(i + " Автор " + books.get(i) + " Книга " + books.get(i + 1));
                        temp++;
                    }
                    else if (temp==0){
                        System.out.println("Не знайдено");
                    }
                }
            }else if (num==3){
                System.out.println("Введіть автора");
                Scanner sca= new Scanner(System.in);
                String av = sca.nextLine();
                for (int i=0;i<books.size();i=i+2){
                    if (av.equals(books.get(i))){
                        books.remove(i);
                        books.remove(i);
                    }
                    System.out.println("видалено");
                }
            }else if (num==4){
                for (int i=0;i<books.size();i=i+2){
                    System.out.println(i+ " Автор "+ books.get(i)+" Книга "+ books.get(i+1));
                }
            }else {
                num=0;
            }

        }


    }
}
