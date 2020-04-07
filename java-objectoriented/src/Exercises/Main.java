package Exercises;

public class Main {
    public static void main(String[] args) {
        Auto mijnAuto = new Auto("Tesla", "rood");
        Auto zijnAuto = new Auto("Suzuki", "grijs");

        VrachtAuto truck1 = new VrachtAuto("Volvo", "blauw");
        truck1.setLaadVermogen(1000);

        RaceAuto mijnTweedeAuto = new RaceAuto("Ferarri", "rood");
        mijnTweedeAuto.setTopSnelheid(355);

        Fiets mijnFiets = new Fiets("VanMook", "grijs");

        mijnAuto.rijden();
        mijnAuto.remmen();

        zijnAuto.rijden();
        zijnAuto.rijden();
        zijnAuto.rijden();

        System.out.println("De " + mijnAuto.getMerk() + " met de kleur " + mijnAuto.getKleur() + " rijdt met een snelheid van " + mijnAuto.snelheid + " km/h.");
        System.out.println("De " + zijnAuto.getMerk() + " met de kleur " + zijnAuto.getKleur() + " rijdt met een snelheid van " + zijnAuto.snelheid + " km/h.");
        System.out.println("De " + truck1.getMerk() + " met de kleur " + truck1.getKleur() + " heeft een laadvermogen van " + truck1.getLaadVermogen() + " en rijdt met een snelheid van " + truck1.snelheid + " km/h.");
        System.out.println("De " + mijnTweedeAuto.getMerk() + " met de kleur " + mijnTweedeAuto.getKleur() + " heeft een topsnelheid van " + mijnTweedeAuto.topSnelheid + " km/h.");
        System.out.println("De fiets heeft het merk " + mijnFiets.getMerk() + " en is " + mijnFiets.getKleur() + " van kleur.");
    }
}
