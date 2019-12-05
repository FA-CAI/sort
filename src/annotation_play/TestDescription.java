package annotation_play;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/5 12:15
 * @Version
 */
/**
 * 注解使用：
 * @<注解名>(<成员名1>=<成员值1>, <成员名2>=<成员值2>, ...)
 * @author H__D
 * @date 2019-07-09 22:49:32
 *
 */
@Description(desc="I am class annotation", author="classTengfei")
public class TestDescription {

    @Description(desc = "I am method annotation", author = "methodTengfei")
    public String test() {

        return "red";
    }
}

