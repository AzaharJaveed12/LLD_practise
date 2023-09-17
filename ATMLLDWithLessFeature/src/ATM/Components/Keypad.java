package ATM.Components;

import java.io.InputStream;
import java.util.Scanner;

public class Keypad {
    private Scanner scanner;

    public Keypad(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public String readPin() {
        System.out.println("Please enter the Pin: ");
        String pin = scanner.nextLine();
        return pin;
    }

    public double readAmount() {
        System.out.println("Please enter the amount :");
        double amount = scanner.nextDouble();
        return amount;
    }
}
