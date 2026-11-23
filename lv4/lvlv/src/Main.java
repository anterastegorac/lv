import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Unesite broj studenata:");

        Scanner input=new Scanner(System.in);

        while(!input.hasNextInt())){
            System.out.print("unesite broj studenata:");
            input.next();
        }

        int broj_studenata=input.nextInt();
            Student[] studenti=new Student[broj_studenata];

    for(int i=0;i<broj_studenata;i++){
        studenti[i]=new Student();
        System.out.print("Unesite ime studenta: ");
        studenti[i].setIme(input.next());
        System.out.print("Unesite ime studenta: ");
        studenti[i].setOcjena(input.nextInt());
        while(!input.hasNextInt()){
            System.out.print("Unesite ocjenu studenata:");
            input.next();
        }
        studenti[i].setOcjena(input.nextInt());
    }
    Imenik imenik=new Imenik(studenti);

    imenik.ispisStudenata();

    Imenik imenik=new Imenik(studenti);
    imenik.ispisStudenata();

    System.out.print("Pretrazivanje po imenu");
    imenik.pronadjiStudentaPoImenu();
    System.out.print("Pretrazivanje po jmbag");
    imenik.pronadjiStudentaPoJmbagu();
    if(null!=nadjeniStudisha){
        System.out.print("Studenti")
    }
        }
    }