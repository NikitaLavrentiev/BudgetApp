package me.budget.budgetapp.controllers;

import me.budget.budgetapp.services.BudgetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/budget")
public class BudgedController {
    private BudgetService budgetService;

    public BudgedController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping("/daily")
    public int dailyBudget() {
        return budgetService.getDailyBudget();
    }
@GetMapping("balance")
    public int balance() {
        return budgetService.getBalance();
    }

    @GetMapping("/vacation")
    public int vacationBonus(int vacationDays) {
        return budgetService.getVacationBonus(vacationDays);
    }
@GetMapping("/vacation/salary")
    public int salaryWithVacation(int vacationDays, int vacationWorkDays, int workingDays) {
    return budgetService.getSalaryWithVacations(vacationDays, vacationWorkDays, workingDays);

    }
}

