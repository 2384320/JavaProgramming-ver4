import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}
public class Practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = sc.nextInt();
        Phone[] p = new Phone[n];

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while (true) {
            boolean check = false;
            System.out.print("검색할 이름>>");
            String search = sc.next();
            if (search.equals("그만")) break;
            for (int i = 0; i < n; i++) {
                if (search.equals(p[i].getName())) {
                    System.out.println(search + "의 번호는 " + p[i].getTel() + "입니다.");
                    check = true;
                    break;
                }
            }

            if (!check) System.out.println(search + "이(가) 없습니다.");
        }
        sc.close();
    }
}
