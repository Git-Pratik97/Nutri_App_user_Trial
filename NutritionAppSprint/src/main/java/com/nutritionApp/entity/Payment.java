package com.nutritionApp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;


@Entity
public class Payment {
    @Id
    private Long id;
    private float payment;
    private float discount;
    private LocalDate created_At;
    private LocalDate updated_At;
    private String userId;
    private Long planId;

   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public LocalDate getCreated_At() {
        return created_At;
    }

    public void setCreated_At(LocalDate created_At) {
        this.created_At = created_At;
    }

    public LocalDate getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(LocalDate updated_At) {
        this.updated_At = updated_At;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }
    
    

   	public Payment() {
		super();
	}

	public Payment(Long id, float payment, float discount, LocalDate created_At, LocalDate updated_At,
			String userId, Long planId) {
		super();
		this.id = id;
		this.payment = payment;
		this.discount = discount;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.userId = userId;
		this.planId = planId;
	}
	
	 public Payment(float payment, float discount, LocalDate created_At, LocalDate updated_At, String userId,
				Long planId) {
			super();
			this.payment = payment;
			this.discount = discount;
			this.created_At = created_At;
			this.updated_At = updated_At;
			this.userId = userId;
			this.planId = planId;
		}


    
    
   }


