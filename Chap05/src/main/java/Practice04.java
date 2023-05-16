import java.util.Scanner;

abstract class Converter2 {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다.");
        sc.close();
    }
}

class Km2Mile extends Converter2 {

    public Km2Mile(double ratio) {
        this.ratio = ratio;
    }
    @Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}

public class Practice04 {
    public static void main(String[] args) {
        Km2Mile k2m = new Km2Mile(1.6);
        k2m.run();
    }
}
