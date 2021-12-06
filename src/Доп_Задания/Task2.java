package Доп_Задания;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float summ = sc.nextFloat();

        System.out.print("Введите количество месяцев: ");
        int months = sc.nextInt();

       for(int i = 1; i <= months; i++){
           summ = (summ * 0.07f) + summ;
       }
        System.out.print("Ваш доход за " + months + " месяцев, составит " + summ + " руб.");
    }
}
