package Lession.Lission27;

public class Dz {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Mechenosec");
        System.out.println(m.name);
        m.swim();
        m.eat();
        m.sleep();
        Speakable p = new Pingvin("Pingvin");
        p.speak();
        Animal2 a = new Lev("Lev");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lev("Lev2");
        System.out.println(mam.name);
        mam.run();
        mam.eat();
        mam.sleep();
        mam.speak();


    }
}
abstract class Animal2{
    String name;
    Animal2(String name){
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal2{

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ryby");
    }
    abstract void swim();
}
abstract class Bird extends Animal2 implements Speakable{

    public void speak(){
        System.out.println(name + "sings");
    }
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();
}
abstract class Mammal extends Animal2 implements Speakable{

    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
class Mechenosec extends Fish{

   Mechenosec(String name) {
       super(name);
       this.name = name;
   }
    public void swim(){
        System.out.println("Mechenosec krasivaya ryba, kotoraya bystro plavaet");
    }
    public void eat(){
        System.out.println("Mechenosec ne hishnaya ryba, i ona est obychniy rybiy korm");
    }
}
class Pingvin extends Bird{
   ;
    Pingvin(String name){
        super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("Pingvin lyubit est rybu");
    }
    public void sleep(){
        System.out.println("Pingviny spyat prijavshis drug k drugu");
    }
    public void fly(){
        System.out.println("Pingviny ne umeut letat");
    }
    public void speak(){
        System.out.println("Pingviny ne umeyut pet");
    }
}
class Lev extends Mammal{

    Lev(String name){
        super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("Lev lyubit myaso");
    }
    public void sleep(){
        System.out.println("Bolshuyu chast dnya Lev spit");
    }
    public void run(){
        System.out.println("Lev ne samaya bystraya koshka");
    }
}
