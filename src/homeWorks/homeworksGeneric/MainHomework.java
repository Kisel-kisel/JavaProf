package homeWorks.homeworksGeneric;

public class MainHomework {
    public static void main(String[] args) {
        DataBaseWriter<String> dataBaseWriter = new DataBaseWriter<>("Names", "Van");
        dataBaseWriter.save();
    }
}
