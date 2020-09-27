package Lession5;

public class Team {
    TeamName t;
    Forma f;
    CvetFormy c;

    void  info() {
        System.out.println("Номер: " + t.id);
        System.out.println("Команда: " + t.name);
        System.out.println(f.homeForma + " - " + c.homeCvet);
        System.out.println(f.ghostForma + " - " + c.ghostCvet);
        System.out.println("-------------------------------------");

    }
}
class TeamMain {
    public static void main(String[] args) {
        Team r = new Team();
        r.t = new TeamName(1, "Воробьевы горы");
        r.f = new Forma("Гостевая форма: ", "Домашняя форма: ");
        r.c = new CvetFormy("Черная", "Зелено-белая");
        r.info();

        r.t = new TeamName(2, "Строгино");
        r.f = new Forma("Гостевая форма: ", "Домашняя форма: ");
        r.c = new CvetFormy("Белая", "Синяя");
        r.info();

    }
}
class TeamName{
    int id;
    String name;
       TeamName(int idTeam, String n) {
       id = idTeam;
       name = n;
    }

}
class Forma{
    String ghostForma;
    String homeForma;
    Forma(String fGhost, String fHome) {
        ghostForma = fGhost;
        homeForma = fHome;
    }
}
class CvetFormy{
    String ghostCvet;
    String homeCvet;
    CvetFormy(String cGhost, String cHome) {
        ghostCvet = cGhost;
        homeCvet = cHome;
    }
}