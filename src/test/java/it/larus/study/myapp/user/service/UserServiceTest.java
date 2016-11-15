package it.larus.study.myapp.user.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.larus.study.myapp.user.domain.User;
import it.larus.study.myapp.user.representation.UserLoginOuput;
import it.larus.study.myapp.user.service.impl.UserServiceDefault;

public class UserServiceTest {

	private UserService service;
	private UserDaoMock dao;

	@Before
	public void setUp() throws Exception {
		UserServiceDefault s = new UserServiceDefault();
		dao = new UserDaoMock();
		s.setUserDao(dao);
		service = s;
	}

	@After
	public void tearDown() throws Exception {
		dao.reset();
	}

	@Test
	public void unknownFacebookUser() {
		User user = new User();
		user.setLanguage(Locale.ITALIAN.toString());
		user.setFacebookAccount("....sessionIdFacebook....");
		
		UserLoginOuput out = service.get(user, "myPassword");
		
		assertNotNull("No output", out);
		assertNull("User is known", out.getUsername());
		assertNotNull("No facebook registration provided", out.getFacebookRegistration());
		assertEquals("Wrong language", user.getLanguage(), out.getLanguage());
	}

}
