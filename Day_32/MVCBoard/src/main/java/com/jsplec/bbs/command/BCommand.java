package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 메소드 이름만 정의한다.
public interface BCommand {

	public void execute(HttpServletRequest request,HttpServletResponse response);
	
	
}
