package annotation_play;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/5 11:58
 * @Version
 */

@Target(value={ElementType.FIELD,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Hello {

   // String fxckvalue();
    String value();
}
