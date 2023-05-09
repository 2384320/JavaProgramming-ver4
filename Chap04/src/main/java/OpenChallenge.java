import java.util.Scanner;

class Player {
    String word;
    String name;

    public void getWordFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + ">>");
        this.word = sc.next();
    }

    public boolean checkSuccess(String lastWord) {
        char lastChar = lastWord.charAt(lastWord.length()-1);
        char firstChar = this.word.charAt(0);

        if (lastChar == firstChar) return true;
        else return false;
    }
}

public class OpenChallenge {
    static Scanner sc = new Scanner(System.in);
    static void run() {
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int peopleCount = sc.nextInt();
        Player[] player = new Player[peopleCount];
        for (int i = 0; i < peopleCount; i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            String peopleName = sc.next();
            player[i] = new Player();
            player[i].name = peopleName;
        }
        System.out.println("시작하는 단어는 아버지입니다");

        String lastWord = "아버지";
        int idx = 0;

        while (true) {
            player[idx].getWordFromUser();
            if (!player[idx].checkSuccess(lastWord)) {
                System.out.println(player[idx].name + "이(가) 졌습니다.");
                break;
            }
            lastWord = player[idx].word;
            idx++;
            if (idx % peopleCount == 0) idx = 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("끝말잇기 게임을 시작합니다");
        while (true) {
            run();

            while (true) {
                System.out.print("게임을 다시 하시겠습니까(y/n)>>");
                String command = sc.next();

                if (command.equals("y")) break;
                else if (command.equals("n")) System.exit(0);
                else System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
