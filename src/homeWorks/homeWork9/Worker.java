package homeWorks.homeWork9;

import homeWorks.homeWork5.IsItGoverment;
import homeWorks.homeWork5.PensionFund;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {


    private int minSalary;
    private int maxSalary;

    private List<String> companies;
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
        double bigerPrice = 0;
        for (PensionFund PensionFund : getPensionFunds()) {
            double minSalaryWithChild = getCountOfChild().size() * 200 + minSalary;
            double result = PensionFund.countOfPension(getAgeOfPerson(), minSalaryWithChild, maxSalary);
            if (result > bigerPrice) {
                bigerPrice = result;
            }
        }

        return bigerPrice;
    }

    public List<String> getCompanies() {
        return companies;
    }

    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    public void myCompanies(){
        System.out.println("Я работал в следующих компаниях :");
        for (String s : companies) {
            System.out.println(s);
        }
    }
}


