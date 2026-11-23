import java.util.Objects;

public class Imenik {

    private Student[] lista=new Student[0];

public Imenik(Student[] lista){
        this.lista=lista;
}
public void ispisStudenata(){
        for(int i=0;i<lista.length;i++){
            lista[i].ispisiPodatke();
        }
    }

    public Student pronadjiStudentaPoImenu(String ime){
    for(int i=0;i<this.lista.length;i++){
        if(Objects.equals(this.lista[i].getIme(),ime)){
            System.out.println("Student"+ime+"je pronaden");
        }
        }
    }

    public Student pronadjiStudentaPoJmbagu(int jmbag){
        for(int i=0;i<this.lista.length;i++){
            if(this.lista[i].getIme()==jmbag){
                System.out.println("Student"+jmbag+"je pronaden");
            }
        }
    }
}