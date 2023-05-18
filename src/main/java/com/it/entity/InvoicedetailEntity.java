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
@Table (name = "tb_invoicedetail")
public class InvoicedetailEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer deId;
	private Integer deRental;
	private Integer dePrice;
	private String dePayextra;
	private Integer deVat;
	private String deDelayed;
	private String inId;
	
	

}
