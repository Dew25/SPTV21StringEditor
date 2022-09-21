/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21stringeditor;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21StringEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----- Работа со строкой -----");
        System.out.print("Введите строку (используйте латиницу): ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        do{
            System.out.println("Функции программы:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Посчитать количество символов в строке");
            System.out.println("2. Посчитать количество слов в строке");
            System.out.println("3. Найти подстоку в строке");
            System.out.println("3. Заменить подстоку в строке на указанную");
            System.out.print("Выберите номер функции: ");
            int numFunc = scanner.nextInt();
            scanner.nextLine();
            if(numFunc == 0){
                break;
            }else if(numFunc == 1){
                System.out.println("Вы выбрали пункт "+numFunc);
                int countCharInStr=0;
                char[] chars = str.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if(chars[i] != ' '){
                        countCharInStr++;
                    }
                }
                System.out.println("В строке "+countCharInStr + " символов.");
            }else if(numFunc == 2){
                System.out.println("Вы выбрали пункт "+numFunc);
                String[] words = str.split(" ");
                System.out.println("В строке "+ words.length + " слов");
            }else if(numFunc == 3){
                System.out.println("Вы выбрали пункт "+numFunc);
                System.out.println("Введите искомую строку: ");
                String findStr = scanner.nextLine();
                int index = str.indexOf(findStr);
                if(index<0){
                    System.out.println("Такой строки в тексте нет");
                }else{
                    index++;
                    System.out.println("Искомая строка находится на "+index+ " позиции");
                }
                      
            }else if(numFunc == 4){
                System.out.println("Вы выбрали пункт "+numFunc);
                System.out.println("Введите заменяемую строку: ");
                String removeStirng = scanner.nextLine();
                String newStr;
                int index = str.indexOf(removeStirng);
                if(index < 0 ){
                    System.out.println("Такой строки в тексте нет");
                }else{
                    System.out.println("На какую строку заменить: ");
                    newStr = scanner.nextLine();
                    System.out.println("Измененная строка выглядит так: ");
                    System.out.println(str.replace(removeStirng, newStr));
                }
            }
            System.out.println("+++++++++++++++++++++++++++++");
        }while(true);
    }
    
}
