package Exercises;

public class VrachtAuto extends Auto {

    private int laadVermogen;

    public VrachtAuto(String merk, String kleur) {
        super(merk, kleur);
    }

    public int getLaadVermogen() {
        return laadVermogen;
    }

    public void setLaadVermogen(int laadVermogen) {
        this.laadVermogen = laadVermogen;
    }

    @Override
    public void rijden() {
        snelheid = snelheid + 5;
    }

    @Override
    public void remmen() {
        snelheid = snelheid + 5;
    }
}
