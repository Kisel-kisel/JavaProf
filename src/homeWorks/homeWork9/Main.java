package homeWorks.homeWork9;

import homeWorks.homeWork5.IsItGoverment;
import homeWorks.homeWork5.PensionFund;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Set<PensionFund> pensionFundSet = new HashSet<>();
        PensionFund pensionFund = new PensionFund("money", IsItGoverment.GOVERMENT, "01.01.2000");
        PensionFund pensionFund1 = new PensionFund("money1",IsItGoverment.NOTGOVERMENT, "01.02.2000" );
        PensionFund pensionFund2 = new PensionFund("money2",IsItGoverment.SCAMMERS, "01.03.2000" );
        pensionFundSet.add(pensionFund);
        pensionFundSet.add(pensionFund1);
        pensionFundSet.add(pensionFund2);
        worker.setPensionFunds(pensionFundSet);
        List<String> countOfChild1 = new ArrayList<>();
        countOfChild1.add("Pety");
        countOfChild1.add("Nasty");
        worker.setAgeOfPerson(45);
        worker.setMaxSalary(2300);
        worker.setMinSalary(1000);
        worker.setCountOfChild(countOfChild1);
        System.out.println(worker.calculatePension());

        Worker worker1 = new Worker();
        Set<PensionFund> pensionFundSetForSecond = new HashSet<>();
        PensionFund pensionFundForSecond = new PensionFund("salary", IsItGoverment.GOVERMENT, "01.01.2010");
        PensionFund pensionFundForSecond1 = new PensionFund("salary", IsItGoverment.NOTGOVERMENT, "01.01.2010");
        PensionFund pensionFundForSecond2 = new PensionFund("salary", IsItGoverment.GOVERMENT, "01.01.2010");
        PensionFund pensionFundForSecond3 = new PensionFund("salary", IsItGoverment.NOTGOVERMENT, "01.01.2010");
        pensionFundSetForSecond.add(pensionFundForSecond);
        pensionFundSetForSecond.add(pensionFundForSecond1);
        pensionFundSetForSecond.add(pensionFundForSecond2);
        pensionFundSetForSecond.add(pensionFundForSecond3);
        worker1.setPensionFunds(pensionFundSetForSecond);
        List<String> countOfChild2 = new ArrayList<>();
        countOfChild2.add("Maik");
        countOfChild2.add("Nick");
        countOfChild2.add("Jesika");
        worker1.setAgeOfPerson(60);
        worker1.setMaxSalary(5500);
        worker1.setMinSalary(2000);
        worker1.setCountOfChild(countOfChild2);
        System.out.println(worker1.calculatePension());



    }
}
