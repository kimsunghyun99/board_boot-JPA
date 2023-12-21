package com.board.dto;

import com.board.entity.AddressEntity;
import com.board.entity.FileEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
	
	private String zipcode;
	private String province;
	private String road;
	private String building;
	private String oldaddr;
	

	//Entity --> DTO 
	
	public AddressDTO(AddressEntity addressEntity) {
		
		this.zipcode =addressEntity.getZipcode();
		this.province =addressEntity.getProvince();
		this.road =addressEntity.getRoad();
		this.building =addressEntity.getBuilding();
		this.oldaddr =addressEntity.getOldaddr();
	}
		
	
	//DTO --> Entity
		
		public AddressEntity dtotoEntity(AddressDTO dto)  {

			AddressEntity addresEntity = AddressEntity.builder()
					 										 .zipcode(dto.getZipcode())
					 										 .province(dto.getProvince())
					 										 .road(dto.getRoad())
					 										 .building(dto.getBuilding())
					 										 .oldaddr(dto.getOldaddr())
					 										 .build();
					 										 return addresEntity;
			 
			 
		 }
		
	
}
