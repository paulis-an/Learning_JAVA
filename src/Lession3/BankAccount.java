package Lession3;

public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount myAcoount = new BankAccount();
        BankAccount YourAcoount = new BankAccount();
        BankAccount hisAcoount = new BankAccount();

        myAcoount.id = 1;
        myAcoount.name = "Paulis";
        myAcoount.balance = 125.20;
        System.out.println(myAcoount.name);

        YourAcoount.id = 2;
        YourAcoount.name = "Hren s gory";
        YourAcoount.balance = .30;
        System.out.println(YourAcoount.name);

        hisAcoount.id = 3;
        hisAcoount.name = "Valdemar";
        hisAcoount.balance = 1350.00;
        System.out.println(hisAcoount.balance);







    }
}
