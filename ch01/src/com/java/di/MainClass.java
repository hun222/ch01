package com.java.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/*Su su = new Su();
		su.disp();*/
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		Su appSu =(Su)ctx.getBean("su");
		appSu.disp();
		
		Value value = (Value)ctx.getBean("value");
		value.print();
		
		Sub sub = (Sub)ctx.getBean("sub");
		sub.disp();
		
		ctx.close();
	}

}
