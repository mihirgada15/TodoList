package com.in28minutes.springboot.mywebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();

	static{
	todos.add(new Todo(1,"MihirGada","Learn SpringBoot",LocalDate.now().plusYears(1),false));
	todos.add(new Todo(2,"MihirGada","Learn AWS",LocalDate.now().plusYears(2),false));
	todos.add(new Todo(3,"MihirGada","Learn Taekwando",LocalDate.now().plusYears(3),false));
	todos.add(new Todo(4,"MihirGada","Learn FullStack",LocalDate.now().plusYears(4),false));
	}
	
	public List <Todo> findByUsername(String username){
		return todos;
	}
}
	
	
	