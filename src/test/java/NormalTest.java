import com.test.proxy.normal.User;
import com.test.proxy.normal.UserInterface;
import com.test.proxy.normal.UserProxy;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author <a href="mailto:dongyuxiang@vpgame.cn">dongyuxiang</a>
 * @date 2020/04/28 18:53
 **/

@SpringBootTest
public class NormalTest {

    @Test
    public void testStaticProxy(){
        UserInterface target = new User();
        UserProxy proxy = new UserProxy(target);

        proxy.login();
        System.out.println("***************************");
        System.out.println(proxy.queryUserInfo());
    }

    @Test
    public void testJdkProxy(){
        final User user = new User();
    }


}
