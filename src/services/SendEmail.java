package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import business.Bank;

public class SendEmail implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret1, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		
		Log l =LogFactory.getLog(Bank.class);
		l.info("Sending Email....A/c balance: "+ret1);
	}

}
