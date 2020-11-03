package Lession.Lession14;


public class DZ {
    public static void time() {
        OUT1:
        for (int hour = 0; hour < 6; hour++) {
            IN1:
            for (int min = 0; min <60; min++) {
                if (hour > 1 && min%4 == 0 && min!=0) {
                    break OUT1;
                }
                IN2:
                for (int sec = 0; sec <60; sec++) {

                    if (sec * hour > min) {
                        break ;
                    }
                    System.out.println(hour + ":" + min +":"+sec);
                }
            }
        }
    }

    public static void main(String[] args) {

        time();

    }
}
