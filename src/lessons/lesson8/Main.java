package lessons.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("asdfg",true,"12-08-200" );
        List<String>listOfCurrencies = new ArrayList<>();
//        List<String>listOfCurrencies = List.of("one,two");
        listOfCurrencies.add("Euro");
        listOfCurrencies.add("Dollar");

        pensionFund.setCurrenselist(listOfCurrencies);

        List<String> filledList = pensionFund.getCurrenselist();
        System.out.println(filledList);

        filledList.add("qwer");
        List<String> secondFilledList = pensionFund.getCurrenselist();
        System.out.println(secondFilledList);
    }
}
