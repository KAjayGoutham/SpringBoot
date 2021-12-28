package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Employee {


   private String ename;
   private String eid;
   private String esalary;
   @Autowired
   private EmpBankAccounts ea;

    public EmpBankAccounts getEa() {
        return ea;
    }

    public void setEa(EmpBankAccounts ea) {
        this.ea = ea;
    }

    public Employee(){
        System.out.println("class initiated.../");
    }

    public void setEname(String ename){
        this.ename=ename;
    }

    public String getEname(){
        return ename;
    }

    public void setEid(String eid){
        this.eid=eid;
    }

    public String getEid(){
        return eid;
    }

    public void setEsalary(String esalary){
        this.esalary = esalary;
    }

    public String getEsalary(){
        return esalary;
    }

    public void message(String msg){
        System.out.println(msg);
        ea.hdfc("001");
    }

}
