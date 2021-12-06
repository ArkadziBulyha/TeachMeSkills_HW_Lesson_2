package Управляющие_Конструкции;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = sc.nextInt();
        String nameMonths = "Месяц не указан";

        switch (month){
            case 12:
            case 1:
            case 2:
                nameMonths = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                nameMonths = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                nameMonths = "Лето";;
                break;
            case 9:
            case 10:
            case 11:
                nameMonths = "Осень";
                break;
            default:
                System.out.println("Введён неверный номер месяца");
        }
        System.out.println("Время года - " + nameMonths);
    }
}
