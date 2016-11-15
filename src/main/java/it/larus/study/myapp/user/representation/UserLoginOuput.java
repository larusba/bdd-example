package it.larus.study.myapp.user.representation;

import it.larus.study.myapp.user.domain.User;

/**
 * Representation of user login result
 * 
 * @author omar
 *
 */
public class UserLoginOuput extends User {

	private HypermediaLink registration;
	private HypermediaLink facebookRegistration;

	@Override
	public String getPasswordHash() {
		return "";
	}
	
	@Override
	public void setPasswordHash(String passwordHash) {
	}
	
	public HypermediaLink getRegistration() {
		return registration;
	}

	public void setRegistration(HypermediaLink registration) {
		this.registration = registration;
	}

	public HypermediaLink getFacebookRegistration() {
		return facebookRegistration;
	}

	public void setFacebookRegistration(HypermediaLink facebookRegistration) {
		this.facebookRegistration = facebookRegistration;
	}

}
