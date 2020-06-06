package edu.dgut.mapper;

import edu.dgut.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    public List<Account> findAll();
}
