package com.nutritionApp.DTO;
import java.time.LocalDate;

public class PaymentDTO {
	  private Long id;
	    private float payment;
	    private float discount;
	    private LocalDate created_At;
	    private LocalDate updated_At;
	    private String userId;
	    private Long planId;

	    public PaymentDTO() {
	    }

	    public PaymentDTO(Long id, float payment, float discount, LocalDate created_At,
	                      LocalDate updated_At, String userId, Long planId) {
	        this.id = id;
	        this.payment = payment;
	        this.discount = discount;
	        this.created_At = created_At;
	        this.updated_At = updated_At;
	        this.userId = userId;
	        this.planId = planId;
	    }

	    public PaymentDTO(float payment, float discount, LocalDate created_At, LocalDate updated_At, String userId, Long planId) {
	        this.payment = payment;
	        this.discount = discount;
	        this.created_At = created_At;
	        this.updated_At = updated_At;
	        this.userId = userId;
	        this.planId = planId;
	    }

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

	    @Override
	    public String toString() {
	        return "PaymentDTO{" +
	                "id=" + id +
	                ", payment=" + payment +
	                ", discount=" + discount +
	                ", created_At=" + created_At +
	                ", updated_At=" + updated_At +
	                ", userId='" + userId + '\'' +
	                ", planId=" + planId +
	                '}';
	    }

}
