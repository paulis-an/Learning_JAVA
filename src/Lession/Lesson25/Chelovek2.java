package Lession.Lesson25;

public class Chelovek2
{
    final String pol;

    public Chelovek2(String pol) {
        this.pol = pol;
    }

    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s){
        name = s;

    }



}
class Test2{
    public static void main(String[] args) {
        Chelovek2 c = new Chelovek2("male");
        c.setName(new StringBuilder("Oleg"));
        c.getName().append("!!");


        System.out.println(c.getName());
    }
}


