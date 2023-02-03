package com.api.book.bookrestapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bookrestapi.entities.MerchantLoan;
import com.api.book.bookrestapi.repository.MerchantLoanRepository;

@Service
public class MerchantLoanService{

    @Autowired
    private MerchantLoanRepository merchantLoanRepository;


    public void uploadMerchantData(MerchantLoan merchantLoan)
    {
        this.merchantLoanRepository.save(merchantLoan);
    }
    
}
