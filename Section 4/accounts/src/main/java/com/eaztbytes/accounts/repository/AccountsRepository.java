package com.eaztbytes.accounts.repository;

import com.eaztbytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long CustomerId);

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);

}
