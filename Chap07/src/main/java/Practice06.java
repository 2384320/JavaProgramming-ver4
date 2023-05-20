import java.util.HashMap;
import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Location[] location = new Location[4];
        HashMap<String, Location> hm = new HashMap<>();
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String[] arr = sc.nextLine().split(", ");
            String city = arr[0];
            int lat = Integer.parseInt(arr[1]);
            int lng = Integer.parseInt(arr[2]);
            location[i] = new Location(city, lat, lng);
            hm.put(city, location[i]);
        }

        System.out.println("------------------------");
        for (String key : hm.keySet()) {
            System.out.println(hm.get(key).getCity() + "\t" + hm.get(key).getLat() + "\t" + hm.get(key).getLng());
        }

        System.out.println("------------------------");
        while (true) {
            System.out.print("도시 이름 >> ");
            String search = sc.next();
            if (search.equals("그만")) break;
            if (!hm.containsKey(search)) {
                System.out.println(search + "는 없습니다.");
                continue;
            }
            for (String key : hm.keySet()) {
                if (search.equals(key)) {
                    System.out.println(hm.get(key).getCity() + "\t" + hm.get(key).getLat() + "\t" + hm.get(key).getLng());
                }
            }
        }
        sc.close();
    }
}
