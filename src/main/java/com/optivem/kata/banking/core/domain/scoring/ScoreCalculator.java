package com.optivem.kata.banking.core.domain.scoring;

import com.optivem.kata.banking.core.domain.accounts.BankAccount;

public interface ScoreCalculator {
    Score calculate(BankAccount bankAccount);
}