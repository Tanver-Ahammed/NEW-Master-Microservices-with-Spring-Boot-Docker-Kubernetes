package com.eaztbytes.accounts.service;

import com.eaztbytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto- CustomerDto Object
     * */
    void createAccount(CustomerDto customerDto);

}
