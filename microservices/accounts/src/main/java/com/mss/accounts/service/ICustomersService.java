package com.mss.accounts.service;

import com.mss.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    CustomerDetailsDto fetchCustomerDetails(String correlationId, String mobileNumber);

}
