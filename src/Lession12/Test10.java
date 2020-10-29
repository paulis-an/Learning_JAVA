package Lession12;

public class Test10 {
    public static void main(String[] args) {
        int salary =300;
        boolean b = true;
        if (salary < 250) {
            System.out.println("ZP nizkaya");
        } else if (salary < 400 && b == true) {
            System.out.println("ZP srednyaya");
        }else if (salary < 600) {
            System.out.println("ZP norm");
        }else {
            System.out.println("ZP gud");
        }
    }
}
