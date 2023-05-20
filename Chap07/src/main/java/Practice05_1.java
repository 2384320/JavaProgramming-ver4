import java.util.ArrayList;
import java.util.Scanner;

public class Practice05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[4];
        ArrayList<Student> al = new ArrayList<>();

        System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String[] arr = sc.nextLine().split(", ");
            String name = arr[0];
            String department = arr[1];
            int number = Integer.parseInt(arr[2]);
            double grade = Double.parseDouble(arr[3]);
            student[i] = new Student(name, department, number, grade);
            al.add(student[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("------------------------------------");
            System.out.println("이름: " + al.get(i).getName());
            System.out.println("학과: " + al.get(i).getDepartment());
            System.out.println("학번: " + al.get(i).getNumber());
            System.out.println("학점평균: " + al.get(i).getGrade());
        }
        System.out.println("------------------------------------");

        while (true) {
            System.out.print("학생 이름 >> ");
            String search = sc.next();
            if (search.equals("그만")) break;
            for (int i = 0; i < 4; i++) {
                if (search.equals(al.get(i).getName())) {
                    System.out.println(al.get(i).getName() + ", " + al.get(i).getDepartment()
                            + ", " + al.get(i).getNumber() + ", " + al.get(i).getGrade());
                }
            }
        }
        sc.close();
    }
}
