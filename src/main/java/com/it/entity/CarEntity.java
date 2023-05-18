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
@Table (name = "tb_car")

public class CarEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String carName;
	private String carBrand;
	private Integer carPrice;
	private String carImg;
	private String custStetus;
	private String carDetail;
	
	

}
