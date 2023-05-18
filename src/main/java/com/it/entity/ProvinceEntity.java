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
@Table (name = "tb_province")
public class ProvinceEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer pvId;
	private String pvCode;
	private String pvName_th;
	private String area;
	
	
	

}
