package pl.mrmario.tutorials.spring.owczarek.cz27.implementations;

import java.util.Date;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz27.api.Logger;

@Service("withDataLogger")
public class WithDateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + " : " + message);
	}
}
