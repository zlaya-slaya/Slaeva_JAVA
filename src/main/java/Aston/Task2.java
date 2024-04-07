package Aston;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line1 = scanner.nextLine();

            if (line1.equals("Q")){
                break;
            }
            String line2 = scanner.nextLine();
            boolean isEqual = line1.equals(line2);
            if (!isEqual) {
                System.out.println("Строки не идентичны");
            } else {
                System.out.println("Строки идентичны");
            }   System.out.println("Для выхода из программы нажмите 'Q'");
            continue;
        }
    }
}
