package pl.mrmario.tutorials.spring.owczarek.cz27.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz27.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz27.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz27.domain.User;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired
	private Logger logger;
	@Value("${database.host}")
	private String host;
	@Value("${database.port}")
	private int port;
	@Value("${database.name}")
	private String database;
	@Value("#{systemProperties['database.user']}")
	private String user;
	@Value("#{systemProperties['database.password']}")
	private String password;
	
	public User createUser(String name) {
		if(logger != null) {
			logger.log("Tworzenie u¿ytkownika " + name + " do bazy "+ host +" : "+port+"/"+database + " Haslo: "+password+" login:"+user);
		}
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
