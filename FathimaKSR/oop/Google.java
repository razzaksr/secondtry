package oop;

public class Google 
{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void features()
	{
		System.out.println(username+" can use this acccount for developing purpose");
	}
}
