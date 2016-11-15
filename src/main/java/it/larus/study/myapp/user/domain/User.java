package it.larus.study.myapp.user.domain;

public class User {

	private String username;
	private String nickname;
	private String passwordHash;
	private String email;
	private boolean loginWithFacebook;
	private String facebookAccount;
	private String language;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isLoginWithFacebook() {
		return loginWithFacebook;
	}

	public void setLoginWithFacebook(boolean loginWithFacebook) {
		this.loginWithFacebook = loginWithFacebook;
	}

	public String getFacebookAccount() {
		return facebookAccount;
	}

	public void setFacebookAccount(String facebookAccount) {
		this.facebookAccount = facebookAccount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	
}
