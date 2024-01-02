import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptServiceImpl;

public class mainTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("com/config/user.xml");
		
		// 빈 얻기
		DeptServiceImpl service = ctx.getBean("xxx", DeptServiceImpl.class);
		String mesg = service.getMesg();
		System.out.println("첫번째bean:" + mesg);
		
		DeptServiceImpl service2 = ctx.getBean("xxx", DeptServiceImpl.class);
		String mesg2 = service2.getMesg();
		System.out.println("두번째bean:" + mesg2);
		
		System.out.println(service == service2); // 싱글톤 scope
		
	}

}
