package com.optivem.kata.banking.core.common;

import com.optivem.kata.banking.core.Facade;
import com.optivem.kata.banking.core.common.givens.BankAccountRepositoryGiven;
import com.optivem.kata.banking.core.common.givens.FacadeGiven;
import com.optivem.kata.banking.core.common.givens.FakeAccountNumberGeneratorGiven;
import com.optivem.kata.banking.core.common.givens.FakeDateTimeServiceGiven;
import com.optivem.kata.banking.core.domain.accounts.BankAccountRepository;
import com.optivem.kata.banking.infra.fake.accounts.FakeAccountNumberGenerator;
import com.optivem.kata.banking.infra.fake.time.FakeDateTimeService;

public class Givens {
    public static BankAccountRepositoryGiven givenThat(BankAccountRepository repository) {
        return new BankAccountRepositoryGiven(repository);
    }

    public static FakeAccountNumberGeneratorGiven givenThat(FakeAccountNumberGenerator generator) {
        return new FakeAccountNumberGeneratorGiven(generator);
    }

    public static FakeDateTimeServiceGiven givenThat(FakeDateTimeService service) {
        return new FakeDateTimeServiceGiven(service);
    }

    public static FacadeGiven givenThat(Facade facade) {
        return new FacadeGiven(facade);
    }
}