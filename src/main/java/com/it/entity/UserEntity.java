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
@Table (name = "tb_user")
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String userId;
	private String userName;
	private String userPassword;
	private String userTitle;
	private String userFirstname;
	private String userLassname;
	private Integer userCardid;
	private String userEmail;
	private Integer userPhone;
	private String userAddress;
	private String roleId;
	
	
	
	

}
