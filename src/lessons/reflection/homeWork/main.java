package lessons.reflection.homeWork;

public class main {
    public static void main(String[] args) {
        ForAnnotaition forAnnotaition = new ForAnnotaition();
        Class klass = forAnnotaition.getClass();
        System.out.println(klass.getAnnotations());

    }
}
