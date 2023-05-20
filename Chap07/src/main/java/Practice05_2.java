import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Practice05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[4];
        HashMap<String, Student> hm = new HashMap<>();

        System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String[] arr = sc.nextLine().split(", ");
            String name = arr[0];
            String department = arr[1];
            int number = Integer.parseInt(arr[2]);
            double grade = Double.parseDouble(arr[3]);
            student[i] = new Student(name, department, number, grade);
            hm.put(name, student[i]);
        }

        for (String key : hm.keySet()) {
            System.out.println("------------------------------------");
            System.out.println("이름: " + hm.get(key).getName());
            System.out.println("학과: " + hm.get(key).getDepartment());
            System.out.println("학번: " + hm.get(key).getNumber());
            System.out.println("학점평균: " + hm.get(key).getGrade());
        }
        System.out.println("------------------------------------");

        while (true) {
            System.out.print("학생 이름 >> ");
            String search = sc.next();
            if (search.equals("그만")) break;
            for (String key : hm.keySet()) {
                if (search.equals(key)) {
                    System.out.println(hm.get(key).getName() + ", " + hm.get(key).getDepartment()
                            + ", " + hm.get(key).getNumber() + ", " + hm.get(key).getGrade());
                }
            }
        }
        sc.close();
    }
}
