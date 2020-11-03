package Lession.Lesson15;

public class DZ {

        public static void time() {
            int hour = 0;
            OUT1:
            while (hour < 6) {
                int min = 0;
                IN1:
                do {
                    if (hour > 1 && min % 4 == 0 && min != 0) {
                        break OUT1;
                    }

                    int sec = 0;
                    IN2:
                    while (sec < 60) {
                        if (sec * hour > min) {
                            break;
                        }
                        System.out.println(hour + ":" + min + ":" + sec);
                        sec++;

                    }
                        min++;
                    }while (min < 60) ;
                    hour++;
                }
        }



        public static void main(String[] args) {

            time();

        }
    }



