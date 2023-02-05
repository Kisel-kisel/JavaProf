package homeWorks.homeWork11;

import homeWorks.homeWork5.IsItGoverment;
import homeWorks.homeWork5.PensionFund;
import homeWorks.homeWork11.Company;
import homeWorks.homeWork11.AbleToCalculatePension;
import homeWorks.homeWork11.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private static final int MONEY_PER_CHILD = 200;
    private List<Company> companies;
    private int minSalary;
    private int maxSalary;

    private Set<PensionFund> pensionFunds;

    public Set<PensionFund> getPensionFunds() {
        return pensionFunds;
    }

    public void setPensionFunds(Set<PensionFund> pensionFunds) {
        this.pensionFunds = pensionFunds;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int maxSalary() {
        return maxSalary;
    }

    @Override
    public void die() {

        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public double calculatePension() {
        homeWorks.homeWork5.PensionFund pensionFund = new PensionFund("money", IsItGoverment.GOVERMENT, "01.01.2000");
        int minSalaryWithChild = 0;
        if (getCountOfChild() != null){
            minSalaryWithChild = getCountOfChild().size() * MONEY_PER_CHILD + minSalary;
        }

        double state = pensionFund.countOfPension(getAgeOfPerson(),minSalaryWithChild, maxSalary);
        return state;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public void myCompanies(){
        System.out.println("Я работал в следующих компаниях :");
        for (Company s : companies) {
            System.out.println(s);
        }
    }
}

