package com.example.toDoList.repo;

import com.example.toDoList.model.toDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<toDoItem, Integer>{

}
