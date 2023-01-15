package homeWorks.homeWork4;

import homeWorks.homeWork2.PensionFund;

public class Worker extends Person implements AbleToCalculatePension{



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
        PensionFund pensionFund = new PensionFund("money", true, "01.01.2000");
        double state = pensionFund.countOfPension(getAgeOfPerson(),minSalary, maxSalary);
        return state;
    }
}

