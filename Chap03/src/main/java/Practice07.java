public class Practice07 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random()*10 + 1);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\n평균은 " + (double)(sum)/10);
    }
}
