package me.budget.budgetapp.services.impl;

import me.budget.budgetapp.services.BudgetService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BudgetServiceImpl implements BudgetService {
    public static final int SALARY = 100000;
    public static final int AVG_SALARY = 100000;
    public static final double AVG_DAYS = 29.3;

    @Override
    public int getDailyBudget() {
        return SALARY / 31;
    }

    @Override
    public int getBalance() {
        return SALARY - LocalDate.now().getDayOfMonth() * getDailyBudget();
    }
    @Override
    public int getVacationBonus(int daysCount) {
        double avgDaySalary = AVG_SALARY / AVG_DAYS;
        return (int) (daysCount * avgDaySalary);
    }
    @Override
    public int getSalaryWithVacations(int vacationDaysCounts, int vacationWorkDaysCount, int workingDaysInMonth) {
        int salary = SALARY / workingDaysInMonth * (workingDaysInMonth - vacationWorkDaysCount);
        return salary+getVacationBonus(vacationDaysCounts);
    }
}

