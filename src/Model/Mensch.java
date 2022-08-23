package Model;

public class Mensch extends Saeugetier {

    //Attribute
    private String name;
    private int groesse;
    private int gewicht;
    private String beruf;

    //Konstruktor


    public Mensch(String name, int groesse, int gewicht, String beruf) {
        this.name = name;
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.beruf = beruf;
    }

    //Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }


    //Methoden
    public void arbeiten(){
        System.out.println("Der Mensch arbeitet" + " " + beruf);
    }

    @Override
    public void atmen() {
        super.atmen() ;
        System.out.println("der Mensch kann ausserdem auch durch die Nase atmen");
    }
}
