import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class mainTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx =
				new GenericXmlApplicationContext("user.xml");
		
		UserService service = ctx.getBean("userService", UserService.class);
	}
}
