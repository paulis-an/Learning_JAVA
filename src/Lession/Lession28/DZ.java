package Lession.Lession28;

public class DZ {
    public static void main(String[] args) {
        Animal2 a1 = new Lev("An1");
        Animal2 a2 = new Lev("An2");
        Animal2 a3 = new Lev("An3");
        Fish f = new Mechenosec("Fish");
        Bird b = new Pingvin("Bird1");
        Mechenosec m = new Mechenosec("Mechenosec");
        Mammal mam = new Lev("Lev2");
        Lev l=new Lev("Leva");
        Pingvin pin = new Pingvin("Pig");
        Speakable p1 = new Pingvin("Pingvin");
        Speakable p2 = new Lev("Pingvin2");

        Animal2 [] anim = {a1,a2,a3,f,b,m,mam,l,pin,};
        for(Animal2 an: anim) {
            if (an instanceof Mechenosec) {
                Mechenosec m10 = (Mechenosec) an;
                System.out.println(m10.name);
                m10.eat();
                m10.sleep();
                m10.swim();

            }
        }
        for(Animal2 an: anim) {
            if (an instanceof Lev) {
                Lev l10 = (Lev)an;
                System.out.println(l10.name);
                l10.eat();
                l10.sleep();
                l10.run();
                l10.speak();
                            }
        }
        for(Animal2 an: anim) {
            if (an instanceof Pingvin) {

                Pingvin p10 = (Pingvin) an;
                System.out.println(p10.name);
                p10.eat();
                p10.sleep();
                p10.speak();
                p10.fly();

            }
        }
        Speakable [] speak = {b,mam,l,pin,p2,p1};
        for(Speakable sp: speak) {
            if (sp instanceof Mechenosec) {
                Mechenosec m10 = (Mechenosec) sp;
                System.out.println(m10.name);
                m10.eat();
                m10.sleep();
                m10.swim();

            }
        }
        System.out.println("_________________________________");
        for(Speakable sp: speak) {
            if (sp instanceof Lev) {
                Lev l10 = (Lev)sp;
                System.out.println(l10.name);
                l10.eat();
                l10.sleep();
                l10.run();
                l10.speak();
            }
        }
        System.out.println("_________________________________");
        for(Speakable sp: speak) {
            if (sp instanceof Pingvin) {

                Pingvin p10 = (Pingvin) sp;
                System.out.println(p10.name);
                p10.eat();
                p10.sleep();
                p10.speak();
                p10.fly();
            }
        }
        System.out.println("_________________________________");
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
abstract class Fish extends Animal2 {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ryby");
    }
    abstract void swim();
}
abstract class Bird extends Animal2 implements Speakable {

    public void speak(){
        System.out.println(name + "sings");
    }
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();
}
abstract class Mammal extends Animal2 implements Speakable {

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
class Mechenosec extends Fish {

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
class Pingvin extends Bird {
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
class Lev extends Mammal {

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

