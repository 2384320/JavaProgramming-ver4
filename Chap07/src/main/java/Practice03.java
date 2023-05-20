import java.util.HashMap;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();

        System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String country = sc.next();
            if (country.equals("그만")) break;
            int people = sc.nextInt();
            nations.put(country, people);
        }

        while (true) {
            System.out.print("인구 검색 >> ");
            String search = sc.next();
            if (search.equals("그만")) break;
            if (nations.containsKey(search)) System.out.println(search + "의 인구는 " + nations.get(search));
            else System.out.println(search + " 나라는 없습니다.");
        }
        sc.close();
    }
}
