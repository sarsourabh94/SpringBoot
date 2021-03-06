package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter=new AtomicLong();
	
	public Person createPerson(Person person)
	{
		return person;
	}
	
	public Person updatePerson(Person person)
	{
		person.setName("Robin");
		return person;
	}
	
	public void deletePerson(Person person)
	{
		
	}
	
	public Person findById(String id) {
		
		Person person=new Person();
		person.setId(counter.getAndIncrement());
		person.setName("Oliver queen");
		person.setAddress("Starling city");
		
		return person;
	}

	
	public List<Person> findAll()
	{
		List<Person> listPerson = new ArrayList<Person>();
		for(int i=0;i<5;i++)
		{
			Person p = mockPerson();
			listPerson.add(p);
		}
		return listPerson;
	}
	
	public Person mockPerson()
	{
		Person person= new Person();
		person.setId(counter.getAndIncrement());
		person.setName("OLiver Queen - "+counter);
		person.setAddress("Starling city");
		return person;
	}
}
