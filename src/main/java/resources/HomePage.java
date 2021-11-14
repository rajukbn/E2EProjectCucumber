package resources;

import org.openqa.selenium.By;

public class HomePage extends base  {

	private final String  Login_link ="//*[@id=\'homepage\']/header/div[1]/div/nav/ul/li[4]/a/span";
	private final String  User_name ="//*[@id=\'user_email\']";
	private final  String Pwd ="//*[@id=\'user_password\']";
	private final String  Login_btn ="//*[@id=\'hero\']/div/form/div[3]/input";
	
	public void loginLink() {
clickOn(xpath(Login_link));
		
	}
	public void  username() {
		clickOn(xpath( User_name));
	}

	public void pwd() {
		clickOn(xpath(Pwd));
		
	}
	public void loginbtn() {
		clickOn(xpath(Login_btn));
		
	}


	private By xpath(String login_link2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
