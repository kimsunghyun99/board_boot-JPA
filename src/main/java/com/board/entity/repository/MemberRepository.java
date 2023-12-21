package com.board.entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {

	
	// 아이디찾기 select userid from tbl_member where username = #{username} and telno = #{telno}
	public Optional<MemberEntity> findByUsernameAndTelno(String username, String telno);
	
	
	
}
