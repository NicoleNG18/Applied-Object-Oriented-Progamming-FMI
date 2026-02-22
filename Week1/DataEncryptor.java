package problem3;

import java.util.Scanner;

public class DataEncryptor {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int data;

        do{
            System.out.println("Enter four-digit number: ");
            data = scanner.nextInt();

            if(data < 1000 || data > 9999) {
                System.out.println("The number must be between 1000 and 9999!");
            }
        } while(data < 1000 || data > 9999);

        int newNumber = encryptData(data);

        System.out.printf("The new number is: %d", newNumber);
    }

    private static int encryptData(int data) {
        int fourthDigit = data % 10;
        int thirdDigit = (data / 10) % 10;
        int secondDigit = (data / 100) % 10;
        int  firstDigit= (data / 1000) % 10;

        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;

        return thirdDigit*1000 + fourthDigit*100 + firstDigit*10 + secondDigit;
    }
}