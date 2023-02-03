package com.api.book.bookrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.book.bookrestapi.entities.MerchantLoan;

@Repository
public interface MerchantLoanRepository extends CrudRepository<MerchantLoan,Integer> {
    
}
