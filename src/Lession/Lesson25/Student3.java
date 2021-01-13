package Lession.Lesson25;

public class Student3{
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName(){
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

     public void setName(StringBuilder name){
         if(name.length()>3){
             this.name = name;
         }
     }

     public int getCourse(){
        return course;
        }

     public void setCourse(int course){
        if(course>=1 && course<5){
            this.course = course;
        }
     }
     public int getGrade(){
        return grade;
     }
     public void setGrade(int grade){
        if(grade>=1 && grade<=10){
            this.grade = grade;
        }
     }
    public void showInfo(){

        System.out.println(getName() + " " + getCourse() + " " + getGrade());
    }

    }


class TestStudent{
    public static void main(String[] args) {

        Student3 st = new Student3();
        StringBuilder sb = new StringBuilder("Pavel");
        st.setName(sb);
        st.setCourse(3);
        st.setGrade(9);
        st.showInfo();


    }
}
