package phone;

public class PhoneCoderTest {
    static void main() {
        PhoneCoder phoneCoder = new PhoneCoder(5);

        System.out.printf("Phone coder key: %.2f%n, encode: %s%n, decode: %s%n, to string: %s%n"
                ,phoneCoder.getKey()
                ,phoneCoder.encode("1234")
                ,phoneCoder.decode("5678")
                ,phoneCoder.toString());
    }
}
