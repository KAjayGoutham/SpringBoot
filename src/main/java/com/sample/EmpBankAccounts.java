package com.sample;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EmpBankAccounts implements Banks {

    private String bankName;
    private String bankIfsc;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankIfsc() {
        return bankIfsc;
    }

    public void setBankIfsc(String bankIfsc) {
        this.bankIfsc = bankIfsc;
    }

    @Override
    public String toString() {
        return "EmpBankAccounts{" +
                "bankName='" + bankName + '\'' +
                ", bankIfsc='" + bankIfsc + '\'' +
                '}';
    }

    @Override
    public void hdfc(String eid) {
        System.out.println("Bank details");
        System.out.println(eid);
        System.out.println("AccountNumber: 97723712671001");
    }
}
