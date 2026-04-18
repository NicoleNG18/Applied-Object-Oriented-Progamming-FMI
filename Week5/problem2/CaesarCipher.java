package problem2;

public class CaesarCipher {

    public static String encrypt(int key, String plaintext) {

        char[] plaintextChars = plaintext.toCharArray();
        char[] ciphertextChars = new char[plaintextChars.length];
        key = (key % 26) != 0 ? key : 3;

        for (int i = 0; i < plaintextChars.length; i++) {
            ciphertextChars[i] = (char) ('A' + (plaintextChars[i] - 'A' + key + 26) % 26);
        }
        return new String(ciphertextChars);
    }

    public static String decrypt(int key, String ciphertext) {

        char[] ciphertextChars = ciphertext.toCharArray();
        char[] plaintextChars = new char[ciphertextChars.length];

        key = (key % 26) != 0 ? key : 3;

        for (int i = 0; i < ciphertextChars.length; i++) {
            plaintextChars[i] = (char) ('A' + (ciphertextChars[i] - 'A' - key + 26) % 26);
        }
        return new String(plaintextChars);
    }

    static void main() {
        System.out.println(CaesarCipher.encrypt(-3, "TOY"));
        System.out.println(CaesarCipher.decrypt(-3,
                CaesarCipher.encrypt(-3, "TOY")));
    }
}