package homeWorks.homeWork11;

import java.util.Map;

public class Company {

    private String name;
    private Map<String, String> holidays;

    public Map<String, String> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, String> holidays) {
        this.holidays = holidays;
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String toString() {
        return name + " have follow holidays in 2023 year = " + holidays;
    }
}
