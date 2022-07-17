
import com.xx.ssm.dao.UserDao;
import com.xx.ssm.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test01 {

    @Autowired
    UserDao userDao;

    @Test
    public void f2(){
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //EmpMapper bean = context.getBean(EmpMapper.class);
        System.out.println("---------------------"+userDao+"---------------------");
        List<User> all = userDao.findAll();
        System.out.println("---------------------------------------------------");
        System.out.println(all);
    }

    @Test
    public void f3(){
        System.out.println("----------------------------------------------------");
        userDao.insertUser(new User(null,"tom",18,"AAA"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Test
    public void f4(){
        System.out.println("----------------------------------------------------");
        userDao.deleteUser(3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    @Test
    public void f5(){
        System.out.println("----------------------------------------------------");
        userDao.updateUser(new User(4,"cat",13,"BBB"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
