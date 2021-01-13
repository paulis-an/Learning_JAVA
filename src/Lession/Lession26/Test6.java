package Lession.Lession26;

public class Test6 {
    public static void main(String[] args) {
        Mouse3 a = new Mouse3();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }

}

class Animal3{
    static String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}
class Mouse3 extends Animal3{
   static String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of mouse: " + showName());
    }
}

