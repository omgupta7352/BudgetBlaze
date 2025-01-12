package com.Budget.Blaze.service;

import com.Budget.Blaze.DTO.ExpenseDTO;
import com.Budget.Blaze.DTO.FilterDTO;
import com.Budget.Blaze.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense findExpenseById(int id);
    void save(ExpenseDTO expenseDTO);
    void update(ExpenseDTO expenseDTO);
    List<Expense> findAllExpenses();
    List<Expense> findAllExpensesByClientId(int id);
    void deleteExpenseById(int id);
    List<Expense> findFilterResult(FilterDTO filter);

}
