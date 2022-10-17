package com.nutritionApp.repository;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.nutritionApp.DTO.PaymentDTO;
import com.nutritionApp.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
	
	//public PaymentDTO update(PaymentDTO payment);
	
	//public void delete(PaymentDTO payment);
	
	//public List<Payment> findAll();

	//public void saveAll(List<PaymentDTO> of);


}
