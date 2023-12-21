package com.board.entity.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.board.entity.AddressEntity;

public interface AddresRepository extends JpaRepository<AddressEntity, Long>{

	/* select zipcode, province, road, building, oldaddr from 
	   (select zipcode, province, road, building, oldaddr, row_number() over(order by zipcode) as rnum
	   from tbl_addr where road like '%'||#{addrSearch}||'%'
	   or building like '%'||#{addrSearch}||'%') addr 
	   where rnum between #{startPoint} and #{endPoint} order by zipcode
	*/
	Page<AddressEntity> findByRoadContainingOrBuildingContaining(String addrSearch1, String addrSearch2, Pageable pageable) ; 
	
}
