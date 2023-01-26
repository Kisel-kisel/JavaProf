package homeWorks.homeWork8;

import homeWorks.homeWork2.PensionFund;
import homeWorks.homeWork8.AbleToCalculatePension;
import homeWorks.homeWork8.Person;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Person implements AbleToCalculatePension {


    private int minSalary;
    private int maxSalary;

    private List<String> companies;



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
        System.out.println("Зато у меня " + getCountOfChild().size() + " детей!");
    }

    @Override
    public double calculatePension() {
        PensionFund pensionFund = new PensionFund("money", true, "01.01.2000");
        int minSalaryWithChild = getCountOfChild().size() * 200 * minSalary;
        double state = pensionFund.countOfPension(getAgeOfPerson(),minSalaryWithChild, maxSalary);
        return state;
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

