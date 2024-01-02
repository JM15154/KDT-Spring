import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class MainTest {
	public static void main (String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("user.xml");
		
		// map 형식은 키 : 밸류 모두 object일 경우
		UserService service = ctx.getBean("service", UserService.class);
		Properties xxx = service.getProps();
		// HashMap 인 경우는 key 만 얻을 때 keySet() 사용
		// HashMap 인 경우는 value 얻을 때 get (key) 사용
		Set<String> keys=xxx.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key + xxx.getProperty(key));
		}
		
	}
}
