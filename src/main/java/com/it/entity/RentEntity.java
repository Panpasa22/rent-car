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
@Table (name = "tb_rent")
public class RentEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
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
