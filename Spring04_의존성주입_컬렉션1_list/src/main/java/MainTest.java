import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;

public class MainTest {
	public static void main (String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("user.xml");
		
		// list 형식은 중복 가능
		UserService service = ctx.getBean("service", UserService.class);
		List<Cat> list = service.getList();
		System.out.println(list);
		
		
	}
}
