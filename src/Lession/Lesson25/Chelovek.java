package Lession.Lesson25;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;
    public int getVes() {
        return ves;
    }
    public void setVes(int j) {
        if (j>0)
        ves = j;
    }

}
        class Test{
            public static void main(String[] args) {
                Chelovek c = new Chelovek("male");
                c.setName("Oleg");
                c.setVozrast(39);
                c.setVes(88);

                System.out.println(c.getName() + " " + c.pol + " "+ c.getVozrast() + " " + c.getVes());
            }
        }


