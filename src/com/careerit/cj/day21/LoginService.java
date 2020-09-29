package com.careerit.cj.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class User {
	private String uuid;
	private String name;
	private String password;

	public User(String name, String password) {
		this.setUuid(UUID.randomUUID().toString());
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}

class LoginUserUtil {

	Map<String,User> map = new HashMap<>();
	public LoginUserUtil() {
		map.put("krish",new User("krish", "krish@123"));
		map.put("naresh",new User("naresh", "naresh@123"));
		map.put("tanvi",new User("tanvi", "tanvi@123"));
		map.put("sai",new User("sai", "sai@123"));
		map.put("manoj",new User("manoj", "manoj@123"));
		map.put("rajesh",new User("rajesh", "rajesh@123"));
		map.put("mahesh",new User("mahesh", "mahesh@123"));
	}

	public User login(String username, String password) throws BadCredentialsException {
		User user = map.get(username);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return user;
			}
		}
		throw new BadCredentialsException("Bad credentials");
	}
}

public class LoginService {

	public static void main(String[] args) {

		LoginUserUtil util = new LoginUserUtil();
		try {
			User user = util.login("rajeshm", "rajesh@123");
			System.out.println("user logged in with id:" + user.getUuid());
		} catch (BadCredentialsException e) {
			System.out.println(e.getMessage());
		}
	}
}
