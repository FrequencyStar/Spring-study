import com.kuang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 魏铭
 * @date 2020/3/30 - 12:30
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        * Student{name='wm',
        * address=Address{address='西安'},
        * books=[红楼梦, 水浒传, 西游记, 三国演义],
        * hobbys=[听歌, 看电影],
        * card={身份证=1111111, 银行卡=2222222},
        * games=[LOL, BOB, COC],
        * info={姓名=小明, 学号=10341, 性别=男},
        * wife='null'}
         * */
    }
}
