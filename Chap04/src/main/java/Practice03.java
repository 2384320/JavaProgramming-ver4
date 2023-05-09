import java.util.Scanner;

class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    public Song() {
        this("title", "artist", 0000, "country");
    }
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
}
public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        s.show();
    }
}
