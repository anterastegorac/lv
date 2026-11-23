public class Imenik {

    private Student s1;
    private Student s2;
    private Student s3;
    private Student s4;


    public Imenik(Student s1, Student s2, Student s3, Student s4) {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;

        s1.ispisiPodatke();
        s2.ispisiPodatke();
        s3.ispisiPodatke();
        s4.ispisiPodatke();

    }



}