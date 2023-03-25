//package lessons.reader;
//
//import homeWorks.homeWork11.Person;
//import lessons.lesson5.Sex;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Generator {
//
//    public static void main(String[] args) throws IOException {
//        File file = new File("resources/names.txt");
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        Random random = new Random();
//
//        List<Person> people = new ArrayList<>();
//
//        String name = "";
//        while (name != null) {
//            name = bufferedReader.readLine();
////            Person person = new Person();
//            person.setNameOfPerson(name);
//            person.setAgeOfPerson(random.nextInt(0, 80));
//            if (random.nextBoolean()) {
//                person.setSex(Sex.MALE);
//            }
//            else {
//                person.setSex(Sex.FEMALE);
//            }
//            people.add(person);
//        }
//
//        System.out.println(people);
//
//    }
//
//}