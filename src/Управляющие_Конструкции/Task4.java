package Управляющие_Конструкции;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру плиииз: ");
        int temperature = sc.nextInt();
        String temp = "";

        if (temperature > -5){
            temp = "Тепло";
        }
        else if (temperature <= -5 && temperature > -20){
            temp = "Нормально";
        }
        else {
            temp = "Холодно";
        }
        System.out.println("На планете Земля в данный момент времени: " + temp);
    }
}
