package Exercises;

public class Auto implements Voertuig {
    private String merk, kleur;
    protected int snelheid;

    @Override
    public String toString() {
        return "Auto{" +
                "snelheid=" + snelheid +
                '}';
    }

    public Auto(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    public String getMerk() {
        return merk;
    }

    public String getKleur() {
        return kleur;
    }

    @Override
    public void rijden() {
        snelheid = snelheid + 10;
    }

    @Override
    public void remmen() {
        snelheid = snelheid - 10;
    }
}
