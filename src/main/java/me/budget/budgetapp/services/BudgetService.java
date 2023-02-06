package me.budget.budgetapp.services;

public interface BudgetService {

    int getDailyBudget();

    int getBalance();


    int getVacationBonus(int daysCount);

    int getSalaryWithVacations(int vacationDaysCounts, int vacationWorkDaysCount, int workingDaysInMonth);
}
