package lessons.lesson8;

import homeWorks.homeWork2.MiddleUtils;

import java.util.List;

public class PensionFund {
    private final static double COEFF = 0.02;
    private static final int MIDDLE_SALARY = 1500;
    private String freeMoney;
    private Boolean isItGoverment;
    private final String dateOfCreate;
    private List<String> currenselist;

    public void setFreeMoney(String freeMoney) {
        this.freeMoney = freeMoney;
    }

    public PensionFund(String freeMoney, Boolean isItGoverment, String dateOfCreate) {
        this.freeMoney = freeMoney;
        this.isItGoverment = isItGoverment;
        this.dateOfCreate = dateOfCreate;
    }
    public double countOfPension(int age, double minSalary, double maxSalary) {
        double count;
        if (isItGoverment) {
            count = MiddleUtils.middleOfTwo(minSalary, maxSalary) * age * COEFF;
        } else {
            count = MiddleUtils.middleOfThree(minSalary, maxSalary, MIDDLE_SALARY) * age * COEFF;
        }
        return count;
    }

    public List<String> getCurrenselist() {
        return currenselist;
    }

    public void setCurrenselist(List<String> currenselist) {
        this.currenselist = currenselist;
    }
}
