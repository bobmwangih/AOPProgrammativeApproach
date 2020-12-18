package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.SendEmail;
import services.SendOTP;
import services.SendOTPEmail;

public class App {

	public static void main(String[] args) {
		//create target
		Bank b = new Bank();
		
		//create Advice
		SendOTP otp = new SendOTP();
		SendEmail sMail = new SendEmail();
		SendOTPEmail sm = new SendOTPEmail();
		
		//add target + advice to proxy
		ProxyFactoryBean pfb =new ProxyFactoryBean();
		pfb.setTarget(b);
		//pfb.addAdvice(otp);
		//pfb.addAdvice(sMail);
		pfb.addAdvice(sm);
		
		//get generated proxy object
		Bank bProxy = (Bank) pfb.getObject();
		int amount =bProxy.deposit("kcb505", 6000);
		//System.out.println("Account balance "+ amount);

	}

}
