package com.it.dto;

import lombok.Data;

@Data
public class PaymentsDto {

	private Integer paymentId;
	private String paymentAmount;
	private String paymentBill;
	private String paymentReceived_data;
	private String paymentStatus;
	private String inId;
	private String usreId;
}
