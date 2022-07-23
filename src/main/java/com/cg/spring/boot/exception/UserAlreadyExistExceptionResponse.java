package com.cg.spring.boot.exception;

public class UserAlreadyExistExceptionResponse {

	/**
	 * UserAlreadyExistException is used to handle exceptions on user.
	 */

	private String loginName;

	public UserAlreadyExistExceptionResponse(String loginName) {
		super();
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}
