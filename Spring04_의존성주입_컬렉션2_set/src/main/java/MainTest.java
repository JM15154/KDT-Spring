import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;

public class MainTest {
	public static void main (String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("user.xml");
		
		// set 형식은 중복 불가능
		UserService service = ctx.getBean("service", UserService.class);
		Set<Cat> list = service.getSet();
		System.out.println(list);
		
		
	}
}
