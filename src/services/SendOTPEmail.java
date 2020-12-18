package services;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import business.Bank;

public class SendOTPEmail implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l =LogFactory.getLog(Bank.class);
		l.info("Sending OTp");
		Object ret = mi.proceed();
		l.info("After depositng....sending email");
		return ret;
	}

}
