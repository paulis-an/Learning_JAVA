package Lession12;

public class Test9 {
    void abc(){
        String str;
        int a= 5;
        if (a>=11) {
            str = "Privet";
        }
        else if (a<11){
            str = "Hi";}

        else
            {str = "Poka";}
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test9 z = new Test9();
        z.abc();
        int a =30;
        int b = 20;
        int maximum = (a>b)?a:b;
        System.out.println(maximum);
    }
}
