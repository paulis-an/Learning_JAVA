package Lession.Lession29;

public class Test3 {

    static void abc(String s){
            System.out.println("A");      //1
        }
        static void abc(String ... s){
            System.out.println("B");      //3
        }
        static void abc(Object s){
            System.out.println("C");       //2
        }
        static void abc(String s1,String s2){
            System.out.println("D");      //вызов с двумя параметрами
        }


        static void def(Long l){
            System.out.println("E");
        }
    static void def(Long ... l){
        System.out.println("F");
    }
    static void def(long l){
        System.out.println("G");
    }

    static void def(Object l){
        System.out.println("H");
    }

    static void def(Integer l){
        System.out.println("I");
    }
        public static void main(String[] args) {
            Test3 t = new Test3();
            t.abc("Ok");
            t.def(50);
        }
    }


