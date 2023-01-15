package homeWorks.homeWorks3;

public class Worker extends Person {

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
    }

