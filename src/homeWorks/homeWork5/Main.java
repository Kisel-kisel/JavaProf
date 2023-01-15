package homeWorks.homeWork5;


import static homeWorks.homeWork5.IsItGoverment.*;

public class Main {
    public static void main(String[] args) {
        PensionFund person = new PensionFund("GOVERMRNT",GOVERMENT,"12-06-2000");
        PensionFund person1 = new PensionFund("NOTGOVERMRNT",NOTGOVERMENT,"12-06-2000");
        PensionFund person2 = new PensionFund("SCAMMERS",SCAMMERS,"12-06-2000");

        double moneyPerson = person.countOfPension(70,3000,5000);
        double moneyPerson1 = person1.countOfPension(70,3000,5000);
        double moneyPerson2 = person2.countOfPension(70,3000,5000);


        System.out.println(moneyPerson);
        System.out.println(moneyPerson1);
        System.out.println(moneyPerson2);



    }
}
