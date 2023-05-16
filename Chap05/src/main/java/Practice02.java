class TV2 {
    private int size;
    public TV2(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}

class IPTV extends TV2 {
    private int color;
    private String ip;
    public IPTV(String ip, int size, int color) {
        super(size);
        this.color = color;
        this.ip = ip;
    }
    public void printProperty() {
        System.out.println("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + color + "컬러");
    }
}

public class Practice02 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
