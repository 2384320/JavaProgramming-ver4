package Practice01;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("아무키나 입력 >> ");
        sc.nextLine();

        PrintOneToTenThread th = new PrintOneToTenThread();
        th.start();
    }
}
