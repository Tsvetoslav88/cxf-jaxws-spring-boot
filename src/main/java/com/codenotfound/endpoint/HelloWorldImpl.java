package com.codenotfound.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codenotfound.repository.Repository;
import com.codenotfound.services.helloworld.HelloWorldPortType;
import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.helloworld.Person;

public class HelloWorldImpl implements HelloWorldPortType {

	@Autowired
	private Repository repository;
	
  @Override
  public Greeting sayHello(Person request) {
    String greeting = "Hello " + request.getFirstName() + " "
        + request.getLastName() + "!";

    ObjectFactory factory = new ObjectFactory();
    Greeting response = factory.createGreeting();
    
    System.out.println("Test :" + repository.findAll().size() );
    
    response.setGreeting(greeting);

    return response;
  }
}
