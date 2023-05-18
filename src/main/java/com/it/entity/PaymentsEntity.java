package com.it.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "tb_payments")
public class PaymentsEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer paymentId;
	private String paymentAmount;
	private String paymentBill;
	private String paymentReceived_data;
	private String paymentStatus;
	private String inId;
	private String usreId;
	

}
