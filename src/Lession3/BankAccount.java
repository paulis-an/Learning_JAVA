package Lession3;

public class BankAccount {
    int id;
    String name;
    double balance;

   double upBalance(double u) {
        balance += u;
        return balance;

    }

    double SnyatieSoScheta(double s) {
        balance -= s;
        return balance;
    }

}
class BaMain {



    public static void main(String[] args) {
        BankAccount myAcoount = new BankAccount();
        BankAccount YourAcoount = new BankAccount();
        BankAccount hisAcoount = new BankAccount();

        myAcoount.id = 1;
        myAcoount.name = "Paulis";
        myAcoount.balance = 125.20;
//        System.out.println(myAcoount.name);
        System.out.println("Имя: " + myAcoount.name + " ; " + "Баланс: " + myAcoount.balance + " ; " + "Поступление: " + myAcoount.upBalance(25.0) + " ; " + "Снятие: " + myAcoount.SnyatieSoScheta(36.2));

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





