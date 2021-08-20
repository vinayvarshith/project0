package com.bank.service;

import com.bank.exception.BankException;

public interface LoginService {
  
	  public boolean isValidLoginCustomer(String cust_id,String cust_pwd) throws BankException;
	   public boolean isValidLoginEmployee(String emp_id,String emp_pwd) throws BankException;
}
