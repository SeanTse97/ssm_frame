package edu.dgut.service.impl;

import edu.dgut.domain.Account;
import edu.dgut.mapper.AccountMapper;
import edu.dgut.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
