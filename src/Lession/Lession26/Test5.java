package Lession.Lession26;

public class Test5 {
    public static void main(String[] args) {
        Animal2 a = new Mouse2();
        a.showInfo();
    }

}

class Animal2{
    String showName(){
        return "some Animal";
    }
    void showInfo(){
        System.out.println("Name of animal: " + showName());
    }
}
class Mouse2 extends Animal2{
    String showName(){
        return "Mouse";
    }
 }
