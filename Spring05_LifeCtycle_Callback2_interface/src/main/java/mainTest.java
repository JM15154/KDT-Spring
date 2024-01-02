import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptServiceImpl;

public class mainTest {

	public static void main(String[] args) {
		// 1. 고전방식
		DeptServiceImpl service = new DeptServiceImpl();
		String mesg = service.getMesg();
		System.out.println("고전방식:" + mesg);
		
		
		
		// 2. 스프링 방식
		/*
		 	- 스프링에서는 생성된 클래스를 빈(bean) 이라고 부른다.
		 	
		 	- 빈 생성 순서
		 		가. 빈 작성(*.java)
		 		나. 빈을 xml에 등록 (src/main/resource, 패키지 사용 가능)
		 			예 > com/config/user.xml
		 			
		 		다. ApplicationContext 생성
		 			- xml에 등록된 빈들의 lifecycle 관리 ( 생성 ~ 소멸)
		 			- 빈 생성은 기본적으로 기본생성자로 생성한다.
		 		라. 빈 얻기
		 			클래스 변수명 = ctx.getBean("id값", 클래스.class);
		 			
		 */
		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/config/user.xml");
		
		// 빈 얻기
		DeptServiceImpl service2 = ctx.getBean("xxx", DeptServiceImpl.class);
		String mesg2 = service2.getMesg();
		System.out.println("스프링방식:" + mesg2);
		
		ctx.close();
	}

}
