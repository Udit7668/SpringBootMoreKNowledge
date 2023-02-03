package com.api.book.bookrestapi.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.api.book.bookrestapi.entities.MerchantLoan;
import com.api.book.bookrestapi.services.MerchantLoanService;


@Controller
public class HomeController {
   
    @Autowired
    private MerchantLoanService merchantLoanService;

    @RequestMapping("/home")
    public String test(){
        System.out.println("Test Controller............");
        return "test";
    }


   @RequestMapping(value="/bulk/updateReportingOrgCode",method=RequestMethod.POST)
    public String collectData(Model model,
    @RequestParam(value = "file") MultipartFile file, HttpServletRequest request,
    HttpServletResponse response   ){
        System.out.println("in  collect data");
    //System.out.println(file.getOriginalFilename());
               try{
          BufferedReader reader=new BufferedReader(new InputStreamReader(file.getInputStream()));
          //  System.out.println(reader);
            String line = "";
            String[] tempArr;
            int row=0;
            while((line = reader.readLine()) != null) {
               tempArr = line.split(",");
               if(row!=0){
                MerchantLoan merchantLoan=new MerchantLoan();
                merchantLoan.setMerchantName(tempArr[0]);
                merchantLoan.setMid(tempArr[1]);
                merchantLoan.setTid(tempArr[2]);
                merchantLoan.setTotalLoanAmount(tempArr[3]);
                merchantLoan.setLoanAmount(tempArr[4]);
                merchantLoan.setLoanOutstandingBalance(tempArr[5]);
                merchantLoan.setEDIDeduction(tempArr[6]);
                merchantLoan.setIDFCBankAccount(tempArr[7]);
                merchantLoan.setMerchantAccountNumber(tempArr[8]);
                merchantLoan.setInterestAmount(tempArr[9]);
                merchantLoan.setInterestDate(tempArr[10]);
                merchantLoan.setMdr(tempArr[11]);
                merchantLoan.setTenure(tempArr[12]);
                merchantLoan.setOutOfBookAdjustement(tempArr[13]);
                merchantLoan.setEDILedgerBalance(tempArr[14].isEmpty()?"0":tempArr[14]);
                merchantLoan.setLeftOutstandingBalance(tempArr[15]);
                this.merchantLoanService.uploadMerchantData(merchantLoan);
               }
               row++;  
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }


    return "test";
    }  


}
