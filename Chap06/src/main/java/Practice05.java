import java.util.Calendar;

public class Practice05 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        int hour = date.get(Calendar.HOUR_OF_DAY);
        int minute = date.get(Calendar.MINUTE);
        System.out.println("현재 시간은 " + hour + "시 " + minute + "분 입니다.");

        String hello = "";
        if (hour >= 18 && hour < 22) hello = "Good Evening";
        else if (hour >= 4 && hour < 12) hello = "Good Morning";
        else if (hour >= 12 && hour < 18) hello = "Good Afternoon";
        else hello = "Good Night";
        System.out.println(hello);
    }
}
