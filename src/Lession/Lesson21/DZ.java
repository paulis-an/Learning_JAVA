package Lession.Lesson21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DZ {



        public  ArrayList abc(String ... s){
            ArrayList <String> list = new ArrayList<>();
            for(String s1: s){
                if(!list.contains(s1)) {
                    list.add(s1);
                }
            }
            Collections.sort(list);
            System.out.println(list);
            return list;
        }


    public static void main(String[] args) {


        DZ d = new DZ();
        d.abc("on","ona", "ok", "poka", "privet","ok");
        System.out.println();


    }
}
