package homeWorks.homeWorks3;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Pensioner pensioner = new Pensioner();

        pensioner.setPension(2.5);
        pensioner.setAgeOfPerson(70);

        pensioner.die();
        worker.die();
    }
}
