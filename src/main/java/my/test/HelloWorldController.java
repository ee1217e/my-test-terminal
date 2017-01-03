package my.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public String helloworld(){
		return "Hello World";
	}
}
