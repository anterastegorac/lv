import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("John","Pork",123,5);
        Student student2 = new Student("Adam","Tomokovic",321,5);
        Student student3 = new Student("Vid","Mlikota",8877,5);
        Student student4 = new Student("Ivica","Lukic",1122,1);


        Imenik imenik = new Imenik(student1,student2,student3,student4);



    }
}