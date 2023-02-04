package homeWorks.homeWork5;

public class PensionFund {


    private final static double COEFF = 0.02;
    private static final int MIDDLE_SALARY = 1500;
    private String freeMoney;
    private IsItGoverment isItGoverment;
    private final String dateOfCreate;

    public IsItGoverment getIsItGoverment() {
        return isItGoverment;
    }

    public void setIsItGoverment(IsItGoverment isItGoverment) {
        this.isItGoverment = isItGoverment;
    }

    public PensionFund(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public void setFreeMoney(String freeMoney) {
        this.freeMoney = freeMoney;
    }

    public PensionFund(String freeMoney, IsItGoverment isItGoverment, String dateOfCreate) {
        this.freeMoney = freeMoney;
        this.isItGoverment = isItGoverment;
        this.dateOfCreate = dateOfCreate;
    }


    public double countOfPension(int age, double minSalary, double maxSalary) {
        double count = 0;
        switch (isItGoverment) {
            case GOVERMENT:
                count = MiddleUtils.middle(minSalary, maxSalary) * age * COEFF;
                break;
            case NOTGOVERMENT:
                count = MiddleUtils.middle(minSalary, maxSalary, MIDDLE_SALARY) * age * COEFF;

                break;
            case SCAMMERS:
                count = 0;
        }
        return count;
    }
}




