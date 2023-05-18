import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(">>");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);

        while (true) {
            System.out.print("명령: ");
            String command = sc.nextLine();
            if (command.equals("그만")) break;


            String[] arr = command.split("!");
            if (arr[0].equals("")) {
                System.out.println("잘못된 명령입니다!");
                continue;
            } else if (!str.contains(arr[0])) {
                System.out.println("찾을 수 없습니다!");
                continue;
            }

            int idx = str.indexOf(arr[0]);
            sb.replace(idx, idx + arr[0].length(), arr[1]);
            System.out.println(sb);
            str = new String(sb);
        }

        System.out.println("종료합니다.");
        sc.close();
    }
}
