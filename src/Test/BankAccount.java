package Test;

import java.time.LocalDateTime;

public class BankAccount {
    String name;
    LocalDateTime opened;
    double balance;

    @Override
    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f",
                name, opened.toString(), balance);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account);
    }
}