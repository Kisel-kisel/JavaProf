package homeWorks.homeWork8;

import homeWorks.homeWork5.IsItGoverment;
import homeWorks.homeWork5.PensionFund;
import java.util.List;

public class Worker extends Person implements AbleToCalculatePension {
    private static final int MONEY_PER_CHILD = 200;
    private List<Company> companies;
    private int minSalary;
    private int maxSalary;





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
        System.out.print("Я работал в следующих компаниях : ");
        boolean start = true;
        for (Company s : companies) {
            if(start){
                System.out.print(s.getName());
                start = false;
            }else {
                System.out.print(", " + s.getName());
            }
        }
    }
}

