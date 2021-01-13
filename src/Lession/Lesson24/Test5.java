package Lession.Lesson24;

public class Test5 {
        int abc(){
            return 5;
    }

    int abc2(int i){
            if(i>10) {return 5;}
            else {return 10;}
    }
    public static void main(String[] args) {

        int a = new Test5().abc();
        new Test5().abc();
//        new Test5().abc2(5);
    }
}
