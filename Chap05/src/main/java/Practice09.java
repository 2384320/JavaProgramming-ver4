import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);

}

class StackApp implements Stack {
    private int size;
    private int idx;
    private String[] arr;
    @Override
    public int length() {
        return idx;
    }

    @Override
    public int capacity() {
        return size;
    }

    @Override
    public String pop() {
        String str = "";
        for (int i = 0; i < capacity(); i++) {
            if (arr[i].equals("")) continue;
            str = (arr[i] + " ").concat(str);
        }
        return str;
    }

    @Override
    public boolean push(String val) {
        if (capacity() - length() == 0) return false;
        arr[idx++] = val;
        return true;
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int num = sc.nextInt();
        size = num;
        arr = new String[num];
        idx = 0;

        while (true) {
            System.out.print("문자열 입력 >> ");
            String str = sc.next();
            if (str.equals("그만")) break;
            else if (!push(str)) System.out.println("스택이 꽉 차서 푸시 불가!");
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : " + pop());
    }
}

public class Practice09 {
    public static void main(String[] args) {
        StackApp ss = new StackApp();
        ss.run();
    }
}
