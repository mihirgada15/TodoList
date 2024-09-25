package com.in28minutes.springboot.mywebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")		//This annotation stores details across multiple requests without this the attribute is valid for single request only
public class TodoController {
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;
	
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("MihirsGada");
        model.addAttribute("todos", todos);
		return "listTodos";
	}
	
	@RequestMapping("add-todo")
	public String showNewTodoPage() {
		
		return "todo";
	}

}
