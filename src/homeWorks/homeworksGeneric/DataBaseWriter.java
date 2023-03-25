package homeWorks.homeworksGeneric;

public class DataBaseWriter<T> {
    private String database;
    private T value;

    public DataBaseWriter(String database, T value) {
        this.database = database;
        this.value = value;
    }

    public void save(){
        System.out.println("данные в бд записаны, тип данных = "+ value.getClass());
    }
}
