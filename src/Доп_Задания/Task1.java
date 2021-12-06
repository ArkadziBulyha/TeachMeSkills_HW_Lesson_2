package Доп_Задания;

public class Task1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        int temp = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.print(temp + " ");
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }
}
