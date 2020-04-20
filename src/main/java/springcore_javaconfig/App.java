package springcore_javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcore_javaconfig.config.AppConfig;
import springcore_javaconfig.config.ChatService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ChatService service = context.getBean("chatService", ChatService.class);
		service.sendText("Hi", "John");
	}
}