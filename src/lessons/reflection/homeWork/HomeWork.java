package lessons.reflection.homeWork;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;

@Target(value = {ANNOTATION_TYPE,FIELD})
public @interface HomeWork {
    String value();
}
