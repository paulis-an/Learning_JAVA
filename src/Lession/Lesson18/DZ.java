package Lession.Lesson18;

public class DZ {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        boolean x;
        if(s1.equals(s2)){
            return x = true;
        }
        else
            return x= false;

    }

    public static void main(String[] args) {
        StringBuilder sb3= new StringBuilder("Vsem bolshoy privet");
        StringBuilder sb4= new StringBuilder("Vsem bolshoy privet");
        DZ str = new DZ();
        System.out.println(str.ravenstvo(sb3,sb4));
//        str.ravenstvo("Vsem bolshoy privet", "Vsem privet");

    }


}
