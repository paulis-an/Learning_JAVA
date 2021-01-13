package Lession.Lission27;

public class Test3 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
}
abstract class Figura{
//Figura (int kolichestvoStoron){
//    this.kolichestvoStoron = kolichestvoStoron;
//}
int kolichestvoStoron = 0;
abstract void perimetr();
abstract void ploshad();
void showInfo(){
    System.out.println("Eto Figura");
}

}
class Kvadrat extends Figura{
//    Kvadrat(int kolichestvoStoron){
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }
    int kolichestvoStoron = 4;
    int storona = 10;

public void perimetr(){
    System.out.println("Perimetr kvadrata = " + 4*storona);
}
public void ploshad(){
    System.out.println("Ploshad kvadrata = "+ storona*storona);
}
}
class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 10;
    int storona2 = 20;
    public void perimetr(){
        System.out.println("Perimetr pryamougolnika = " + 2*storona1+2*storona2);
    }
    public void ploshad(){
        System.out.println("Ploshad pryamougolnika = "+ storona1*storona2);
    }
}
class Okruzhnost extends Figura{
    int kolichestvoStoron = 0;
    int radius = 2;

    public void perimetr(){
        System.out.println("Perimetr pryamougolnika = " + 2*3.14*radius);
    }
    public void ploshad(){
        System.out.println("Ploshad pryamougolnika = "+ 3.14*radius*radius);
    }
}
abstract class Chetyrechugolnik extends Figura{
    void def(){
        System.out.println("eto Chetyrechugolnik ");
    }
}