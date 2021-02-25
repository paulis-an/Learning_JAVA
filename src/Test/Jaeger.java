package Test;

class Jaeger {
    private String name;
    private String mark;
    private double weight;
    private int speed;
    private int armor;
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }


    public Jaeger(String name, String mark, double weight, int speed, int armor) {
        this.name = name;
        this.mark = mark;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
////    public String getName() {
////        return name;
////    }
//
//    public void setMark(String mark) {
//        this.mark = mark;
//    }
////    public String getMark() {
////        return mark;
////    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
////    public double getWeight() {
////        return weight;
////    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
////    public int getSpeed() {
////        return speed;
////    }
//
//    public void setArmor(int armor) {
//        this.armor = armor;
//    }
////    public int getArmor() {
////        return armor;
////    }

    public void run() {
        System.out.println("Робот " + name + " - может бегать");
    }
    public void shoot() {
        System.out.println("Робот " + name + " - может стрелять");
    }

    public void scan () {
        System.out.println("Робот " + name + " - может сканировать");
    }

    public void jump () {
        System.out.println("Робот " + name + " - может прыгать");
    }

    public String heading() {
        return "Название робота:\tМодель:\tВес:\tСкорость:\tБроня:";
    }

    public String toString() {
        return name + "\t\t" + mark + "\t" + weight + "\t" +speed + "\t\t\t" + armor;
    }

    public void produce() {
        System.out.println("Страна производства: " + country);
    }



}
