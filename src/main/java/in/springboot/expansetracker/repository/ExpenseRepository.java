package in.springboot.expansetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.springboot.expansetracker.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
