package Управляющие_Конструкции;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number%2 == 0){
            System.out.println("Чётное число");
        }
        else {
            System.out.println("Не чётное число");
        }
    }
}
