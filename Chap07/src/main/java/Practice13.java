import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Practice13 {
    public static void main(String[] args) {
        Vector<Command> v = new Vector<>();
        HashMap<String, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("수퍼컴이 작동합니다. 프로그램을 입력해주세요. go를 입력하면 작동합니다.");

        while (true) {
            System.out.print(">> ");
            String com = sc.next();
            if (com.equals("go")) break;
            String var1 = sc.next();
            String var2 = sc.next();

            v.add(new Command(com, var1, var2));
        }

        for (int i = 0; i < v.size(); i++) {
            String command = v.get(i).getCom();
            String var1 = v.get(i).getVar1();
            String var2 = v.get(i).getVar2();

            switch (command) {
                case "mov":
                    hm.put(var1, Integer.parseInt(var2));
                    break;
                case "add":
                    if (Character.isDigit(var2.charAt(0))) hm.put(var1, hm.get(var1) + Integer.parseInt(var2));
                    else hm.put(var1, hm.get(var1) + hm.get(var2));
                    break;
                case "sub":
                    if (Character.isDigit(var2.charAt(0))) hm.put(var1, hm.get(var1) - Integer.parseInt(var2));
                    else hm.put(var1, hm.get(var1) - hm.get(var2));
                    break;
                case "jn0":
                    if (hm.get(var1) != 0) i = Integer.parseInt(var2) - 1;
                    break;
                case "prt":
                    System.out.println("[prt " + var1 + " " + var2 + "]");
                    for (String key : hm.keySet()) {
                        System.out.print(key + ": " + hm.get(key) + "\t");
                    }
                    System.out.println();
                    System.out.println("출력할 결과는 " + hm.get(var1) + ". 프로그램 실행 끝");
                    break;
            }
        }

    }
}
