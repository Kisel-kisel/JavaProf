package homeWorks.homeWork1;

import homeWorks.homeWork1.Person;

public class Resualt {
    public static void main(String[] args) {
        Person first = new Person("auto", 73, 187, 85);
        Person second = new Person("Vlad", 28, 185, 87);
        Person pata = new Person ();

      first.infoAboutPerson();
      second.infoAboutPerson();
      first.goToWork();
      second.goToWork();
    }
}
