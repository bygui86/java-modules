package com.baeldung.modules.main;
 
import com.baeldung.modules.hello.HelloModules;
 
public class MainAppl {
	public static void main(String[] args) {
		HelloModules.doSomething();
		HelloModules module = new HelloModules();
		module.sayHello();
	}
}
