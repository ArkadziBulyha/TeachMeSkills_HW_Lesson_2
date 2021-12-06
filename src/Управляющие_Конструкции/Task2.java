package Управляющие_Конструкции;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = sc.nextInt();
        String nameMonths = "Месяц не указан";

        if (month >= 1 && month <=2 || month == 12){
            nameMonths = "Зима";
        }
        else if (month >= 3 && month <= 5){
            nameMonths = "Весна";
        }
        else if (month >= 6 && month <= 8){
            nameMonths = "Лето";
        }
        else if (month >= 9 && month <= 11){
            nameMonths = "Осень";
        }
        else{
            System.out.println("Введён неверный номер месяца");
        }
        System.out.println("Время года - " + nameMonths);
    }
}
