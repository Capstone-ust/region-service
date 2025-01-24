package com.sr.region_service.pojo;




import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StorePojo {
	private int storeId;
	private String storeName;
	private int regionId;
	private int userId;
	
	private RegionPojo regionPojo;
	
	
	

}
