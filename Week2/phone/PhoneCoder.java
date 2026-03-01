package phone;

public class PhoneCoder {

    private int key;

    PhoneCoder(int key) {
        setKey(key);
    }

    PhoneCoder() {
    }

    public double getKey() {
        return key;
    }

    public void setKey(int key) {
        if(key >=1 && key <=9) {
            this.key = key;
        } else {
            this.key = 1;
        }
    }

    public String encode(String phoneNumber) {

        int parsedPhoneNumber = Integer.parseInt(phoneNumber);

        int d1 = parsedPhoneNumber / 1000;
        int d2 = (parsedPhoneNumber / 100) % 10;
        int d3 = (parsedPhoneNumber / 10) % 10;
        int d4 = parsedPhoneNumber % 10;

        d1 = (d1 + key) % 10;
        d2 = (d2 + key) % 10;
        d3 = (d3 + key) % 10;
        d4 = (d4 + key) % 10;

        return String.format("%d%d%d%d", d3, d4, d1, d2);
    }

    public String decode(String codedPhoneNum){

        int encodedNumber = Integer.parseInt(codedPhoneNum);

        int d1 = encodedNumber / 1000;
        int d2 = (encodedNumber / 100) % 10;
        int d3 = (encodedNumber / 10) % 10;
        int d4 = encodedNumber % 10;

        int originalD1 = d3;
        int originalD2 = d4;
        int originalD3 = d1;
        int originalD4 = d2;

        originalD1 = undoTransform(originalD1);
        originalD2 = undoTransform(originalD2);
        originalD3 = undoTransform(originalD3);
        originalD4 = undoTransform(originalD4);

        return String.format("%d%d%d%d", originalD1, originalD2, originalD3, originalD4);
    }

    public String toString(){
        return "PhoneCoder: " + this.key;
    }

    private int undoTransform(int digit) {
        int result = digit - key;
        if (digit < key) {
            result += 10;
        }
        return result;
    }
}
