public class Student {

    private String ime;
    private String prezime;
    private int jmbag;
    private int ocjena;

    private static int brojStudenata=0;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getJmbag() {
        return jmbag;
    }

    public void setJmbag(int jmbag) {
        this.jmbag = jmbag;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    public Student(String ime, String prezime, int jmbag, int ocjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbag = jmbag;
        this.ocjena = ocjena;
    }

    public void ispisiPodatke() {
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: "+prezime);
        System.out.println("Jmbag: "+jmbag);
        System.out.println("Ocjena: "+ocjena);
        System.out.print("\n");
    }

        public Student(){

        }
}