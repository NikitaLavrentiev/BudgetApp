package me.budget.budgetapp.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Transaction {
    private Category category;
    private int sum;
    private String comment;

    public void getDefault() {
    }
}
