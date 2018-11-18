package com.codenotfound.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.codenotfound.db.Database;
import com.codenotfound.repository.Repository;
import com.codenotfound.services.helloworld.HelloWorldPortType;
import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.helloworld.Person;
import com.codenotfound.validation.Validation;

@Controller
public class HelloWorldImpl implements HelloWorldPortType {

//	@Autowired
//	private Repository repository;
	
	@Autowired
	private Database db;
	
  @Override
  public Greeting sayHello(Person request) {
    String greeting = "Hello " + request.getFirstName() + " "
        + request.getLastName() + "!";

    ObjectFactory factory = new ObjectFactory();
    Greeting response = factory.createGreeting();
    
//    System.out.println("\n :" + repository.findAll() );
    
//    Database db = new Database();
    System.out.println("\n\n" + db.getStudents());
    
    
    Validation vl = new Validation();
    vl.check();
    
    response.setGreeting(greeting);

    return response;
  }
}
