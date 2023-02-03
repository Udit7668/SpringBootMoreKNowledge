package com.api.book.bookrestapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MerchantLoan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 
    private String merchantName;
    private String mid;
    private String tid;
    private String totalLoanAmount;
    private String loanAmount;
    private String loanOutstandingBalance;
    private String EDIDeduction;
    private String IDFCBankAccount;
    private String MerchantAccountNumber;
    private String interestAmount;
    private String interestDate;
    private String mdr;
    private String tenure;
    private String outOfBookAdjustement;
    private String EDILedgerBalance;
    private String leftOutstandingBalance;
    
   public MerchantLoan(){

   }
    public MerchantLoan(String merchantName, String mid, String tid, String totalLoanAmount, String loanAmount,
            String loanOutstandingBalance, String eDIDeduction, String iDFCBankAccount, String merchantAccountNumber,
            String interestAmount, String interestDate, String mdr, String tenure, String outOfBookAdjustement,
            String eDILedgerBalance, String leftOutstandingBalance) {
        this.merchantName = merchantName;
        this.mid = mid;
        this.tid = tid;
        this.totalLoanAmount = totalLoanAmount;
        this.loanAmount = loanAmount;
        this.loanOutstandingBalance = loanOutstandingBalance;
        EDIDeduction = eDIDeduction;
        IDFCBankAccount = iDFCBankAccount;
        MerchantAccountNumber = merchantAccountNumber;
        this.interestAmount = interestAmount;
        this.interestDate = interestDate;
        this.mdr = mdr;
        this.tenure = tenure;
        this.outOfBookAdjustement = outOfBookAdjustement;
        EDILedgerBalance = eDILedgerBalance;
        this.leftOutstandingBalance = leftOutstandingBalance;
    }

    
    public String getMerchantName() {
        return merchantName;
    }
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
    public String getMid() {
        return mid;
    }
    public void setMid(String mid) {
        this.mid = mid;
    }
    public String getTid() {
        return tid;
    }
    public void setTid(String tid) {
        this.tid = tid;
    }
    public String getTotalLoanAmount() {
        return totalLoanAmount;
    }
    public void setTotalLoanAmount(String totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }
    public String getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }
    public String getLoanOutstandingBalance() {
        return loanOutstandingBalance;
    }
    public void setLoanOutstandingBalance(String loanOutstandingBalance) {
        this.loanOutstandingBalance = loanOutstandingBalance;
    }
    public String getEDIDeduction() {
        return EDIDeduction;
    }
    public void setEDIDeduction(String eDIDeduction) {
        EDIDeduction = eDIDeduction;
    }
    public String getIDFCBankAccount() {
        return IDFCBankAccount;
    }
    public void setIDFCBankAccount(String iDFCBankAccount) {
        IDFCBankAccount = iDFCBankAccount;
    }
    public String getMerchantAccountNumber() {
        return MerchantAccountNumber;
    }
    public void setMerchantAccountNumber(String merchantAccountNumber) {
        MerchantAccountNumber = merchantAccountNumber;
    }
    public String getInterestAmount() {
        return interestAmount;
    }
    public void setInterestAmount(String interestAmount) {
        this.interestAmount = interestAmount;
    }
    public String getInterestDate() {
        return interestDate;
    }
    public void setInterestDate(String interestDate) {
        this.interestDate = interestDate;
    }
    public String getMdr() {
        return mdr;
    }
    public void setMdr(String mdr) {
        this.mdr = mdr;
    }
    public String getTenure() {
        return tenure;
    }
    public void setTenure(String tenure) {
        this.tenure = tenure;
    }
    public String getOutOfBookAdjustement() {
        return outOfBookAdjustement;
    }
    public void setOutOfBookAdjustement(String outOfBookAdjustement) {
        this.outOfBookAdjustement = outOfBookAdjustement;
    }
    public String getEDILedgerBalance() {
        return EDILedgerBalance;
    }
    public void setEDILedgerBalance(String eDILedgerBalance) {
        EDILedgerBalance = eDILedgerBalance;
    }
    public String getLeftOutstandingBalance() {
        return leftOutstandingBalance;
    }
    public void setLeftOutstandingBalance(String leftOutstandingBalance) {
        this.leftOutstandingBalance = leftOutstandingBalance;
    }



    
}

