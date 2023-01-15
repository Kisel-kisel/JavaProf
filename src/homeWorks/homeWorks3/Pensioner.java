package homeWorks.homeWorks3;

public class Pensioner extends Person{
    private double pension;


    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public void die() {
        double x = (getAgeOfPerson() - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + x );
    }
}
