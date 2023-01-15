package homeWorks.homeWork5;

import homeWorks.homeWork2.PensionFund;

public class Main {
    public static void main(String[] args) {
        homeWorks.homeWork2.PensionFund goverment = new homeWorks.homeWork2.PensionFund("Goverment", true, "11.11.1900");
        homeWorks.homeWork2.PensionFund notGoverment = new PensionFund("not goverment", false, "20.20.1999");

        double govermentPension = goverment.countOfPension(20,2000,4000);
        double notGovermentPension = notGoverment.countOfPension(20, 2000, 4000);

        System.out.println(govermentPension);
        System.out.println(notGovermentPension);
    }
}
