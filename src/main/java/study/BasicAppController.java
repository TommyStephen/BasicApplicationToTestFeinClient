package study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic/api")
public class BasicAppController {

	@Autowired
	private BasicAppService basicAppService;
	
	@GetMapping("/name")
	public String getName() {
		return basicAppService.getName();
	}
	
	@GetMapping("/age")
	public String getAge() {
		return basicAppService.getAge();
	}
	
	@GetMapping("/dist")
	public String getDistrict() {
		return basicAppService.getDistrict();
	}
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return basicAppService.greet(name);
	}
	@GetMapping("/great/{name}")
	public String getDString(String name) {
		return basicAppService.greet(name);
	}
	
}
