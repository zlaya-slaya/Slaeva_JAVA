package Aston;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                String input = scanner.next();
                if (input.equals("exit")){
                    break;
                }
                int a = Integer.parseInt(input);
                int b = scanner.nextInt();

                //сравнение a и b
                if (a < b) {
                    System.out.println(a + " < " + b);
                } else if (a > b) {
                    System.out.println(a + " > " + b);
                } else {
                    System.out.println(a + " = " + b);
                }

                //операция над числами
                System.out.println(a + "+" + b + "=" + (a + b));
                System.out.println(a + "-" + b + "=" + (a - b));
                System.out.println(a + "*" + b + "=" + (a * b));
                if (b != 0) {
                    System.out.println(a + "/" + b + "=" + ((double) a / b));
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                System.out.println("Для выхода из программы нажмите 'exit'");

            } catch (Exception e) {
                System.out.println("Неверный формат данных. Введите целое цисло");
                scanner.nextLine();
                continue;
            }
        }
    }
}