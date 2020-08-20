package tutorial1;

import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {

	private HelloWorldService helloWorldService;

	public InjectedByConstructorService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void getMessage() {
		this.helloWorldService.sayHello();
	}
	
	
}
