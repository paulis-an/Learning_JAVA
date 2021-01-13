package Lession.Lission27;

public class Test5 {
  Jumpable j1 = new Animal();
  Jumpable j2 = new Human();
  B2 b = new B2() {
      @Override
      public void def() {

      }

      @Override
      public void abc() {

      }

      @Override
      public void jump() {

      }
  };


}
class Human implements Jumpable{
    public void jump(){
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable{
    public void jump(){
        System.out.println("Animal jumps");
    }
}

interface Jumpable{
    void jump();
}
interface A2{
    void abc();
}
interface B2 extends A2, Jumpable{
    void def();
}
abstract class D implements B2{}