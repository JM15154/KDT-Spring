import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;

public class MainTest {
	public static void main (String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("user.xml");
		
		// map 형식은 키 : 밸류 모두 object일 경우
		UserService service = ctx.getBean("service", UserService.class);
		Map<String, Cat> map = service.getMap();
		
		for (String key : map.keySet()) {
			System.out.println(key + map.get(key));
		}		
		
	}
}
