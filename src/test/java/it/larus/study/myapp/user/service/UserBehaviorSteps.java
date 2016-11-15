package it.larus.study.myapp.user.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import it.larus.study.myapp.user.domain.User;
import it.larus.study.myapp.user.representation.UserLoginOuput;
import it.larus.study.myapp.user.service.impl.UserServiceDefault;

public class UserBehaviorSteps{
	
	private UserService service;
	private UserDaoMock dao;
	private User user;
	private UserLoginOuput out;

	@BeforeScenario
	public void setUp()
	{
		UserServiceDefault s = new UserServiceDefault();
		dao = new UserDaoMock();
		s.setUserDao(dao);
		service = s;
		user = new User();
	}
	
	@Given("a user with username never registered")
	public void theUser()
	{
		dao.reset();//no user in mock dao
	}
	
	@Given("user language is $lang")
	public void userLanguage(String lang)
	{
		user.setLanguage(lang);		
	}
	
	@Given("user is logged on Facebook")
	public void userWithFacebookAccount()
	{
		user.setFacebookAccount("....sessionIdFacebook....");		
	}
	
	@When("try login")
	public void access()
	{
		out = service.get(user, "");
	}
	
	@Then("ensure user is not login")
	public void thenNotLogin()
	{
		assertNotNull("No output", out);
		assertNull("User is known", out.getEmail());
	}
	
	@Then("ensure exists the button “Register with Facebook”")
	public void showFacebookRegistration()
	{
		assertNotNull("No output", out);
		assertNotNull("No facebook registration provided", out.getFacebookRegistration());
	}
	
	@Then("ensure exists the button “Register”")
	public void showRegistration()
	{
		assertNotNull("No output", out);
		assertNotNull("No registration provided", out.getRegistration());
	}
	
	@Then("user is unknown")
	public void thenUserNotFound()
	{
		assertNotNull("No output", out);
		assertNull("User is known", out.getUsername());		
	}
	
	@Then("navigation is in $lang")
	public void thenUserLangIs(String lang)
	{
		assertNotNull("No output", out);
		assertEquals("Wrong language", lang, out.getLanguage());		
	}
	
}
