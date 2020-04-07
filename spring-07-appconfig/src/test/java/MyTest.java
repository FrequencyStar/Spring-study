import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 魏铭
 * @date 2020/4/1 - 16:36
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类的方式去做，我们就只能通过AnnotationConfig上下文获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
