package com.it.dto;

import lombok.Data;

@Data
public class RentDto {

	private Integer rentId;
	private String rentStart;
	private Integer rentInsurance;
	private String rentTotal;
	private String rentEnd;
	private Integer rentInterest;
	private String rentReceiveinplace;
	private String rentReceiveoffsite;
	private String rentReturninplace;
	private String rentRetuneoffsite;
	private String carId;
	private String usreId;
	
}
