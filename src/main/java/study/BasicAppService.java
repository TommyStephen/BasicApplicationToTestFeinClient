package study;

import org.springframework.stereotype.Service;

@Service
public class BasicAppService {

	public String getName() {
		return "Haridasan KM";
	}
	
	public String getAge() {
		return "65";
	}
	
	public String getDistrict() {
		return "Calicut";
	}
}
