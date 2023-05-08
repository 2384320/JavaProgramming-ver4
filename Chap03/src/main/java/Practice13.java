public class Practice13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            int num1 = i / 10;
            int num2 = i % 10;
            if ((num1 != 0 && num1 % 3 == 0) || (num2 != 0 && num2 % 3 == 0)) {
                System.out.print(i + " 박수 짝");
                if ((num1 != 0 && num1 % 3 == 0) && (num2 != 0 && num2 % 3 == 0)) System.out.print("짝");
                System.out.println();
            }
        }
    }
}
