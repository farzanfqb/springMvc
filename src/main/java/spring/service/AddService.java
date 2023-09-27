package spring.service;

import org.springframework.stereotype.Component;

@Component

public class AddService {
public int add(int num1, int num2) {
	int result = num1+num2;
	return result;
	
}
}
