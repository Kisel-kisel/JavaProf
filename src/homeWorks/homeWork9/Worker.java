package homeWorks.homeWork9;

import homeWorks.homeWork5.IsItGoverment;
import homeWorks.homeWork5.PensionFund;

import java.util.ArrayList;
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
        System.out.println("Зато у меня " + getCountOfChild().size() + " детей!");
    }

    @Override
    public double calculatePension() {
        double bigerPrice = 0;
        for (PensionFund PensionFund : getPensionFunds()) {

            double minSalaryWithChild = getCountOfChild().size() * 200 * minSalary;
            double result = PensionFund.countOfPension(getAgeOfPerson(), minSalaryWithChild, maxSalary);
            if (result > bigerPrice) {
                bigerPrice = result;
            }
        }

return bigerPrice;
    }

//        if(state >= state1 && state >= state2){
//            return state;
//        }else if (state1 > state && state1 > state2){
//            return state1;
//        } else{
//            return state2;
//        }





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

//1) Добавить в класс Worker поле - множество (Set) из Пенсионных фондов.
//        2) Добавить для него гетер и сетер
//        3) в методе расчета пенсии взять Set из пенсионных фондов и для каждого из них посчитать возможную пенсию,
//        выбрать наиболее выгодное предложение и вернуть (return) из этого метода именно самое лучшее предложение
//        (там, где больше всего заплатят). (как это реализовать - полностью на вашей совести)
//        4) Создать в Main несколько работников и несколько сетов из пенсионных фондов. Заполнить каждому
//        работнику доступные ему пенсионный фонды (см. пункт 1)
//        5) запустить расчет пенсии

