import java.util.Arrays;

abstract class PairMap {
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap {
    private int idx = 0;

    public Dictionary(int size) {
        keyArray = new String[10];
        valueArray = new String[10];
    }

    @Override
    String get(String key) {
        for (int i = 0; i < idx; i++) {
            if (keyArray[i].equals(key)) return valueArray[i];
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < idx; i++) {
            if (keyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
            }
        }
        keyArray[idx] = key;
        valueArray[idx] = value;
        idx++;
    }

    @Override
    String delete(String key) {
        int ii = 0;
        for (int i = 0; i < idx; i++) {
            if (keyArray[i].equals(key)) ii = i;
        }

        keyArray[ii] = null;
        valueArray[ii] = null;
        for (int i = ii; i < idx-1; i++) {
            keyArray[i] = keyArray[i+1];
            valueArray[i] = valueArray[i+1];
        }
        idx--;
        keyArray[idx] = null;
        valueArray[idx] = null;
        return null;
    }

    @Override
    int length() {
        return idx;
    }
}

public class Practice10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
