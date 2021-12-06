package Управляющие_Конструкции;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер цвета: ");
        int numbColor = sc.nextInt();
        String color = "";

        switch (numbColor){
            case 1:{
                color = "Красный";
                break;
            }
            case 2:{
                color = "Оранжевый";
                break;
            }
            case 3:{
                color = "Жёлтый";
                break;
            }
            case 4:{
                color = "Зелёный";
                break;
            }
            case 5:{
                color = "Голубой";
                break;
            }
            case 6:{
                color = "Синий";
                break;
            }
            case 7:{
                color = "Фиолетовый";
                break;
            }
            default:{
                color = "Введён неправильный номер цвета";
            }
        }
        System.out.println("Цвет радуги: " + color);
    }
}
