package homeWorks.homeWork5;

public class PensionFund {


    private final static double COEFF = 0.02;
    private static final int MIDDLE_SALARY = 1500;
    private String freeMoney;
    private isItGoverment isItGoverment;
    private final String dateOfCreate;

    public PensionFund(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public void setFreeMoney(String freeMoney) {
        this.freeMoney = freeMoney;
    }

//        public PensionFund(String freeMoney, Boolean isItGoverment, String dateOfCreate) {
//            this.freeMoney = freeMoney;
//            this.isItGoverment = isItGoverment;
//            this.dateOfCreate = dateOfCreate;
//        }


    public void countOfPension(int age, double minSalary, double maxSalary) {
        double count;
        switch (isItGoverment) {
            case GOVERMENT:
                count = homeWorks.homeWork5.MiddleUtils.middle(minSalary, maxSalary) * age * COEFF;
                System.out.println(count);
                break;
            case NOTGOVERMRNT:
                count = MiddleUtils.middle(minSalary, maxSalary, MIDDLE_SALARY) * age * COEFF;
                System.out.println(count);
                break;
            case SCAMMERSS:
                count = 0;
                System.out.println(count);
        }
//            if (isItGoverment) {
//                count = homeWorks.homeWork5.MiddleUtils.middle(minSalary, maxSalary) * age * COEFF;
//            } else {
//                count = MiddleUtils.middle(minSalary, maxSalary, MIDDLE_SALARY) * age * COEFF;
//            }
//            return count;
//        }
    }
}

