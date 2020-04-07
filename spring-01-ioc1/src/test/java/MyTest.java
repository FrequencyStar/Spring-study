import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 魏铭
 * @date 2020/3/29 - 16:27
 */
public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用的是业务层，dao层不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
        //获取ApplicationContext；拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就get什么
        UserDaoMysqlImpl mysql = (UserDaoMysqlImpl) context.getBean("mysql");
        UserService service = (UserService) context.getBean("service");
        mysql.getUser();
        service.getUser();
    }
}
