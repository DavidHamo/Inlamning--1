import java.time.LocalDate;

class Student{
    private String fornamn;
    private String efternamn;
    private String skola;
    private int alder;

    public Student(String forname, String lastname, String school, int age) {
        this.fornamn = forname;
        this.efternamn = lastname;
        this.skola = school;
        this.alder = age;

    }

    public String getForname(){
        return fornamn;
    }
    public String getLastname(){
        return efternamn;

    }
    public String getSchool(){
        return skola;
    }
    public int getAge(){
        return alder;
    }
    public void setForname(String forname){
        this.fornamn = forname;
    }
    public void setLastname(String lastname){
        this.efternamn = lastname;
    }
    public void setSchool(String school){
        this.skola = school;
    }
    public void setAge(int age){
        this.alder = age;
    }
  }


class Person {
    private LocalDate fodelsedatum;
    private String namn;
    private String gatuAdress;
    private String postNummer;
    private String postort;

    public Person(LocalDate fodelsedatum) {
        this.fodelsedatum = fodelsedatum;
    }

    public LocalDate getFodelsedatum() {
        return fodelsedatum;
    }

    public String getNamn() {
        return namn;
    }

    public String getGatuAdress() {
        return gatuAdress;
    }

    public String getPostNummer() {
        return postNummer;
    }

    public String getPostort() {
        return postort;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setFodelsedatum(LocalDate fodelsedatum) {
        this.fodelsedatum = fodelsedatum;
    }

    public void setGatuAdress(String gatuAdress) {
        this.gatuAdress = gatuAdress;
    }

    public void setPostNummer(String postNummer) {
        this.postNummer = postNummer;
    }

    public void setPostort(String postort) {
        this.postort = postort;
    }
}

public class StudentInfo {
    public static void main(String[] args) {

        Student student = new Student("David", "Hamo", "Nackademin", 20);


        System.out.println("Välkommen till min info om studenten David/ UPPGIFT 2");
        System.out.println("Förnamn " + student.getForname());
        System.out.println("Efternamn " + student.getLastname());
        System.out.println("Ålder " + student.getAge());
        System.out.println("Skola " + student.getSchool());

        Person jag = new Person(LocalDate.of(2006, 7, 5));
        Person kompis = new Person(LocalDate.of(2001, 5, 9));

        jag.setNamn("David");
        kompis.setNamn("Martin");

        jag.setGatuAdress("Fornbacken 29");
        jag.setPostNummer("152 56");
        jag.setPostort("Södertälje");

        kompis.setGatuAdress("Vällingbyvägen 4");
        kompis.setPostNummer("112 57");
        kompis.setPostort("Stockholm");

        System.out.println("Före Flytten!");
        skrivUtPerson(jag);
        skrivUtPerson(kompis);

        //David (jag) flyttar in till Martin
        jag.setGatuAdress(kompis.getGatuAdress());
        jag.setPostNummer(kompis.getPostNummer());
        jag.setPostort(kompis.getPostort());

        System.out.println("efter Flytten!");
        skrivUtPerson(jag);
        skrivUtPerson(kompis);
      }



    public static void skrivUtPerson(Person person){
        System.out.println("Namn: " + person.getNamn());
        System.out.println("födelsedatum: " + person.getFodelsedatum());
        System.out.println("Gatuadress: " + person.getGatuAdress());
        System.out.println("postnummer: " + person.getPostNummer());
        System.out.println("postort: " + person.getPostort());
        System.out.println();



    }
}

