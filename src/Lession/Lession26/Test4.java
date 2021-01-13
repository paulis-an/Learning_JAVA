package Lession.Lession26;

public class Test4 {
    void abc(Animal a){
        System.out.println("a");}
    void abc(Mouse m){
            System.out.println("m");
        }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an = new Mouse();
        t.abc(an);
        an.getName();

    }
    }

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}