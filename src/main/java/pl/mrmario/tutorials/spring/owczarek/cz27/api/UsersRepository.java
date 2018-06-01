package pl.mrmario.tutorials.spring.owczarek.cz27.api;

import pl.mrmario.tutorials.spring.owczarek.cz27.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
