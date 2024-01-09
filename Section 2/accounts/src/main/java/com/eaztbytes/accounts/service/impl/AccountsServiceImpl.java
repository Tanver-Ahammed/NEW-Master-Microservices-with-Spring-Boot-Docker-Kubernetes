package com.eaztbytes.accounts.service.impl;

import com.eaztbytes.accounts.dto.CustomerDto;
import com.eaztbytes.accounts.repository.AccountsRepository;
import com.eaztbytes.accounts.repository.CustomerRepository;
import com.eaztbytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * @param customerDto- CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }

}
