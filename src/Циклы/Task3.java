package Циклы;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numb = sc.nextInt();
        int summ = 0;

        for(int i = 1; i <= numb; i++){
            summ = summ + i;
        }
    }
}
