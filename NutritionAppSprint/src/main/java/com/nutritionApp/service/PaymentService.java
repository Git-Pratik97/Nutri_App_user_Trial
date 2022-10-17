package com.nutritionApp.service;

import java.util.List;


import com.nutritionApp.entity.Payment;
import com.nutritionApp.exception.PaymentNotFoundException;

public interface PaymentService {


	
	public void pay(Payment payment) throws PaymentNotFoundException;
	
	public void addOffer(Payment payment,float discount) throws PaymentNotFoundException;
	
	public List<Payment> showAllPayments() throws PaymentNotFoundException;
	
	public Payment updatePayemnt(Payment payment) throws PaymentNotFoundException;

}
