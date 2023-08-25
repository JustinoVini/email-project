package br.com.emailproject.utils;

import org.apache.log4j.Logger;

public class LogUtil {
	
	private LogUtil() { }
	
	public static Logger getLogger(Object object) { /*Log do email*/
		return getLogger(object.getClass());
	}
	
}
