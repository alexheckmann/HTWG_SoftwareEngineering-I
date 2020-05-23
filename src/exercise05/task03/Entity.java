package exercise05.task03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Entity {

    enum GeneratedName {CAPITAL, LOWER, NORMAL}

    GeneratedName generatedName() default GeneratedName.NORMAL;
}
