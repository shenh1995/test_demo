package aop.test_demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.topic1.Chief;

public class ChiefTest {
	    @Autowired
	    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext-test.xml");

	    @Test
	    public void testChief(){
	        Chief jack = (Chief)applicationContext.getBean("jack");
	        jack.makeOneCake();
	    }
}
