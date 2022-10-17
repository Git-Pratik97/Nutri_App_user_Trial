package com.nutritionApp.Controller;
import java.util.Properties;
import java.util.List;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nutritionApp.DTO.PaymentDTO;
import com.nutritionApp.entity.Payment;
import com.nutritionApp.exception.PaymentNotFoundException;
import com.nutritionApp.service.PaymentService;

@RestController
@RequestMapping(path= "/Payment")
public class PaymentController {
	private final PaymentService paymentService;
	
	@Autowired
	public PaymentController(PaymentService paymentService) {
		this.paymentService= paymentService;
	}
	@Autowired
	private Environment environment;
	
	@PutMapping(value = "/payment")
	    public ResponseEntity<String> updatePayment(@RequestBody Payment payment)
	            throws PaymentNotFoundException {
	        ((PaymentController) paymentService).updatePayment(payment);
	        String successMessage = environment.getProperty("API.UPDATE_SUCCESS");
	        return new ResponseEntity<>(successMessage, HttpStatus.OK);
	    }
	
	
	 @GetMapping(value = "/payment")
	    public ResponseEntity<List<Payment>> showAllPayments() throws PaymentNotFoundException {
	        List<Payment> paymentList = paymentService.showAllPayments();
	        return new ResponseEntity<>(paymentList, HttpStatus.OK);
	    }
	 
	 
	 //@PostMapping(value = "/payment")
	   // public ResponseEntity<String> addOffer(@RequestBody Payment payment) throws PaymentNotFoundException {
	     //   float pay = paymentService.addOffer(payment.getDiscount());
	      //  String successMessage = environment.getProperty("API.INSERT_SUCCESS") + Id;
	     //   return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	  //  }
	
	
	
	
	
   // public Payment pay(Payment payment) throws PaymentNotFoundException;
	

	
	
	
	

}
