package com.WebApp.ToDoApp.ServiceCollection;

import com.WebApp.ToDoApp.Models.ToDo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ToDoService {
    private static List<ToDo> todos= new ArrayList<>();
    private static int count=0;
    static {
        todos.add (new ToDo(++count,"vamsi","azure",LocalDate.now().plusYears(1),false));
        todos.add(new ToDo(++count,"vamsi",".net",LocalDate.now().plusYears(2),false));
        todos.add(new ToDo(++count,"vamsi","springboot",LocalDate.now().plusYears(1),false));
    }
    public List<ToDo> findByUsername(String username){
        return todos;
    }
    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        ToDo todo= new ToDo(++count,username,description,targetDate,done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super ToDo> predicate= todo-> todo.getId()==id;
        todos.removeIf(predicate);
    }

    public ToDo findById(int id) {
        Predicate<? super ToDo> predicate = todo -> todo.getId()==id;
        ToDo todo= todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(ToDo todo) {
        deleteById(todo.getId());
        todos.add(todo);
        todos.stream().sorted();
    }
}
