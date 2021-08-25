package in.springboot.expansetracker.service;

import java.util.List;

import in.springboot.expansetracker.model.Expense;


public interface ExpenseService {
	
	List<Expense> findAll();
	
	Expense save(Expense expense);
	
	Expense findById(Long id);
	
}