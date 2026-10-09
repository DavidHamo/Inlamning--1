import java.util.ArrayList;

class LunchMeny {


    private String namn;
    private double pris;
    private String typ;
    private int kalorier;

    public LunchMeny(String namn, double pris, String typ, int kalorier) {
        this.namn = namn;
        this.pris = pris;
        this.typ = typ;
        this.kalorier = kalorier;
    }

    public String getNamn() {
        return namn;
    }

    public double getPris() {
        return pris;
    }

    public String getTyp() {
        return typ;
    }

    public int getKalorier() {
        return kalorier;
    }


}

public class Main {


    public static void main(String[] args) {


        ArrayList<LunchMeny> meny = new ArrayList<>();

        meny.add(new Matratt("Steak and fries", 250, "Kött", 1250));
        meny.add(new Matratt("Vegetarisk lasagne", 89, "Vegetarisk", 550));
        meny.add(new Matratt("Tabolie", 45, "Vegansk", 280));


        System.out.println("===== DAGENS LUNCHMENY =====");

        for (Matratt ratt : meny) {
            System.out.println("Namn: " + ratt.getNamn());
            System.out.println("Pris: " + ratt.getPris() + " kr");
            System.out.println("Typ: " + ratt.getTyp());
            System.out.println("Kalorier: " + ratt.getKalorier() + " kcal");
            System.out.println("----------------------------");
        }
    }


}

