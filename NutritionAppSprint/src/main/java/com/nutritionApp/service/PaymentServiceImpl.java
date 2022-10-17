package com.nutritionApp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.nutritionApp.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutritionApp.entity.Payment;
import com.nutritionApp.exception.PaymentNotFoundException;
import com.nutritionApp.repository.PaymentRepository;
import com.nutritionapp.nutrition.Entity.DietPlan;
import com.nutritionapp.nutrition.exception.DietPlanNotFoundException;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	private PaymentRepository paymentRepository;
	@Autowired
	public void PaymentService(PaymentRepository paymentRepository) {
		this.paymentRepository= paymentRepository;
	}
	
	@Override
	public void pay(Payment payment) throws PaymentNotFoundException {
		Payment value = paymentRepository.findById(payment.getId()).
                orElseThrow(()->new PaymentNotFoundException("Payment with id "+
                        payment.getId() +" does not exist."));
		value.setPayment(pay);
		
	}

	@Override
	public void addOffer(Payment payment, float discount) throws PaymentNotFoundException {
		Payment value = paymentRepository.findById(payment.getId()).
                orElseThrow(()->new PaymentNotFoundException("Payment with id "+
                        payment.getId() +" does not exist."));
		if(value.getDiscount()!= 0f) {
			throw new PaymentNotFoundException("Discount already exist");
			
		}
		else {
			value.setDiscount(discount);
		}
	
		 
	}

	@Override
	public List<Payment> showAllPayments() throws PaymentNotFoundException{
		 return paymentRepository.findAll();
	}

	@Override
	@Transactional
	public Payment updatePayemnt(Payment payment) throws PaymentNotFoundException {
		
		Payment value = paymentRepository.findById(payment.getId()).
                orElseThrow(()->new PaymentNotFoundException("Payment with id "+
                        payment.getId() +" does not exist."));
        value.setId(payment.getId());
        value.setPayment(payment.getPayment());
        value.setDiscount(payment.getDiscount());
        value.setCreated_At(payment.getCreated_At());
        value.setUpdated_At(payment.getUpdated_At());
        value.setUserId(payment.getUserId());
        value.setPlanId(payment.getPlanId());
        return paymentRepository.save(value);
	}


}
