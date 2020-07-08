package com.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.springboot.web.model.Todo;

@Service

public class TodoService {
	
	@Autowired
	private MyRepo repo;
	
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    public TodoService() {
        todos.add(new Todo(1, "pooja", "simplilearn awesome", new Date(),
               true , "pooja@gmail.com" , "Mumbai"));
        todos.add(new Todo(2, "pooja", "user friendly ", new Date(), true , "123@gmail.com" , "Mumbai"));
        todos.add(new Todo(3, "pooja", "practicelab hangs", new Date(),
                false, "database@gmail.com" , "Mumbai"));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
    
    public Todo retrieveTodo(int id) {
        for (Todo todo : todos) {
            if (todo.getId()==id) {
                return todo;
            }
        }
        return null;
    }

    public void updateTodo(Todo todo){
    		todos.remove(todo);
    		todos.add(todo);
    }

    public void addTodo(String name, String feed, Date date,
            boolean satisfied, String email, String address) {
        todos.add(new Todo(++todoCount, name, feed, date, satisfied , email, address));
        repo.save(todos);
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
}