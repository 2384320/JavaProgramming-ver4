package Practice01;

public class PrintOneToTenThread extends Thread {

    @Override
    public void run() {
        System.out.println("스레드 실행 시작");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n스레드 종료");
    }
}
