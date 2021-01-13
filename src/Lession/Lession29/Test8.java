package Lession.Lession29;

public class Test8 {
    public static void main(String[] args) {
        Lion a = new Lion();
    }
}
class Animal{
    Animal(){
        System.out.println("Constructor of Animal");
    }
    static {
        System.out.println("Static init block in Animal");
    }
    {
        System.out.println("Init block in Animal");
    }
}

class Mammal extends Animal{
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static {
        System.out.println("Static init block in Mammal");
    }
    {
        System.out.println("Init block in Mammal");
    }
}

class Lion extends Mammal{
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static {
        System.out.println("Static init block in Lion");
    }
    {
        System.out.println("Init block in Lion");
    }
}

