package com.sarthak.accounts.service.impl;


import com.sarthak.accounts.dto.AccountsDto;
import com.sarthak.accounts.dto.CardsDto;
import com.sarthak.accounts.dto.CustomerDetailsDto;
import com.sarthak.accounts.dto.LoansDto;
import com.sarthak.accounts.entity.Accounts;
import com.sarthak.accounts.entity.Customer;
import com.sarthak.accounts.exception.ResourceNotFoundException;
import com.sarthak.accounts.mapper.AccountsMapper;
import com.sarthak.accounts.mapper.CustomerMapper;
import com.sarthak.accounts.repository.AccountsRepository;
import com.sarthak.accounts.repository.CustomerRepository;
import com.sarthak.accounts.service.ICustomersService;


import com.sarthak.accounts.service.client.CardsFeignClient;
import com.sarthak.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomersServiceImpl implements ICustomersService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        Customer customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString())
        );

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(mobileNumber);
        customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(mobileNumber);
        customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());

        return customerDetailsDto;

    }
}