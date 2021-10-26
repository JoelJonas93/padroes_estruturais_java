package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.UserOracleDao;
import br.com.cod3r.bridge.mvc.dao.UserPostgresDao;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.UserRest;
import br.com.cod3r.bridge.mvc.services.UserService;
import br.com.cod3r.bridge.mvc.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userServiceOracle = new UserRest(new UserOracleDao());
		userServiceOracle.save(user);

		UserService userServicePostgres = new UserSoap(new UserPostgresDao());
		userServicePostgres.save(user);
		
	}
}
