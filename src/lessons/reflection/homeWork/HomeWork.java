package lessons.reflection.homeWork;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE,FIELD})
public @interface HomeWork {
    String value();
}
