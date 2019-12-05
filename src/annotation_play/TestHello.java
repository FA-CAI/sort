package annotation_play;

import java.lang.reflect.Method;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/5 12:00
 * @Version
 */
public class TestHello {

    @Hello("hello")
    public static void main(String[] args) throws NoSuchMethodException{
        Class cls= TestHello.class;
        Method method=cls.getMethod("main",String[].class);
        Hello hello=method.getAnnotation(Hello.class);
        System.out.println(hello);

    }



}
