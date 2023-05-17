public class Person {
    private int time1, time2;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setTime1(int time1) {
        this.time1 = time1;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    public String getName() {
        return name;
    }

    public int getTime1() {
        return time1;
    }

    public int getTime2() {
        return time2;
    }

    public int getAbs() {
        if (time1 > time2) return Math.abs(60 - time1 + time2);
        else return Math.abs(time1 - time2);
    }
}
